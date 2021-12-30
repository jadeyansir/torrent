package com.torrent.zuel.recruitment.service;

import com.torrent.zuel.recruitment.model.dto.ProjectHistoryDTO;
import com.torrent.zuel.recruitment.model.dto.response.EducationHistoryResponseDTO;
import com.torrent.zuel.recruitment.model.dto.response.JobExpectResponseDTO;
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

    Integer modifyJobExpect(Long id, Long stuUniCode, String jobName, Integer industryCode, String jobAddress,
                            Integer jobType, BigDecimal jobMinSalary, BigDecimal jobMaxSalary);

    Integer insertJobExpect(Long stuUniCode, String jobName, Integer industryCode,
                            String jobAddress, Integer jobType, BigDecimal jobMinSalary, BigDecimal jobMaxSalary);

    Integer deleteJobExpect(Long id);

    Integer modifyJobSearchStatus(Long stuUniCode, Integer JobSearchStatus);

    JobExpectResponseDTO getResume(Long stuUniCode);

    List<EducationHistoryResponseDTO> listEducationHistory(Long stuUniCode);

    Integer modifyEducationHistory(Long stuUniCode, Long id, Integer modifyType, Long collegeUniCode, String collegeChiName, Integer educationLevel,
                                   String educationField, Integer academicCertificates, Date educationBeginTime, Date educationEndTime);

    List<WorkHistoryResponseDTO> listWorkHistory(Long stuUniCode);

    Integer modifyWorkHistory(Long stuUniCode, Long id, Integer modifyType, Long comUniCode, String comChiName, Integer industryCode,
                              String jobDetail, Integer monthlySalary, Date jobWorkBeginTime, Date jobWorkEndTime);

    List<ProjectHistoryDTO> listProjectHistory(Long stuUniCode);

    Integer insertProjectHistory(Long stuUniCode, String projectName, Date projectBeginTime, Date projectEndTime, String projectDetail);

    Integer updateProjectHistory(Long id, Long stuUniCode, String projectName, Date projectBeginTime, Date projectEndTime, String projectDetail);

    Integer deleteProjectHistory(Long id);

    //    对专业技能的操作
    Integer insertProfessionalSkills(Long stuUniCode, String skillName, Integer useTime, Integer masteryLevel);

    Integer updateProfessionalSkills(Long id, Long stuUniCode, String skillName, Integer useTime, Integer masteryLevel);

    Integer deleteProfessionalSkills(Long id);
}
