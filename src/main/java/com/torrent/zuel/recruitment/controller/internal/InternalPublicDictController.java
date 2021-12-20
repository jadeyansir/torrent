package com.torrent.zuel.recruitment.controller.internal;

import com.torrent.zuel.recruitment.model.dto.request.PublicDictRequestDTO;
import com.torrent.zuel.recruitment.service.PublicDictService;
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
 * 字典表
 *
 * @author yan
 * @date 2021/12/12
 */
@Api(tags = "(内部)公共字典表")
@RestController
@RequestMapping("/internal/public/dict")
public class InternalPublicDictController {

    @Resource
    private PublicDictService publicDictService;

    @ApiOperation("新增字典")
    @PostMapping("/add")
    public Integer addPublicDict(@ApiParam(name = "publicDictRequestDTOList", value = "字典表")
                                 @RequestBody List<PublicDictRequestDTO> publicDictRequestDTOList) {
        return publicDictService.addPublicDict(publicDictRequestDTOList);
    }
}
