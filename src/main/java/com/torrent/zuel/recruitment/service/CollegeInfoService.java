package com.torrent.zuel.recruitment.service;

import com.torrent.zuel.recruitment.model.dto.response.CollegeInfoResponseDTO;

import java.util.List;

/**
 * 学校
 *
 * @author yan
 * @date 2021/12/31
 */
public interface CollegeInfoService {

    List<CollegeInfoResponseDTO> listCollegeInfoResponseDTO();
}
