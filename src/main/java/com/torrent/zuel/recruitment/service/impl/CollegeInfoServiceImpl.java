package com.torrent.zuel.recruitment.service.impl;

import com.torrent.zuel.recruitment.dao.CollegeInfoDAO;
import com.torrent.zuel.recruitment.model.dto.response.CollegeInfoResponseDTO;
import com.torrent.zuel.recruitment.service.CollegeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 学校
 *
 * @author yan
 * @date 2021/12/31
 */
@Service
public class CollegeInfoServiceImpl implements CollegeInfoService {

    @Resource
    private CollegeInfoDAO collegeInfoDAO;

    @Override
    public List<CollegeInfoResponseDTO> listCollegeInfoResponseDTO() {
        return collegeInfoDAO.listCollegeInfoResponseDTO().stream().distinct().collect(Collectors.toList());
    }
}
