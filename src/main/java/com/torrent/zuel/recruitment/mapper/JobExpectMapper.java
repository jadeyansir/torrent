package com.torrent.zuel.recruitment.mapper;

import com.github.wz2cool.dynamic.mybatis.mapper.DynamicQueryMapper;
import com.torrent.zuel.recruitment.model.entity.JobExpectDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 简历
 *
 * @author yan
 * @date 2021/12/17
 */
@Mapper
public interface JobExpectMapper extends DynamicQueryMapper<JobExpectDO> {
}
