package com.torrent.zuel.recruitment.service.impl;

import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.dao.ProcessDAO;
import com.torrent.zuel.recruitment.model.dto.ProcessDTO;
import com.torrent.zuel.recruitment.model.entity.ProcessDO;
import com.torrent.zuel.recruitment.service.ProcessService;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 投递进度
 *
 * @author yan
 * @date 2021/12/7
 */
@Service
public class ProcessServiceImpl implements ProcessService {
    @Resource
    private ProcessDAO processDAO;

    @Override
    public PageInfo<ProcessDTO> listProcessDTO(Long stuUniCode, Integer processStatus, int pageNum, int pageSize) {
        if (!ObjectUtils.allNotNull(stuUniCode, processStatus)) {
            return new PageInfo<>();
        }
        PageInfo<ProcessDO> processDOPageInfo = processDAO.listProcess(stuUniCode, processStatus, pageNum, pageSize);
        List<ProcessDO> processDOList = processDOPageInfo.getList();
        List<ProcessDTO> processDTOList = BeanCopyUtils.copyList(processDOList, ProcessDTO.class);
        PageInfo<ProcessDTO> processDTOPageInfo = new PageInfo<>();
        processDTOPageInfo.setTotal(processDOPageInfo.getTotal());
        processDTOPageInfo.setPageSize(processDOPageInfo.getPageSize());
        processDTOPageInfo.setPageNum(processDOPageInfo.getPageNum());
        processDTOPageInfo.setList(processDTOList);
        return processDTOPageInfo;
    }
}
