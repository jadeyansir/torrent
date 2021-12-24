package com.torrent.zuel.recruitment.service.impl;

import com.google.common.collect.Lists;
import com.torrent.zuel.recruitment.dao.*;
import com.torrent.zuel.recruitment.model.dto.ProjectHistoryDTO;
import com.torrent.zuel.recruitment.model.dto.response.EducationHistoryResponseDTO;
import com.torrent.zuel.recruitment.model.dto.response.ResumeResponseDTO;
import com.torrent.zuel.recruitment.model.dto.response.WorkHistoryResponseDTO;
import com.torrent.zuel.recruitment.model.entity.*;
import com.torrent.zuel.recruitment.service.ResumeService;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
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
    private ResumeDAO resumeDAO;

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

    @Override
    public Integer modifyJobExpect(Long stuUniCode, String jobName, Integer industryCode,
                                   String jobAddress, Integer jobType, BigDecimal jobMinSalary, BigDecimal jobMaxSalary) {
        ResumeDO resumeDO = new ResumeDO();
        resumeDO.setStuUniCode(stuUniCode);
        resumeDO.setJobName(jobName);
        Optional<IndustryInfoDO> industryInfoDOOptional = industryInfoDAO.getIndustryByIndustryCode(industryCode);
        industryInfoDOOptional.ifPresent(x -> {
            resumeDO.setIndustryName(x.getIndustryName());
        });
        resumeDO.setJobAddress(jobAddress);
        resumeDO.setJobType(jobType);
        resumeDO.setJobMaxSalary(jobMaxSalary);
        resumeDO.setJobMinSalary(jobMinSalary);
        return resumeDAO.modifyResume(resumeDO);
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }


    @Override
    public Integer modifyJobSearchStatus(Long stuUniCode, Integer JobSearchStatus) {
        if (Objects.isNull(stuUniCode)) {
            return 0;
        }
        ResumeDO resumeDO = new ResumeDO();
        resumeDO.setStuUniCode(stuUniCode);
        resumeDO.setJobSearchStatus(JobSearchStatus);
        return resumeDAO.modifyResume(resumeDO);
    }

    @Override
    public ResumeResponseDTO getResume(Long stuUniCode) {
        if (Objects.isNull(stuUniCode)) {
            return null;
        }
        Optional<ResumeDO> resumeDOOptional = resumeDAO.getResumeByStuUniCode(stuUniCode);
        if (resumeDOOptional.isPresent()) {
            return BeanCopyUtils.copyProperties(resumeDOOptional.get(), ResumeResponseDTO.class);
        }
        return null;
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
    public Integer updateProjectHistory(Long stuUniCode, String projectName, Date projectBeginTime, Date projectEndTime, String projectDetail) {
        ProjectHistoryDO projectHistoryDO = new ProjectHistoryDO();
        projectHistoryDO.setStuUniCode(stuUniCode);
        projectHistoryDO.setProjectName(projectName);
        projectHistoryDO.setProjectBeginTime(projectBeginTime);
        projectHistoryDO.setProjectEndTime(projectEndTime);
        projectHistoryDO.setProjectDetail(projectDetail);
        Integer integer = projectHistoryDAO.insertProjectHistory(projectHistoryDO);
        return integer;
    }


//    对专业技能的操作
    @Override
    public Integer insertProfessionalSkills(Long stuUniCode, String skillName, Integer useTime, Integer masteryLevel) {
        ProfessionalSkillsDO professionalSkillsDO=new ProfessionalSkillsDO();
        professionalSkillsDO.setStuUniCode(stuUniCode);
        professionalSkillsDO.setSkillName(skillName);
        professionalSkillsDO.setUseTime(useTime);
        professionalSkillsDO.setMasteryLevel(masteryLevel);
        Integer integer=professionalSkillsDAO.insertProfessionalSkills(professionalSkillsDO);
        return integer;
    }

    @Override
    public Integer updateProfessionalSkills(Long stuUniCode, String skillName, Integer useTime, Integer masteryLevel) {
        ProfessionalSkillsDO professionalSkillsDO=new ProfessionalSkillsDO();
        professionalSkillsDO.setStuUniCode(stuUniCode);
        professionalSkillsDO.setSkillName(skillName);
        professionalSkillsDO.setUseTime(useTime);
        professionalSkillsDO.setMasteryLevel(masteryLevel);
        Integer integer=professionalSkillsDAO.updateProfessionalSkills(professionalSkillsDO);
        return integer;
    }

    @Override
    public Integer deleteProfessionalSkills(Long stuUniCode, String skillName) {
        ProfessionalSkillsDO professionalSkillsDO=new ProfessionalSkillsDO();
        professionalSkillsDO.setStuUniCode(stuUniCode);
        professionalSkillsDO.setSkillName(skillName);
        Integer integer=professionalSkillsDAO.deleteProfessionalSkills(professionalSkillsDO);
        return integer;
    }
}
