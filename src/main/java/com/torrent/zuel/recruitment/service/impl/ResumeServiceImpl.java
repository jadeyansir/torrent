package com.torrent.zuel.recruitment.service.impl;

import com.google.common.collect.Lists;
import com.torrent.zuel.recruitment.dao.*;
import com.torrent.zuel.recruitment.model.dto.ProjectHistoryDTO;
import com.torrent.zuel.recruitment.model.dto.response.EducationHistoryResponseDTO;
import com.torrent.zuel.recruitment.model.dto.response.JobExpectResponseDTO;
import com.torrent.zuel.recruitment.model.dto.response.WorkHistoryResponseDTO;
import com.torrent.zuel.recruitment.model.entity.*;
import com.torrent.zuel.recruitment.service.ResumeService;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * 简历
 *
 * @author yan
 * @date 2021/12/17
 */
@Service
public class ResumeServiceImpl implements ResumeService {

    @Resource
    private JobExpectDAO jobExpectDAO;

    @Resource
    private IndustryInfoDAO industryInfoDAO;

    @Resource
    private EducationHistoryDAO educationHistoryDAO;

    @Resource
    private WorkHistoryDAO workHistoryDAO;

    @Resource
    private ProjectHistoryDAO projectHistoryDAO;

    @Resource
    private ProfessionalSkillsDAO professionalSkillsDAO;

    @Resource
    private StudentOfficerDAO studentOfficerDAO;

    @Override
    public Integer modifyJobExpect(Long id, Long stuUniCode, String jobName, Integer industryCode,
                                   String jobAddress, Integer jobType, BigDecimal jobMinSalary, BigDecimal jobMaxSalary) {
        if (Objects.isNull(id)) {
            return 0;
        }
        JobExpectDO jobExpectDO = new JobExpectDO();
        jobExpectDO.setId(id);
        jobExpectDO.setStuUniCode(stuUniCode);
        jobExpectDO.setJobName(jobName);
        Optional<IndustryInfoDO> industryInfoDOOptional = industryInfoDAO.getIndustryByIndustryCode(industryCode);
        industryInfoDOOptional.ifPresent(x -> {
            jobExpectDO.setIndustryName(x.getIndustryName());
        });
        jobExpectDO.setJobAddress(jobAddress);
        jobExpectDO.setJobType(jobType);
        jobExpectDO.setJobMaxSalary(jobMaxSalary);
        jobExpectDO.setJobMinSalary(jobMinSalary);
        return jobExpectDAO.modifyJobExpect(jobExpectDO);
    }


    @Override
    public Integer insertJobExpect(Long stuUniCode, String jobName, Integer industryCode,
                                   String jobAddress, Integer jobType, BigDecimal jobMinSalary, BigDecimal jobMaxSalary) {
        JobExpectDO jobExpectDO = new JobExpectDO();
        jobExpectDO.setStuUniCode(stuUniCode);
        jobExpectDO.setJobName(jobName);
        Optional<IndustryInfoDO> industryInfoDOOptional = industryInfoDAO.getIndustryByIndustryCode(industryCode);
        industryInfoDOOptional.ifPresent(x -> {
            jobExpectDO.setIndustryName(x.getIndustryName());
        });
        jobExpectDO.setJobAddress(jobAddress);
        jobExpectDO.setJobType(jobType);
        jobExpectDO.setJobMaxSalary(jobMaxSalary);
        jobExpectDO.setJobMinSalary(jobMinSalary);
        return jobExpectDAO.insertJobExpect(jobExpectDO);
    }

    @Override
    public Integer deleteJobExpect(Long id) {
        if (Objects.isNull(id)) {
            return 0;
        }
        return jobExpectDAO.deleteJobExpect(id);
    }

