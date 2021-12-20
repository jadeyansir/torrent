package com.torrent.zuel.recruitment.service;

import com.torrent.zuel.recruitment.model.dto.request.PublicDictRequestDTO;

import java.util.List;

/**
 * 字典表
 *
 * @author yan
 * @date 2021/12/12
 */
public interface PublicDictService {

    Integer addPublicDict(List<PublicDictRequestDTO> publicDictRequestDTOList);
}
