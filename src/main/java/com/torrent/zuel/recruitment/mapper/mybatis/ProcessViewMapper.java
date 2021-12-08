package com.torrent.zuel.recruitment.mapper.mybatis;

import com.torrent.zuel.recruitment.model.entity.ProcessDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 进度
 *
 * @author yan
 * @date 2021/12/7
 */
@Mapper
public interface ProcessViewMapper {

    List<ProcessDO> listProcess(@Param("stuUniCode") Long stuUniCode, @Param("processStatus") int processStatus);

}
