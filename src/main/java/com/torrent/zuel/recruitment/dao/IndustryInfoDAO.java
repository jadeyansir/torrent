package com.torrent.zuel.recruitment.dao;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.enums.DeletedEnum;
import com.torrent.zuel.recruitment.mapper.IndustryInfoMapper;
import com.torrent.zuel.recruitment.model.bo.IndustryInfoBO;
import com.torrent.zuel.recruitment.model.entity.IndustryInfoDO;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.isEqual;

/**
 * 行业信息DAO
 *
 * @author yan
 * @date 2021/11/27
 **/
@Repository
public class IndustryInfoDAO {

    @Resource
    private IndustryInfoMapper industryInfoMapper;

    /**
     * 获取行业信息列表
     *
     * @return 行业信息返回
     */
    public List<IndustryInfoDO> listIndustryDO() {
        DynamicQuery<IndustryInfoDO> dynamicQuery = DynamicQuery.createQuery(IndustryInfoDO.class)
                .and(IndustryInfoDO::getDeleted, isEqual(DeletedEnum.NOT_DELETE.getValue()));
        return industryInfoMapper.selectByDynamicQuery(dynamicQuery);
    }

    /**
     * 获取有效的行业数据
     *
     * @return 行业信息列表
     */
    public List<IndustryInfoBO> listIndustryInfoLevelOneBO() {
        DynamicQuery<IndustryInfoDO> dynamicQuery = DynamicQuery.createQuery(IndustryInfoDO.class)
                .select(IndustryInfoDO::getIndustryCategoryCode, IndustryInfoDO::getIndustryCategoryName, IndustryInfoDO::getIndustryCode)
                .and(IndustryInfoDO::getIndustryCategoryCode, isEqual(0))
                .and(IndustryInfoDO::getDeleted, isEqual(DeletedEnum.NOT_DELETE.getValue()));
        List<IndustryInfoDO> industryInfoDOS = industryInfoMapper.selectByDynamicQuery(dynamicQuery);
        industryInfoDOS.sort(Comparator.comparing(IndustryInfoDO::getIndustryCode));
        return BeanCopyUtils.copyList(industryInfoDOS, IndustryInfoBO.class);
    }

    /**
     * 获取有效的行业数据
     *
     * @return 行业信息列表
     */
    public List<IndustryInfoBO> listIndustryInfoBO() {
        DynamicQuery<IndustryInfoDO> dynamicQuery = DynamicQuery.createQuery(IndustryInfoDO.class)
                .select(IndustryInfoDO::getIndustryCategoryCode, IndustryInfoDO::getIndustryCategoryName, IndustryInfoDO::getIndustryCode)
                .and(IndustryInfoDO::getDeleted, isEqual(DeletedEnum.NOT_DELETE.getValue()));
        List<IndustryInfoDO> industryInfoDOS = industryInfoMapper.selectByDynamicQuery(dynamicQuery);
        return BeanCopyUtils.copyList(industryInfoDOS, IndustryInfoBO.class);
    }

    public Integer insertIndustry(List<IndustryInfoDO> industryInfoDOList) {
        int effectRows = 0;
        if (CollectionUtils.isEmpty(industryInfoDOList)) {
            return effectRows;
        }

        for (IndustryInfoDO industryInfoDO : industryInfoDOList) {
            effectRows += industryInfoMapper.insertSelective(industryInfoDO);
        }
        return effectRows;
    }

    public Optional<IndustryInfoDO> getIndustryByIndustryCode(Integer industryCode) {
        if (Objects.isNull(industryCode)) {
            return Optional.empty();
        }
        DynamicQuery<IndustryInfoDO> query = DynamicQuery.createQuery(IndustryInfoDO.class)
                .and(IndustryInfoDO::getIndustryCode, isEqual(industryCode));
        return industryInfoMapper.selectFirstByDynamicQuery(query);
    }

}
