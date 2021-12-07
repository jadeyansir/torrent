package com.torrent.zuel.recruitment.dao;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.mapper.ComInfoMapper;
import com.torrent.zuel.recruitment.model.entity.ComInfoDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.in;

/**
 * 公司信息
 *
 * @author yan
 * @date 2021/11/27
 */
@Repository
public class ComInfoDAO {

    @Resource
    private ComInfoMapper comInfoMapper;

    /**
     * 获取公司信息
     *
     * @param comUniCodeList 公司编码
     * @return 公司信息
     */
    public List<ComInfoDO> listComInfoDO(List<Long> comUniCodeList) {
        DynamicQuery<ComInfoDO> query = DynamicQuery.createQuery(ComInfoDO.class)
                .and(ComInfoDO::getComUniCode, in(comUniCodeList));
        return comInfoMapper.selectByDynamicQuery(query);
    }
}
