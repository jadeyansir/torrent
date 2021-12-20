package com.torrent.zuel.recruitment.service.impl;

import com.google.common.collect.Lists;
import com.torrent.zuel.recruitment.dao.IndustryInfoDAO;
import com.torrent.zuel.recruitment.enums.IndustryLevelEnum;
import com.torrent.zuel.recruitment.model.dto.internal.IndustryInfoDTO;
import com.torrent.zuel.recruitment.model.dto.request.IndustryInfoRequestDTO;
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

    @Override
    public void afterPropertiesSet() throws Exception {
        refreshIndustryInfo();
    }

    @Override
    public List<IndustryInfoDTO> listIndustryLevelOneInfo() {
        List<IndustryInfoDO> levelOneIndustryInfo = listIndustryInfoDO().stream()
                .filter(x -> Objects.equals(x.getIndustryLevel(), IndustryLevelEnum.LEVEL_ONE.getValue()))
                .collect(Collectors.toList());
        return BeanCopyUtils.copyList(levelOneIndustryInfo, IndustryInfoDTO.class);
    }

    @Override
    public List<IndustryTreeInfoResponseDTO> listIndustryTreeLevelTwoInfo() {
        Map<Integer, List<IndustryInfoDO>> areaInfoMap = listIndustryInfoDO().stream()
                .filter(x -> Objects.equals(x.getIndustryLevel(), IndustryLevelEnum.LEVEL_ONE.getValue()) ||
                        Objects.equals(x.getIndustryLevel(), IndustryLevelEnum.LEVEL_TWO.getValue()))
                .collect(Collectors.groupingBy(IndustryInfoDO::getIndustryCategoryCode));
        List<IndustryTreeInfoResponseDTO> responseDTOList = Lists.newArrayList();
        for (Map.Entry<Integer, List<IndustryInfoDO>> integerListEntry : areaInfoMap.entrySet()) {
            IndustryTreeInfoResponseDTO responseDTO = new IndustryTreeInfoResponseDTO();
            List<IndustryInfoDO> industryInfoDOList = integerListEntry.getValue();
            List<IndustryTreeInfoResponseDTO> industryTreeInfoResponseDTOList = Lists.newArrayList();
            for (IndustryInfoDO industryInfoDO : industryInfoDOList) {
                if (Objects.equals(IndustryLevelEnum.LEVEL_ONE.getValue(), industryInfoDO.getIndustryLevel())) {
                    responseDTO.setIndustryCode(industryInfoDO.getIndustryCategoryCode());
                    responseDTO.setIndustryName(industryInfoDO.getIndustryCategoryName());
                    continue;
                }
                IndustryTreeInfoResponseDTO industryTreeInfoResponseDTO = new IndustryTreeInfoResponseDTO();
                industryTreeInfoResponseDTO.setIndustryCode(industryInfoDO.getIndustryCode());
                industryTreeInfoResponseDTO.setIndustryName(industryInfoDO.getIndustryName());
                industryTreeInfoResponseDTOList.add(industryTreeInfoResponseDTO);
            }
            responseDTO.setChildInfoList(industryTreeInfoResponseDTOList);
            responseDTOList.add(responseDTO);
        }
        return responseDTOList;
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

    @Override
    public Integer insertIndustry(List<IndustryInfoRequestDTO> industryInfoRequestDTOList) {
        if (CollectionUtils.isEmpty(industryInfoRequestDTOList)) {
            return 0;
        }
        List<IndustryInfoDO> industryInfoDOList = industryInfoRequestDTOList.stream().map(x -> {
            IndustryInfoDO industryInfoDO = BeanCopyUtils.copyProperties(x, IndustryInfoDO.class);
            if (Objects.equals(x.getIndustryCategoryCode(), x.getIndustryCode())) {
                industryInfoDO.setIndustryLevel(IndustryLevelEnum.LEVEL_ONE.getValue());
            } else {
                industryInfoDO.setIndustryLevel(IndustryLevelEnum.LEVEL_TWO.getValue());
            }
            return industryInfoDO;
        }).collect(Collectors.toList());
        return industryInfoDAO.insertIndustry(industryInfoDOList);
    }
}
