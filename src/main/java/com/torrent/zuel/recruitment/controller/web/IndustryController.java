package com.torrent.zuel.recruitment.controller.web;

import com.torrent.zuel.recruitment.config.http.RestResponse;
import com.torrent.zuel.recruitment.model.dto.internal.IndustryInfoDTO;
import com.torrent.zuel.recruitment.model.dto.response.IndustryTreeInfoResponseDTO;
import com.torrent.zuel.recruitment.service.IndustryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 行业信息接口
 *
 * @author yan
 * @date 2021/11/27
 */
@Api(tags = "行业信息接口")
@RestController
@RequestMapping("/api/industry")
public class IndustryController {

    @Resource
    private IndustryService industryService;

    @ApiOperation("行业列表:一级")
    @GetMapping("/list/info/level/one")
    public RestResponse<List<IndustryInfoDTO>> listIndustryLevelOneInfo() {
        return RestResponse.Success(industryService.listIndustryLevelOneInfo());
    }

    @ApiOperation("行业树形结构:到二级")
    @GetMapping("/tree/info/level/two")
    public RestResponse<List<IndustryTreeInfoResponseDTO>> listIndustryTreeLevelTwoInfo() {
        return RestResponse.Success(industryService.listIndustryTreeLevelTwoInfo());
    }
}