    @Override
    public Integer getJobSearchStatus(Long stuUniCode) {
        if (Objects.isNull(stuUniCode)) {
            return null;
        }
        List<JobExpectDO> jobExpectDOList = jobExpectDAO.getJobExpectByStuUniCode(stuUniCode);
        if (CollectionUtils.isNotEmpty(jobExpectDOList)) {
            return jobExpectDOList.get(0).getJobSearchStatus();
        }
        return null;
    }

    @Override
    public Integer modifyJobSearchStatus(Long stuUniCode, Integer JobSearchStatus) {
        if (Objects.isNull(stuUniCode)) {
            return 0;
        }
        JobExpectDO jobExpectDO = new JobExpectDO();
        jobExpectDO.setStuUniCode(stuUniCode);
        jobExpectDO.setJobSearchStatus(JobSearchStatus);
        return jobExpectDAO.modifyJobExpect(jobExpectDO);
    }

    @Override
    public String getSelfEvaluation(Long stuUniCode) {
        if (Objects.isNull(stuUniCode)) {
            return null;
        }
        List<JobExpectDO> jobExpectDOList = jobExpectDAO.getJobExpectByStuUniCode(stuUniCode);
        if (CollectionUtils.isNotEmpty(jobExpectDOList)) {
            return jobExpectDOList.get(0).getSelfEvaluation();
        }
        return null;
    }

    @Override
    public Integer modifySelfEvaluation(Long stuUniCode, String selfEvaluation) {
        if (Objects.isNull(stuUniCode)) {
            return 0;
        }
        JobExpectDO jobExpectDO = new JobExpectDO();
        jobExpectDO.setStuUniCode(stuUniCode);
        jobExpectDO.setSelfEvaluation(selfEvaluation);
        return jobExpectDAO.modifyJobExpect(jobExpectDO);
    }

    @Override
    public List<JobExpectResponseDTO> listJobExpect(Long stuUniCode) {
        if (Objects.isNull(stuUniCode)) {
            return Lists.newArrayList();
        }
        List<JobExpectDO> jobExpectDOList = jobExpectDAO.getJobExpectByStuUniCode(stuUniCode);
        if (CollectionUtils.isNotEmpty(jobExpectDOList)) {
            return BeanCopyUtils.copyList(jobExpectDOList, JobExpectResponseDTO.class);
        }
        return Lists.newArrayList();
    }

    @Override
    public List<EducationHistoryResponseDTO> listEducationHistory(Long stuUniCode) {
        if (Objects.isNull(stuUniCode)) {
            return Lists.newArrayList();
        }
        List<EducationHistoryDO> educationHistoryDOList = educationHistoryDAO.listEducationHistoryDO(stuUniCode);
        return BeanCopyUtils.copyList(educationHistoryDOList, EducationHistoryResponseDTO.class);
    }

    @Override
    public Integer modifyEducationHistory(Long stuUniCode, Long id, Integer modifyType, Long collegeUniCode, String collegeChiName, Integer educationLevel,
                                          String educationField, Integer academicCertificates, Date educationBeginTime, Date educationEndTime) {
        if (!ObjectUtils.allNotNull(stuUniCode, id)) {
            return 0;
        }
        EducationHistoryDO educationHistoryDO = new EducationHistoryDO();
        educationHistoryDO.setStuUniCode(stuUniCode);
        educationHistoryDO.setId(id);
        educationHistoryDO.setCollegeUniCode(collegeUniCode);
        educationHistoryDO.setCollegeChiName(collegeChiName);
        educationHistoryDO.setEducationLevel(educationLevel);
        educationHistoryDO.setEducationField(educationField);
        educationHistoryDO.setAcademicCertificates(academicCertificates);
        educationHistoryDO.setEducationBeginTime(educationBeginTime);
        educationHistoryDO.setEducationEndTime(educationEndTime);
        return educationHistoryDAO.modifyEducationHistoryDO(modifyType, educationHistoryDO);
    }

