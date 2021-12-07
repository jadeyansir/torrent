package com.torrent.zuel.recruitment.mapper;

import com.github.wz2cool.dynamic.mybatis.mapper.DynamicQueryMapper;
import com.torrent.zuel.recruitment.model.entity.PositionDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 岗位-数据库mapper
 *
 * @author yan
 * @date 2021/11/27
 */
@Mapper
public interface PositionDOMapper extends DynamicQueryMapper<PositionDO> {
}
