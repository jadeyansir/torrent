package com.torrent.zuel.recruitment.mapper.mybatis;

import com.torrent.zuel.recruitment.model.entity.ProjectHistoryDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ProjectHistoryMapper
 *
 * @author yan
 * @date 2021/12/20
 */
@Mapper
public interface ProjectHistoryMapper {
    List<ProjectHistoryDO> listProjectHistory(@Param("stuUniCode") Long stuUniCode);

    Integer insertProjectHistory(ProjectHistoryDO projectHistoryDO);

    Integer updateProjectHistory(ProjectHistoryDO projectHistoryDO);

    Integer deleteProjectHistory(Long id);
}