    @Override
    public List<WorkHistoryResponseDTO> listWorkHistory(Long stuUniCode) {
        if (Objects.isNull(stuUniCode)) {
            return Lists.newArrayList();
        }
        List<WorkHistoryDO> workHistoryDOList = workHistoryDAO.listWorkHistoryDO(stuUniCode);
        return BeanCopyUtils.copyList(workHistoryDOList, WorkHistoryResponseDTO.class);
    }

    @Override
    public Integer modifyWorkHistory(Long stuUniCode, Long id, Integer modifyType, Long comUniCode, String comChiName, Integer industryCode,
                                     String jobDetail, Integer monthlySalary, Date jobWorkBeginTime, Date jobWorkEndTime) {
        if (!ObjectUtils.allNotNull(stuUniCode, id)) {
            return 0;
        }
        WorkHistoryDO workHistoryDO = new WorkHistoryDO();
        workHistoryDO.setId(id);
        workHistoryDO.setStuUniCode(stuUniCode);
        workHistoryDO.setComUniCode(comUniCode);
        workHistoryDO.setComChiName(comChiName);
        workHistoryDO.setIndustryCode(industryCode);
        workHistoryDO.setJobDetail(jobDetail);
        workHistoryDO.setMonthlySalary(monthlySalary);
        workHistoryDO.setJobWorkBeginTime(jobWorkBeginTime);
        workHistoryDO.setJobWorkEndTime(jobWorkEndTime);
        return workHistoryDAO.modifyWorkHistoryDO(modifyType, workHistoryDO);
    }

    @Override
    public List<ProjectHistoryDTO> listProjectHistory(Long stuUniCode) {
        List<ProjectHistoryDO> projectHistoryDOList = projectHistoryDAO.listProjectHistory(stuUniCode);
        List<ProjectHistoryDTO> projectHistoryDTOList = BeanCopyUtils.copyList(projectHistoryDOList, ProjectHistoryDTO.class);
        return projectHistoryDTOList;
    }

    @Override
    public Integer insertProjectHistory(Long stuUniCode, String projectName, Date projectBeginTime, Date projectEndTime, String projectDetail) {
        ProjectHistoryDO projectHistoryDO = new ProjectHistoryDO();
        projectHistoryDO.setStuUniCode(stuUniCode);
        projectHistoryDO.setProjectName(projectName);
        projectHistoryDO.setProjectBeginTime(projectBeginTime);
        projectHistoryDO.setProjectEndTime(projectEndTime);
        projectHistoryDO.setProjectDetail(projectDetail);
        Integer integer = projectHistoryDAO.insertProjectHistory(projectHistoryDO);
        return integer;
    }

    @Override
    public Integer updateProjectHistory(Long id, Long stuUniCode, String projectName, Date projectBeginTime, Date projectEndTime, String projectDetail) {
        ProjectHistoryDO projectHistoryDO = new ProjectHistoryDO();
        projectHistoryDO.setId(id);
        projectHistoryDO.setStuUniCode(stuUniCode);
        projectHistoryDO.setProjectName(projectName);
        projectHistoryDO.setProjectBeginTime(projectBeginTime);
        projectHistoryDO.setProjectEndTime(projectEndTime);
        projectHistoryDO.setProjectDetail(projectDetail);
        Integer integer = projectHistoryDAO.updateProjectHistory(projectHistoryDO);
        return integer;
    }

    @Override
    public Integer deleteProjectHistory(Long id) {
        Integer integer = projectHistoryDAO.deleteProjectHistory(id);
        return integer;
    }

    //    对专业技能的操作
    @Override
    public Integer insertProfessionalSkills(Long stuUniCode, String skillName, Integer useTime, Integer masteryLevel) {
        ProfessionalSkillsDO professionalSkillsDO = new ProfessionalSkillsDO();
        professionalSkillsDO.setStuUniCode(stuUniCode);
        professionalSkillsDO.setSkillName(skillName);
        professionalSkillsDO.setUseTime(useTime);
        professionalSkillsDO.setMasteryLevel(masteryLevel);
        Integer integer = professionalSkillsDAO.insertProfessionalSkills(professionalSkillsDO);
        return integer;
    }

