package com.torrent.zuel.recruitment.mapper;

import com.github.wz2cool.dynamic.mybatis.mapper.DynamicQueryMapper;
import com.torrent.zuel.recruitment.model.entity.StudentInfoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * student
 *
 * @author yan
 * @date 2021/12/16
 */
@Mapper
public interface StudentInfoMapper extends DynamicQueryMapper<StudentInfoDO> {
}
