package com.torrent.zuel.recruitment.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.mapper.mybatis.ProcessViewMapper;
import com.torrent.zuel.recruitment.model.entity.ProcessDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * 进度
 *
 * @author yan
 * @date 2021/12/7
 */
@Repository
public class ProcessDAO {
    @Resource
    private ProcessViewMapper processViewMapper;

    public PageInfo<ProcessDO> listProcess(Long stuUniCode, int processStatus, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ProcessDO> processDOList = processViewMapper.listProcess(stuUniCode, processStatus);
        return new PageInfo<>(processDOList);
    }

}
