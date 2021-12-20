package com.torrent.zuel.recruitment.service;

import com.torrent.zuel.recruitment.model.dto.internal.IndustryInfoDTO;
import com.torrent.zuel.recruitment.model.dto.request.IndustryInfoRequestDTO;
import com.torrent.zuel.recruitment.model.dto.response.IndustryTreeInfoResponseDTO;

import java.util.List;

/**
 * 行业服务
 *
 * @author yan
 * @date 2021/11/27
 */
public interface IndustryService {

    /**
     * 获取一级行业信息
     *
     * @return 行业发行量排行
     */
    List<IndustryInfoDTO> listIndustryLevelOneInfo();

    /**
     * 获取行业一级二级树形结构
     *
     * @return 行业信息
     */
    List<IndustryTreeInfoResponseDTO> listIndustryTreeLevelTwoInfo();

    /**
     * 刷新行业缓存信息
     *
     * @return 影响行数
     */
    Integer refreshIndustryInfo();

    Integer insertIndustry(List<IndustryInfoRequestDTO> industryInfoRequestDTO);

}
