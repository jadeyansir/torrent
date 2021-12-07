package com.torrent.zuel.recruitment.service;

import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.model.dto.request.PositionRequestDTO;
import com.torrent.zuel.recruitment.model.dto.response.PositionResponseDTO;

/**
 * 岗位业务层
 *
 * @author yan
 * @date 2021/11/27
 */
public interface PositionService {
    /**
     * 分页获取岗位信息
     *
     * @param positionRequestDTO positionRequestDTO
     * @return PositionDTO
     */
    PageInfo<PositionResponseDTO> listPositionByPaging(PositionRequestDTO positionRequestDTO);
}
