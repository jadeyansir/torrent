package com.torrent.zuel.recruitment.controller.web;

import com.torrent.zuel.recruitment.config.http.RestResponse;
import com.torrent.zuel.recruitment.model.dto.response.StudentInfoResumeResponseDTO;
import com.torrent.zuel.recruitment.service.StudentInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Date;

/**
 * student
 *
 * @author yan
 * @date 2021/12/16
 */
@Api(tags = "学生信息")
@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Resource
    private StudentInfoService studentInfoService;

    @ApiOperation("查询求职简历基本信息")
    @GetMapping("/get/search/status")
    public RestResponse<StudentInfoResumeResponseDTO> getResume(@ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode) {
        return RestResponse.Success(studentInfoService.getStudentInfoDTO(stuUniCode));
    }

    @ApiOperation("修改学生信息")
    @GetMapping("/modify/info")
    public Integer modifyStudentInfo(@ApiParam(name = "stuUniCode", value = "学生学号") @RequestParam Long stuUniCode,
                                     @ApiParam(name = "stuName", value = "姓名") @RequestParam String stuName,
                                     @ApiParam(name = "stuBirthDate", value = "出生日期") @RequestParam Date stuBirthDate,
                                     @ApiParam(name = "stuSex", value = "性别(1:男;2:女;)") @RequestParam Integer stuSex,
                                     @ApiParam(name = "stuHomeAddress", value = "地址") @RequestParam String stuHomeAddress,
                                     @ApiParam(name = "stuPolity", value = "政治面貌(1:党员;2:预备党员;3:共青团员;4:其他党派;5无党派人士;6:群众)")
                                     @RequestParam Integer stuPolity,
                                     @ApiParam(name = "stuGraduationDate", value = "毕业日期") @RequestParam Date stuGraduationDate,
                                     @ApiParam(name = "stuTel", value = "联系方式") @RequestParam Long stuTel,
                                     @ApiParam(name = "stuEmail", value = "邮箱") @RequestParam String stuEmail) {

        return studentInfoService.modifyStudentInfo(stuUniCode, stuName, stuBirthDate, stuSex, stuHomeAddress, stuPolity, stuGraduationDate, stuTel, stuEmail);
    }

}
