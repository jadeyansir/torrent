package com.torrent.zuel.recruitment.service;

import com.torrent.zuel.recruitment.model.dto.ProjectHistoryDTO;
import com.torrent.zuel.recruitment.model.dto.response.EducationHistoryResponseDTO;
import com.torrent.zuel.recruitment.model.dto.response.ResumeResponseDTO;
import com.torrent.zuel.recruitment.model.dto.response.WorkHistoryResponseDTO;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 * 简历
 *
 * @author yan
 * @date 2021/12/17
 */
public interface ResumeService {

    Integer modifyJobExpect(Long stuUniCode, String jobName, Integer industryCode, String jobAddress,
                            Integer jobType, BigDecimal jobMinSalary, BigDecimal jobMaxSalary);

    Integer modifyJobSearchStatus(Long stuUniCode, Integer JobSearchStatus);

    ResumeResponseDTO getResume(Long stuUniCode);

    List<EducationHistoryResponseDTO> listEducationHistory(Long stuUniCode);

    Integer modifyEducationHistory(Long stuUniCode, Long id, Integer modifyType, Long collegeUniCode, String collegeChiName, Integer educationLevel,
                                   String educationField, Integer academicCertificates, Date educationBeginTime, Date educationEndTime);

    List<WorkHistoryResponseDTO> listWorkHistory(Long stuUniCode);

    Integer modifyWorkHistory(Long stuUniCode, Long id, Integer modifyType, Long comUniCode, String comChiName, Integer industryCode,
                              String jobDetail, Integer monthlySalary, Date jobWorkBeginTime, Date jobWorkEndTime);

    List<ProjectHistoryDTO> listProjectHistory(Long stuUniCode);

    Integer insertProjectHistory(Long stuUniCode, String projectName, Date projectBeginTime, Date projectEndTime, String projectDetail);
}
