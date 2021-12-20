package com.torrent.zuel.recruitment.controller.internal;

import com.torrent.zuel.recruitment.config.http.RestResponse;
import com.torrent.zuel.recruitment.model.dto.request.IndustryInfoRequestDTO;
import com.torrent.zuel.recruitment.service.IndustryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 行业
 *
 * @author yan
 * @date 2021/12/11
 */
@Api(tags = "(内部)行业信息接口")
@RestController
@RequestMapping("/internal/industry")
public class InternalIndustryController {
    @Resource
    private IndustryService industryService;

    @ApiOperation("新增行业")
    @PostMapping("/insert")
    public RestResponse<Integer> listIndustryLevelOneInfo(@ApiParam(name = "IndustryInfoRequestDTO", value = "行业DTO")
                                                          @RequestBody List<IndustryInfoRequestDTO> industryInfoRequestDTOList) {
        return RestResponse.Success(industryService.insertIndustry(industryInfoRequestDTOList));
    }


}
