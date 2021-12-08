package com.torrent.zuel.recruitment.service;

import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.model.dto.ProcessDTO;

/**
 * 进度
 *
 * @author yan
 * @date 2021/12/7
 */
public interface ProcessService {
    PageInfo<ProcessDTO> listProcessDTO(Long stuUniCode, Integer processStatus, int pageNum, int pageSize);
}
