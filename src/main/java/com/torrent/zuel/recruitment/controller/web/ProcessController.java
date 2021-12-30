package com.torrent.zuel.recruitment.controller.web;

import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.config.http.RestResponse;
import com.torrent.zuel.recruitment.model.dto.ContractDTO;
import com.torrent.zuel.recruitment.model.dto.response.DeliverResponseDTO;
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
@Api(tags = "进度")
@RestController
@RequestMapping("/api/student/process")
public class ProcessController {
    @Resource
    private ProcessService processService;

    @ApiOperation(value = "分页查询投递进度")
    @GetMapping("/deliver")
    public RestResponse<PageInfo<DeliverResponseDTO>> listDeliverDTOByPaging(
            @ApiParam(name = "stuUniCode", value = "学生编码") @RequestParam Long stuUniCode,
            @ApiParam(name = "deliverStatus", value = "投递进度(1:已收藏,2:已投递,3:待面试,4:已面试,5:已录取,6:未录取,7:被拒绝)")
            @RequestParam Integer deliverStatus,
            @ApiParam(name = "pageNum", value = "页数") @RequestParam int pageNum,
            @ApiParam(name = "pageSize", value = "页大小") @RequestParam int pageSize) {
        return RestResponse.Success(processService.listDeliverDTO(stuUniCode, deliverStatus, pageNum, pageSize));
    }

    @ApiOperation(value = "分页查询签约进度")
    @GetMapping("/contract")
    public RestResponse<PageInfo<ContractDTO>> listContractDTOByPaging(
            @ApiParam(name = "stuUniCode", value = "学生编码") @RequestParam Long stuUniCode,
            @ApiParam(name = "processStatus", value = "签约进度(1:待签约,2:已签约,3:已拒绝)")
            @RequestParam Integer contractStatus,
            @ApiParam(name = "pageNum", value = "页数") @RequestParam int pageNum,
            @ApiParam(name = "pageSize", value = "页大小") @RequestParam int pageSize) {
        return RestResponse.Success(processService.listContractDTO(stuUniCode, contractStatus, pageNum, pageSize));
    }

    @ApiOperation(value = "查询拒绝原因")
    @GetMapping("/get/reject/reasons")
    public RestResponse<String> getRejectReasons(
            @ApiParam(name = "id", value = "投递id") @RequestParam Long id) {
        return RestResponse.Success(processService.getRejectReasons(id));
    }

    @ApiOperation(value = "查询面试消息")
    @GetMapping("/get/interview/message")
    public RestResponse<String> getInterviewMessage(
            @ApiParam(name = "id", value = "投递id") @RequestParam Long id) {
        return RestResponse.Success(processService.getInterviewMessage(id));
    }

}
