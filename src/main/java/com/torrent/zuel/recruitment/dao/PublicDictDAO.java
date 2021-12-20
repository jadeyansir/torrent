package com.torrent.zuel.recruitment.dao;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.mapper.PublicDictMapper;
import com.torrent.zuel.recruitment.model.entity.PublicDictDO;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.in;
import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.isEqual;

/**
 * PublicDict
 *
 * @author yan
 * @date 2021/12/12
 */
@Repository
public class PublicDictDAO {

    @Resource
    private PublicDictMapper publicDictMapper;

    public List<PublicDictDO> publicDictDOList(List<Integer> parameterSystemCodeList) {
        DynamicQuery<PublicDictDO> query = DynamicQuery.createQuery(PublicDictDO.class)
                .and(CollectionUtils.isNotEmpty(parameterSystemCodeList), PublicDictDO::getParameterSystemCode
                        , in(parameterSystemCodeList));
        return publicDictMapper.selectByDynamicQuery(query);
    }

    public Integer addPublicDict(List<PublicDictDO> publicDictDOList) {
        int effectRows = 0;
        if (CollectionUtils.isEmpty(publicDictDOList)) {
            return effectRows;
        }
        for (PublicDictDO publicDictDO : publicDictDOList) {
            DynamicQuery<PublicDictDO> query = DynamicQuery.createQuery(PublicDictDO.class)
                    .and(PublicDictDO::getParameterCode, isEqual(publicDictDO.getParameterCode()))
                    .and(PublicDictDO::getParameterSystemCode, isEqual(publicDictDO.getParameterSystemCode()));
            Optional<PublicDictDO> publicDictDOOptional = publicDictMapper.selectFirstByDynamicQuery(query);
            if (publicDictDOOptional.isPresent()) {
                effectRows += publicDictMapper.updateSelectiveByDynamicQuery(publicDictDO, query);
            } else {
                effectRows += publicDictMapper.insertSelective(publicDictDO);
            }
        }
        return effectRows;
    }
}
