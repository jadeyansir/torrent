package com.torrent.zuel.recruitment.service.impl;

import com.google.common.collect.Lists;
import com.torrent.zuel.recruitment.dao.IndustryInfoDAO;
import com.torrent.zuel.recruitment.enums.IndustryLevelEnum;
import com.torrent.zuel.recruitment.model.dto.internal.IndustryInfoDTO;
import com.torrent.zuel.recruitment.model.dto.response.IndustryTreeInfoResponseDTO;
import com.torrent.zuel.recruitment.model.entity.IndustryInfoDO;
import com.torrent.zuel.recruitment.service.IndustryService;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 行业服务
 *
 * @author yan
 * @date 2021/11/27
 */
@Service
public class IndustryServiceImpl implements IndustryService, InitializingBean {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private IndustryInfoDAO industryInfoDAO;
    /**
     * 行业信息基本不会变，存放在JVM中
     */
    private List<IndustryInfoDO> industryInfoDOCacheList;
    /**
     * 行业树形结构根节点编号
     */
    private static final long INDUSTRY_ROOT_CODE = 0;
    /**
     * 行业树形结构根节点名称
     */
    private static final String INDUSTRY_ROOT_NAME = "全部行业";

    @Override
    public void afterPropertiesSet() throws Exception {
        refreshIndustryInfo();
    }

    @Override
    public List<IndustryInfoDTO> listIndustryLevelOneInfo() {
        List<IndustryInfoDO> levelOneIndustryInfo = listIndustryInfoDO().stream()
                .filter(x -> Objects.equals(x.getInduLevel(), IndustryLevelEnum.LEVEL_ONE.getValue()))
                .collect(Collectors.toList());
        return BeanCopyUtils.copyList(levelOneIndustryInfo, IndustryInfoDTO.class);
    }

    @Override
    public IndustryTreeInfoResponseDTO listIndustryTreeLevelTwoInfo() {
        Map<Long, List<IndustryInfoDO>> areaInfoMap = listIndustryInfoDO().stream()
                .filter(x -> Objects.equals(x.getInduLevel(), IndustryLevelEnum.LEVEL_ONE.getValue()) ||
                        Objects.equals(x.getInduLevel(), IndustryLevelEnum.LEVEL_TWO.getValue()))
                .collect(Collectors.groupingBy(IndustryInfoDO::getParentCode));
        return getIndustryTreeInfo(INDUSTRY_ROOT_CODE, INDUSTRY_ROOT_NAME, areaInfoMap);
    }

    private IndustryTreeInfoResponseDTO getIndustryTreeInfo(
            Long induUniCode, String induName, Map<Long, List<IndustryInfoDO>> industryInfoMap) {
        List<IndustryInfoDO> industryInfoDOList =
                industryInfoMap.getOrDefault(induUniCode, Collections.emptyList());
        IndustryTreeInfoResponseDTO responseDTO = new IndustryTreeInfoResponseDTO();
        responseDTO.setInduUniCode(induUniCode);
        responseDTO.setInduName(induName);

        // 递归出口
        if (CollectionUtils.isEmpty(industryInfoDOList)) {
            responseDTO.setChildInfoList(Collections.emptyList());
            return responseDTO;
        }
        // 递归处理嵌套
        List<IndustryTreeInfoResponseDTO> childResponseDTOList = Lists.newArrayListWithExpectedSize(industryInfoDOList.size());
        for (IndustryInfoDO industryInfoDO : industryInfoDOList) {
            IndustryTreeInfoResponseDTO industryTreeInfo =
                    getIndustryTreeInfo(industryInfoDO.getInduUniCode(), industryInfoDO.getInduName(), industryInfoMap);
            childResponseDTOList.add(industryTreeInfo);
        }
        responseDTO.setChildInfoList(childResponseDTOList);
        return responseDTO;
    }

    @Override
    public Integer refreshIndustryInfo() {
        this.industryInfoDOCacheList = industryInfoDAO.listIndustryDO();
        return this.industryInfoDOCacheList.size();
    }

    private List<IndustryInfoDO> listIndustryInfoDO() {
        if (CollectionUtils.isEmpty(this.industryInfoDOCacheList)) {
            this.industryInfoDOCacheList = industryInfoDAO.listIndustryDO();
            logger.warn("listIndustryInfoDO, read db");
        }
        return Lists.newArrayList(this.industryInfoDOCacheList);
    }
}
