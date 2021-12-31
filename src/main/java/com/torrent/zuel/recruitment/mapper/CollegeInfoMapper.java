package com.torrent.zuel.recruitment.mapper;

import com.github.wz2cool.dynamic.mybatis.mapper.DynamicQueryMapper;
import com.torrent.zuel.recruitment.model.entity.CollegeInfoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学校
 *
 * @author yan
 * @date 2021/12/31
 */
@Mapper
public interface CollegeInfoMapper extends DynamicQueryMapper<CollegeInfoDO> {
}
