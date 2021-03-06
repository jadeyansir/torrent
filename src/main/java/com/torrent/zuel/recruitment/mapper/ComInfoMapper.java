package com.torrent.zuel.recruitment.mapper;

import com.github.wz2cool.dynamic.mybatis.mapper.DynamicQueryMapper;
import com.torrent.zuel.recruitment.model.entity.ComInfoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 公司信息
 *
 * @author yan
 * @date 2021/11/26
 */
@Mapper
public interface ComInfoMapper extends DynamicQueryMapper<ComInfoDO> {
}
