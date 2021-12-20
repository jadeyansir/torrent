package com.torrent.zuel.recruitment.controller.web;

import com.torrent.zuel.recruitment.model.dto.response.ComInfoResponseDTO;
import com.torrent.zuel.recruitment.service.ComInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公司
 *
 * @author yan
 * @date 2021/12/17
 */
@Api(tags = "公司接口")
@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Resource
    private ComInfoService comInfoService;

    @ApiOperation("搜索公司")
    @GetMapping("/search")
    public List<ComInfoResponseDTO> listComInfoResponseDTO(
            @ApiParam(name = "comChiName", value = "公司名称") @RequestParam String comChiName) {
        return comInfoService.listComInfoByComChiName(comChiName);
    }
}
