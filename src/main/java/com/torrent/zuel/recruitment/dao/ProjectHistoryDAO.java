package com.torrent.zuel.recruitment.dao;

import com.torrent.zuel.recruitment.mapper.mybatis.ProjectHistoryMapper;
import com.torrent.zuel.recruitment.model.entity.ProjectHistoryDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * projectHistory
 *
 * @author yan
 * @date 2021/12/20
 */
@Repository
public class ProjectHistoryDAO {

    @Resource
    private ProjectHistoryMapper projectHistoryMapper;

    public List<ProjectHistoryDO> listProjectHistory(Long stuUniCode) {
        return projectHistoryMapper.listProjectHistory(stuUniCode);
    }

    public Integer insertProjectHistory(ProjectHistoryDO projectHistoryDO) {
        return projectHistoryMapper.insertProjectHistory(projectHistoryDO);
    }

    public Integer updateProjectHistory(ProjectHistoryDO projectHistoryDO) {
        return projectHistoryMapper.updateProjectHistory(projectHistoryDO);
    }

    public Integer deleteProjectHistory(Long id) {
        return projectHistoryMapper.deleteProjectHistory(id);
    }
}
