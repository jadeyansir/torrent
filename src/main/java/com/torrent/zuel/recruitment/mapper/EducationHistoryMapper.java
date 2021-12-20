package com.torrent.zuel.recruitment.mapper;

import com.github.wz2cool.dynamic.mybatis.mapper.DynamicQueryMapper;
import com.torrent.zuel.recruitment.model.entity.EducationHistoryDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 教育经历
 *
 * @author yan
 * @date 2021/12/17
 */
@Mapper
public interface EducationHistoryMapper extends DynamicQueryMapper<EducationHistoryDO> {
}
