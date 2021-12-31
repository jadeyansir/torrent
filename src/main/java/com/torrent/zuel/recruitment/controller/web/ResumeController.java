package com.torrent.zuel.recruitment.controller.web;

import com.torrent.zuel.recruitment.config.http.RestResponse;
import com.torrent.zuel.recruitment.model.dto.ProjectHistoryDTO;
import com.torrent.zuel.recruitment.model.dto.StudentOfficerDTO;
import com.torrent.zuel.recruitment.model.dto.response.EducationHistoryResponseDTO;
import com.torrent.zuel.recruitment.model.dto.response.JobExpectResponseDTO;
import com.torrent.zuel.recruitment.model.dto.response.WorkHistoryResponseDTO;
import com.torrent.zuel.recruitment.service.ResumeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 * 简历
 *
 * @author yan
 * @date 2021/12/17
 */
@Api(tags = "简历")
@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    @Resource
    private ResumeService resumeService;

    @ApiOperation("查询简历求职意向基本信息")
    @GetMapping("/get/job/expect")
    public RestResponse<List<JobExpectResponseDTO>> listJobExpect(
            @ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode) {
        return RestResponse.Success(resumeService.listJobExpect(stuUniCode));
    }

    @ApiOperation("修改简历求职意向")
    @GetMapping("/modify/job/expect")
    public RestResponse<Integer> modifyJobExpect(@ApiParam(name = "id", value = "工作经历id") @RequestParam Long id,
                                                 @ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode,
                                                 @ApiParam(name = "jobName", value = "期望职位") @RequestParam String jobName,
                                                 @ApiParam(name = "industryCode", value = "期望行业") @RequestParam Integer industryCode,
                                                 @ApiParam(name = "jobAddress", value = "期望城市") @RequestParam String jobAddress,
                                                 @ApiParam(name = "jobType", value = "工作性质(1:全职;2:兼职;3:实习)") @RequestParam Integer jobType,
                                                 @ApiParam(name = "jobMinSalary", value = "岗位期望最小薪水")
                                                 @RequestParam BigDecimal jobMinSalary,
                                                 @ApiParam(name = "jobMaxSalary", value = "岗位期望最大薪水")
                                                 @RequestParam BigDecimal jobMaxSalary) {
        return RestResponse.Success(
                resumeService.modifyJobExpect(id, stuUniCode, jobName, industryCode, jobAddress, jobType, jobMinSalary, jobMaxSalary));
    }

    @ApiOperation("新增简历求职意向")
    @GetMapping("/insert/job/expect")
    public RestResponse<Integer> insertJobExpect(@ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode,
                                                 @ApiParam(name = "jobName", value = "期望职位") @RequestParam String jobName,
                                                 @ApiParam(name = "industryCode", value = "期望行业") @RequestParam Integer industryCode,
                                                 @ApiParam(name = "jobAddress", value = "期望城市") @RequestParam String jobAddress,
                                                 @ApiParam(name = "jobType", value = "工作性质(1:全职;2:兼职;3:实习)") @RequestParam Integer jobType,
                                                 @ApiParam(name = "jobMinSalary", value = "岗位期望最小薪水")
                                                 @RequestParam BigDecimal jobMinSalary,
                                                 @ApiParam(name = "jobMaxSalary", value = "岗位期望最大薪水")
                                                 @RequestParam BigDecimal jobMaxSalary) {
        return RestResponse.Success(
                resumeService.insertJobExpect(stuUniCode, jobName, industryCode, jobAddress, jobType, jobMinSalary, jobMaxSalary));
    }

    @ApiOperation("删除简历求职意向")
    @GetMapping("/delete/job/expect")
    public RestResponse<Integer> deleteJobExpect(
            @ApiParam(name = "id", value = "求职意向id") @RequestParam Long id
    ) {
        return RestResponse.Success(resumeService.deleteJobExpect(id));
    }


    @ApiOperation("查询求职状态")
    @GetMapping("/get/search/status")
    public RestResponse<Integer> getJobSearchStatus(
            @ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode) {
        return RestResponse.Success(resumeService.getJobSearchStatus(stuUniCode));
    }

    @ApiOperation("修改求职状态")
    @GetMapping("/modify/search/status")
    public RestResponse<Integer> modifyJobSearchStatus(@ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode,
                                                       @ApiParam(name = "jobSearchStatus", value = "1:在校-找工作中,2:离校-找工作中,3:在校-看看机会,4:在校-暂不找工作") @RequestParam Integer jobSearchStatus) {
        return RestResponse.Success(resumeService.modifyJobSearchStatus(stuUniCode, jobSearchStatus));
    }

    @ApiOperation("查询自我评价")
    @GetMapping("/get/self/evaluation")
    public RestResponse<String> getSelfEvaluation(
            @ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode) {
        return RestResponse.Success(resumeService.getSelfEvaluation(stuUniCode));
    }

    @ApiOperation("修改自我评价")
    @GetMapping("/modify/self/evaluation")
    public RestResponse<Integer> modifySelfEvaluation(@ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode,
                                                      @ApiParam(name = "selfEvaluation", value = "自我评价") @RequestParam String selfEvaluation) {
        return RestResponse.Success(resumeService.modifySelfEvaluation(stuUniCode, selfEvaluation));
    }

    @ApiOperation("查询求职简历教育经历")
    @GetMapping("/get/history/education")
    public RestResponse<List<EducationHistoryResponseDTO>> listEducationHistory(
            @ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode) {
        return RestResponse.Success(resumeService.listEducationHistory(stuUniCode));
    }

    @ApiOperation("修改求职简历教育经历")
    @GetMapping("/modify/history/education")
    public RestResponse<Integer> modifyEducationHistory(@ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode,
                                                        @ApiParam(name = "id", value = "教育经历id") @RequestParam Long id,
                                                        @ApiParam(name = "collegeUniCode", value = "学校编码")
                                                        @RequestParam Long collegeUniCode,
                                                        @ApiParam(name = "collegeChiName", value = "学校名称")
                                                        @RequestParam String collegeChiName,
                                                        @ApiParam(name = "educationLevel", value = "学历")
                                                        @RequestParam Integer educationLevel,
                                                        @ApiParam(name = "educationField", value = "所学专业")
                                                        @RequestParam String educationField,
                                                        @ApiParam(name = "academicCertificates", value = "学历证书")
                                                        @RequestParam Integer academicCertificates,
                                                        @ApiParam(name = "educationBeginTime", value = "学习开始时间")
                                                        @RequestParam Date educationBeginTime,
                                                        @ApiParam(name = "educationEndTime", value = "学习结束时间")
                                                        @RequestParam Date educationEndTime) {
        return RestResponse.Success(resumeService.modifyEducationHistory(stuUniCode, id, 2, collegeUniCode, collegeChiName,
                educationLevel, educationField, academicCertificates, educationBeginTime, educationEndTime));
    }

    @ApiOperation("新增求职简历教育经历")
    @GetMapping("/insert/history/education")
    public RestResponse<Integer> insertEducationHistory(@ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode,
                                                        @ApiParam(name = "collegeUniCode", value = "学校编码")
                                                        @RequestParam Long collegeUniCode,
                                                        @ApiParam(name = "collegeChiName", value = "学校名称")
                                                        @RequestParam String collegeChiName,
                                                        @ApiParam(name = "educationLevel", value = "学历(1:博士;2:硕士;3:学士;4:专科;5:高中及以下)")
                                                        @RequestParam Integer educationLevel,
                                                        @ApiParam(name = "educationField", value = "所学专业")
                                                        @RequestParam String educationField,
                                                        @ApiParam(name = "academicCertificates", value = "学历证书(和学历类似？？？)")
                                                        @RequestParam Integer academicCertificates,
                                                        @ApiParam(name = "educationBeginTime", value = "学习开始时间")
                                                        @RequestParam Date educationBeginTime,
                                                        @ApiParam(name = "educationEndTime", value = "学习结束时间")
                                                        @RequestParam Date educationEndTime) {
        return RestResponse.Success(resumeService.modifyEducationHistory(stuUniCode, null, 1, collegeUniCode, collegeChiName,
                educationLevel, educationField, academicCertificates, educationBeginTime, educationEndTime));
    }

    @ApiOperation("删除求职简历教育经历")
    @GetMapping("/delete/history/education")
    public RestResponse<Integer> deleteEducationHistory(
            @ApiParam(name = "id", value = "项目经历id") @RequestParam Long id) {
        return RestResponse.Success(resumeService.modifyEducationHistory(null, id, 3, null, null,
                null, null, null, null, null));
    }

    @ApiOperation("查询求职简历工作|实习经历")
    @GetMapping("/get/history/work")
    public RestResponse<List<WorkHistoryResponseDTO>> listWorkHistory(
            @ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode) {
        return RestResponse.Success(resumeService.listWorkHistory(stuUniCode));
    }


    @ApiOperation("新增求职简历工作|实习经历")
    @GetMapping("/insert/history/work")
    public RestResponse<Integer> insertWorkHistory(@ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode,
                                                   @ApiParam(name = "comUniCode", value = "公司编码") @RequestParam(required = false) Long comUniCode,
                                                   @ApiParam(name = "comChiName", value = "公司名称") @RequestParam(required = false) String comChiName,
                                                   @ApiParam(name = "industryCode", value = "行业") @RequestParam Integer industryCode,
                                                   @ApiParam(name = "educationField", value = "职位描述") @RequestParam String jobDetail,
                                                   @ApiParam(name = "monthlySalary", value = "月薪") @RequestParam Integer monthlySalary,
                                                   @ApiParam(name = "jobWorkBeginTime", value = "工作开始时间")
                                                   @RequestParam Date jobWorkBeginTime,
                                                   @ApiParam(name = "jobWorkEndTime", value = "工作结束时间")
                                                   @RequestParam Date jobWorkEndTime) {
        return RestResponse.Success(resumeService.modifyWorkHistory(stuUniCode, null, 1, comUniCode, comChiName, industryCode,
                jobDetail, monthlySalary, jobWorkBeginTime, jobWorkEndTime));
    }

    @ApiOperation("修改求职简历工作|实习经历")
    @GetMapping("/modify/history/work")
    public RestResponse<Integer> modifyWorkHistory(@ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode,
                                                   @ApiParam(name = "id", value = "工作经历id") @RequestParam Long id,
                                                   @ApiParam(name = "comUniCode", value = "公司编码")
                                                   @RequestParam(required = false) Long comUniCode,
                                                   @ApiParam(name = "comChiName", value = "公司名称")
                                                   @RequestParam(required = false) String comChiName,
                                                   @ApiParam(name = "industryCode", value = "行业")
                                                   @RequestParam Integer industryCode,
                                                   @ApiParam(name = "educationField", value = "职位描述")
                                                   @RequestParam String jobDetail,
                                                   @ApiParam(name = "monthlySalary", value = "月薪")
                                                   @RequestParam Integer monthlySalary,
                                                   @ApiParam(name = "jobWorkBeginTime", value = "工作开始时间")
                                                   @RequestParam Date jobWorkBeginTime,
                                                   @ApiParam(name = "jobWorkEndTime", value = "工作结束时间")
                                                   @RequestParam Date jobWorkEndTime) {
        return RestResponse.Success(resumeService.modifyWorkHistory(stuUniCode, id, 2, comUniCode, comChiName, industryCode,
                jobDetail, monthlySalary, jobWorkBeginTime, jobWorkEndTime));
    }

    @ApiOperation("删除求职简历工作|实习经历")
    @GetMapping("/delete/history/work")
    public RestResponse<Integer> deleteWorkHistory(
            @ApiParam(name = "id", value = "工作|实习经历id") @RequestParam Long id) {
        return RestResponse.Success(resumeService.modifyWorkHistory(null, id, 3, null, null,
                null, null, null, null, null));
    }

    @ApiOperation("查询项目经历")
    @GetMapping("/get/project/history")
    public RestResponse<List<ProjectHistoryDTO>> listProjectHistory(
            @ApiParam(name = "stuUniCode", value = "学号") @RequestParam Long stuUniCode) {
        return RestResponse.Success("查询成功", resumeService.listProjectHistory(stuUniCode));
    }

    @ApiOperation("新增项目经历")
    @GetMapping("/insert/project/history")
    public RestResponse<Integer> insertProjectHistory(
            @ApiParam(name = "stuUniCode", value = "学号") @RequestParam Long stuUniCode,
            @ApiParam(name = "projectName", value = "项目名称") @RequestParam String projectName,
            @ApiParam(name = "projectBeginTime", value = "项目开始时间") @RequestParam Date projectBeginTime,
            @ApiParam(name = "projectEndTime", value = "项目结束时间") @RequestParam Date projectEndTime,
            @ApiParam(name = "projectDetail", value = "项目描述") @RequestParam String projectDetail) {
        return RestResponse.Success(resumeService.insertProjectHistory(
                stuUniCode, projectName, projectBeginTime, projectEndTime, projectDetail));
    }

    @ApiOperation("修改项目经历")
    @GetMapping("/update/project/history")
    public RestResponse<Integer> updateProjectHistory(
            @ApiParam(name = "id", value = "项目经历id") @RequestParam Long id,
            @ApiParam(name = "stuUniCode", value = "学号") @RequestParam(required = false) Long stuUniCode,
            @ApiParam(name = "projectName", value = "项目名称", required = false) @RequestParam(required = false) String projectName,
            @ApiParam(name = "projectBeginTime", value = "项目开始时间", required = false) @RequestParam(required = false) Date projectBeginTime,
            @ApiParam(name = "projectEndTime", value = "项目结束时间", required = false) @RequestParam(required = false) Date projectEndTime,
            @ApiParam(name = "projectDetail", value = "项目描述", required = false) @RequestParam(required = false) String projectDetail) {
        return RestResponse.Success(resumeService.updateProjectHistory(
                id, stuUniCode, projectName, projectBeginTime, projectEndTime, projectDetail));
    }

    @ApiOperation("删除项目经历")
    @GetMapping("/delete/project/history")
    public RestResponse<Integer> deleteProjectHistory(
            @ApiParam(name = "id", value = "项目经历id") @RequestParam Long id) {
        return RestResponse.Success(resumeService.deleteProjectHistory(id));
    }

    @ApiOperation("新增专业技能")
    @GetMapping("/insert/profession/skill")
    public RestResponse<Integer> insertProfessionalSkills(
            @ApiParam(name = "stuUniCode", value = "学号") @RequestParam Long stuUniCode,
            @ApiParam(name = "skillName", value = "技能名称") @RequestParam String skillName,
            @ApiParam(name = "useTime", value = "掌握时间") @RequestParam Integer useTime,
            @ApiParam(name = "masteryLevel", value = "掌握程度") @RequestParam Integer masteryLevel) {
        return RestResponse.Success(resumeService.insertProfessionalSkills(stuUniCode, skillName, useTime, masteryLevel));
    }

    @ApiOperation("更新专业技能")
    @GetMapping("/update/profession/skill")
    public RestResponse<Integer> updateProfessionalSkills(
            @ApiParam(name = "id", value = "专业技能id") @RequestParam Long id,
            @ApiParam(name = "stuUniCode", value = "学号") @RequestParam Long stuUniCode,
            @ApiParam(name = "skillName", value = "技能名称") @RequestParam String skillName,
            @ApiParam(name = "useTime", value = "掌握时间") @RequestParam Integer useTime,
            @ApiParam(name = "masteryLevel", value = "掌握程度") @RequestParam Integer masteryLevel) {
        return RestResponse.Success(resumeService.updateProfessionalSkills(id, stuUniCode, skillName, useTime, masteryLevel));
    }

    @ApiOperation("删除专业技能")
    @GetMapping("/delete/profession/skill")
    public RestResponse<Integer> updateProfessionalSkills(
            @ApiParam(name = "id", value = "专业技能id") @RequestParam Long id) {
        return RestResponse.Success(resumeService.deleteProfessionalSkills(id));
    }

    @ApiOperation("新增学生干部经历")
    @GetMapping("/insert/studentOfficer")
    public RestResponse<Integer> insertStudentOfficer(
            @ApiParam(name = "stuUniCode", value = "学号") @RequestParam Long stuUniCode,
            @ApiParam(name = "officerName", value = "任职名称") @RequestParam String officerName,
            @ApiParam(name = "serveBeginTime", value = "开始时间") @RequestParam Date serveBeginTime,
            @ApiParam(name = "serveEndTime", value = "结束时间") @RequestParam Date serveEndTime
    ) {
        return RestResponse.Success(resumeService.insertStudentOfficer(stuUniCode, officerName, serveBeginTime, serveEndTime));
    }

    @ApiOperation("修改学生干部经历")
    @GetMapping("/update/studentOfficer")
    public RestResponse<Integer> updateStudentOfficer(
            @ApiParam(name = "id", value = "id") @RequestParam Long id,
            @ApiParam(name = "officerName", value = "任职名称") @RequestParam String officerName,
            @ApiParam(name = "serveBeginTime", value = "开始时间") @RequestParam Date serveBeginTime,
            @ApiParam(name = "serveEndTime", value = "结束时间") @RequestParam Date serveEndTime
    ) {
        return RestResponse.Success(resumeService.updateStudentOfficer(id, officerName, serveBeginTime, serveEndTime));
    }

    @ApiOperation("删除学生干部经历")
    @GetMapping("/delete/studentOfficer")
    public RestResponse<Integer> deleteStudentOfficer(
            @ApiParam(name = "id", value = "id") @RequestParam Long id
    ) {
        return RestResponse.Success(resumeService.deleteStudentOfficer(id));
    }

    @ApiOperation("查询学生干部经历")
    @GetMapping("/get/studentOfficer")
    public RestResponse<List<StudentOfficerDTO>> getStudentOfficer(
            @ApiParam(name = "stuUniCode", value = "学号") @RequestParam Long stuUniCode
    ) {
        return RestResponse.Success(resumeService.listStudentOfficer(stuUniCode));
    }
}
