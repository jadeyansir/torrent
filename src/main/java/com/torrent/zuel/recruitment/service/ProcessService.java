package com.torrent.zuel.recruitment.service;

import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.model.dto.ContractDTO;
import com.torrent.zuel.recruitment.model.dto.response.DeliverResponseDTO;

/**
 * 进度
 *
 * @author yan
 * @date 2021/12/7
 */
public interface ProcessService {
    PageInfo<DeliverResponseDTO> listDeliverDTO(Long stuUniCode, Integer deliverStatus, int pageNum, int pageSize);

    PageInfo<ContractDTO> listContractDTO(Long stuUniCode, Integer contractStatus, int pageNum, int pageSize);
}
