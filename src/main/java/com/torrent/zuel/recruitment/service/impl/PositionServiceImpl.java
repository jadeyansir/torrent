package com.torrent.zuel.recruitment.service.impl;

import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.dao.ComInfoDAO;
import com.torrent.zuel.recruitment.dao.PositionDAO;
import com.torrent.zuel.recruitment.model.dto.request.PositionRequestDTO;
import com.torrent.zuel.recruitment.model.dto.response.PositionResponseDTO;
import com.torrent.zuel.recruitment.model.entity.ComInfoDO;
import com.torrent.zuel.recruitment.model.entity.PositionDO;
import com.torrent.zuel.recruitment.service.PositionService;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 岗位业务实现类
 *
 * @author yan
 * @date 2021/11/26
 */
@Service
public class PositionServiceImpl implements PositionService {

    @Resource
    private PositionDAO positionDAO;
    @Resource
    private ComInfoDAO comInfoDAO;

    @Override
    public PageInfo<PositionResponseDTO> listPositionByPaging(PositionRequestDTO positionRequestDTO) {
        if (Objects.isNull(positionRequestDTO)) {
            return new PageInfo<>();
        }
        PageInfo<PositionDO> positionByPaging = positionDAO.getPositionByPaging(positionRequestDTO);
        List<PositionDO> positionDOList = positionByPaging.getList().stream()
                .filter(x -> Objects.nonNull(x.getComUniCode())).collect(Collectors.toList());
        List<PositionResponseDTO> positionResponseDTOList = BeanCopyUtils.copyList(positionDOList, PositionResponseDTO.class);
        List<Long> comUniCodeList = positionDOList
                .stream().map(PositionDO::getComUniCode).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(comUniCodeList)) {
            Map<Long, ComInfoDO> comUniCodeToComInfoDOMap = comInfoDAO.listComInfoDO(comUniCodeList).stream()
                    .collect(Collectors.toMap(ComInfoDO::getComUniCode, Function.identity(), (x1, x2) -> x1));
            for (PositionResponseDTO positionResponseDTO : positionResponseDTOList) {
                ComInfoDO comInfoDO = comUniCodeToComInfoDOMap.get(positionResponseDTO.getComUniCode());
                if (Objects.nonNull(comInfoDO)) {
                    positionResponseDTO.setComChiName(comInfoDO.getComChiName());
                    positionResponseDTO.setComChiShortName(comInfoDO.getComChiShortName());
                }
            }
        }
        PageInfo<PositionResponseDTO> positionResponseDTOPageInfo = new PageInfo<>();
        positionResponseDTOPageInfo.setList(positionResponseDTOList);
        positionResponseDTOPageInfo.setPageNum(positionByPaging.getPageNum());
        positionResponseDTOPageInfo.setPageSize(positionByPaging.getPageSize());
        positionResponseDTOPageInfo.setTotal(positionByPaging.getTotal());
        return positionResponseDTOPageInfo;
    }
}
