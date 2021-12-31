package com.torrent.zuel.recruitment.controller.web;

import com.torrent.zuel.recruitment.config.http.RestResponse;
import com.torrent.zuel.recruitment.model.dto.response.CollegeInfoResponseDTO;
import com.torrent.zuel.recruitment.service.CollegeInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学校
 *
 * @author yan
 * @date 2021/12/31
 */
@Api("学校接口")
@RestController
@RequestMapping("/api/college")
public class CollegeController {

    @Resource
    private CollegeInfoService collegeInfoService;

    @ApiOperation("获取学校编码和名称")
    @GetMapping("/list/college/info")
    public RestResponse<List<CollegeInfoResponseDTO>> getCollegeInfoResponseDTO() {
        return RestResponse.Success(collegeInfoService.listCollegeInfoResponseDTO());
    }

}
