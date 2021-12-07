package com.torrent.zuel.recruitment.controller.web;

import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.config.http.RestResponse;
import com.torrent.zuel.recruitment.model.dto.request.PositionRequestDTO;
import com.torrent.zuel.recruitment.model.dto.response.PositionResponseDTO;
import com.torrent.zuel.recruitment.service.PositionService;
import com.torrent.zuel.recruitment.util.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 主界面展示
 *
 * @author yan
 * @date 2021/11/26
 */
@Api(tags = "主页信息展示")
@RestController
@RequestMapping("/api/index/main")
public class IndexMainController {

    @Resource
    private PositionService positionService;

    @ApiImplicitParams({
            @ApiImplicitParam(name = "requestBody", required = true, dataType = "PositionRequestDTO", paramType = "body")
    })
    @ApiOperation(value = "岗位展示")
    @PostMapping("/position")
    public RestResponse<PageInfo<PositionResponseDTO>> listPositionByPaging(@RequestBody String requestBody) {
        PositionRequestDTO positionRequestDTO = JSON.parseObject(requestBody, PositionRequestDTO.class);
        return RestResponse.Success(positionService.listPositionByPaging(positionRequestDTO));
    }
}
