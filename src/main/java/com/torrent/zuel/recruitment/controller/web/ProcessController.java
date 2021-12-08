package com.torrent.zuel.recruitment.controller.web;

import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.config.http.RestResponse;
import com.torrent.zuel.recruitment.model.dto.ProcessDTO;
import com.torrent.zuel.recruitment.service.ProcessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 投递进度
 *
 * @author yan
 * @date 2021/12/7
 */
@Api(tags = "投递进度")
@RestController
@RequestMapping("/api/process")
public class ProcessController {
    @Resource
    private ProcessService processService;

    @ApiOperation(value = "分页查询投递进度")
    @GetMapping("/paging")
    public RestResponse<PageInfo<ProcessDTO>> listProcessDTOByPaging(
            @ApiParam(name = "stuUniCode", value = "学生编码") @RequestParam Long stuUniCode,
            @ApiParam(name = "processStatus", value = "投递进度(1:已投递,2:待面试,3:已面试,4:已录取,5:未录取,6:被拒绝)")
            @RequestParam Integer processStatus,
            @ApiParam(name = "pageNum", value = "页数") @RequestParam int pageNum,
            @ApiParam(name = "pageSize", value = "页大小") @RequestParam int pageSize) {
        return RestResponse.Success(processService.listProcessDTO(stuUniCode, processStatus, pageNum, pageSize));
    }
}
