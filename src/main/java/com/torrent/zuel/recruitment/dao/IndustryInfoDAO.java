package com.torrent.zuel.recruitment.dao;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.enums.DeletedEnum;
import com.torrent.zuel.recruitment.mapper.IndustryInfoMapper;
import com.torrent.zuel.recruitment.model.bo.IndustryInfoBO;
import com.torrent.zuel.recruitment.model.entity.IndustryInfoDO;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;

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
                .select(IndustryInfoDO::getInduUniCode, IndustryInfoDO::getInduName, IndustryInfoDO::getParentCode)
                .and(IndustryInfoDO::getParentCode, isEqual(0L))
                .and(IndustryInfoDO::getDeleted, isEqual(DeletedEnum.NOT_DELETE.getValue()));
        List<IndustryInfoDO> industryInfoDOS = industryInfoMapper.selectByDynamicQuery(dynamicQuery);
        industryInfoDOS.sort(Comparator.comparing(IndustryInfoDO::getInduUniCode));
        return BeanCopyUtils.copyList(industryInfoDOS, IndustryInfoBO.class);
    }

    /**
     * 获取有效的行业数据
     *
     * @return 行业信息列表
     */
    public List<IndustryInfoBO> listIndustryInfoBO() {
        DynamicQuery<IndustryInfoDO> dynamicQuery = DynamicQuery.createQuery(IndustryInfoDO.class)
                .select(IndustryInfoDO::getInduUniCode, IndustryInfoDO::getInduName, IndustryInfoDO::getParentCode)
                .and(IndustryInfoDO::getDeleted, isEqual(DeletedEnum.NOT_DELETE.getValue()));
        List<IndustryInfoDO> industryInfoDOS = industryInfoMapper.selectByDynamicQuery(dynamicQuery);
        return BeanCopyUtils.copyList(industryInfoDOS, IndustryInfoBO.class);
    }


}
