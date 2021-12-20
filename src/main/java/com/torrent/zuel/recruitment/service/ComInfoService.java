package com.torrent.zuel.recruitment.service;

import com.torrent.zuel.recruitment.model.dto.response.ComInfoResponseDTO;

import java.util.List;

/**
 * 公司信息
 *
 * @author yan
 * @date 2021/12/17
 */
public interface ComInfoService {

    List<ComInfoResponseDTO> listComInfoByComChiName(String ComChiName);
}