    @Override
    public Integer updateProfessionalSkills(Long id, Long stuUniCode, String skillName, Integer useTime, Integer masteryLevel) {
        ProfessionalSkillsDO professionalSkillsDO = new ProfessionalSkillsDO();
        professionalSkillsDO.setId(id);
        professionalSkillsDO.setStuUniCode(stuUniCode);
        professionalSkillsDO.setSkillName(skillName);
        professionalSkillsDO.setUseTime(useTime);
        professionalSkillsDO.setMasteryLevel(masteryLevel);
        Integer integer = professionalSkillsDAO.updateProfessionalSkills(professionalSkillsDO);
        return integer;
    }

    @Override
    public Integer deleteProfessionalSkills(Long id) {
        Integer integer = professionalSkillsDAO.deleteProfessionalSkills(id);
        return integer;
    }

    //对学生干部经历的操作
    @Override
    public Integer insertStudentOfficer(Long id,Long stuUniCode, String officerName, Date serveBeginTime, Date serveEndTime) {
        StudentOfficerDO studentOfficerDO=new StudentOfficerDO();
        studentOfficerDO.setId(id);
        studentOfficerDO.setStuUniCode(stuUniCode);
        studentOfficerDO.setOfficerName(officerName);
        studentOfficerDO.setServeBeginTime(serveBeginTime);
        Integer integer=studentOfficerDAO.insertStudentOfficer(studentOfficerDO);
        return integer;
    }

    @Override
    public Integer updateStudentOfficer(Long id, String officerName, Date serveBeginTime, Date serveEndTime) {
        StudentOfficerDO studentOfficerDO=new StudentOfficerDO();
        studentOfficerDO.setId(id);
        studentOfficerDO.setOfficerName(officerName);
        studentOfficerDO.setServeBeginTime(serveBeginTime);
        Integer integer=studentOfficerDAO.updateStudentOfficer(studentOfficerDO);
        return integer;

    }

    @Override
    public Integer deleteStudentOfficer(Long id, String officerName) {
        StudentOfficerDO studentOfficerDO=new StudentOfficerDO();
        studentOfficerDO.setId(id);
        studentOfficerDO.setOfficerName(officerName);
        Integer integer=studentOfficerDAO.deleteStudentOfficer(studentOfficerDO);
        return integer;
    }

//    @Override
//    public Integer insertStudentOfficer(Long stuUniCode, String officerName, Date serveBeginTime, Date serveEndTime) {
//        StudentOfficerDO studentOfficerDO=new StudentOfficerDO();
//        studentOfficerDO.setStuUniCode(stuUniCode);
//        studentOfficerDO.setOfficerName(officerName);
//        studentOfficerDO.setServeBeginTime(serveBeginTime);
//        Integer integer=studentOfficerDAO.insertStudentOfficer(studentOfficerDO);
//        return integer;
//    }
//
//    @Override
//    public Integer updateStudentOfficer(Long stuUniCode, String officerName, Date serveBeginTime, Date serveEndTime) {
//        StudentOfficerDO studentOfficerDO=new StudentOfficerDO();
//        studentOfficerDO.setStuUniCode(stuUniCode);
//        studentOfficerDO.setOfficerName(officerName);
//        studentOfficerDO.setServeBeginTime(serveBeginTime);
//        Integer integer=studentOfficerDAO.updateStudentOfficer(studentOfficerDO);
//        return integer;
//
//    }
//
//    @Override
//    public Integer deleteStudentOfficer(Long stuUniCode, String officerName) {
//        StudentOfficerDO studentOfficerDO=new StudentOfficerDO();
//        studentOfficerDO.setStuUniCode(stuUniCode);
//        studentOfficerDO.setOfficerName(officerName);
//        Integer integer=studentOfficerDAO.deleteStudentOfficer(studentOfficerDO);
//        return integer;
//    }

}
