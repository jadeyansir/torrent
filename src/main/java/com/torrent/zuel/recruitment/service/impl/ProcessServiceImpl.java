package com.torrent.zuel.recruitment.service.impl;

import com.github.pagehelper.PageInfo;
import com.torrent.zuel.recruitment.dao.ContractDAO;
import com.torrent.zuel.recruitment.dao.DeliverDAO;
import com.torrent.zuel.recruitment.dao.PositionDAO;
import com.torrent.zuel.recruitment.enums.DeliverStatusEnum;
import com.torrent.zuel.recruitment.model.dto.ContractDTO;
import com.torrent.zuel.recruitment.model.dto.response.DeliverResponseDTO;
import com.torrent.zuel.recruitment.model.entity.ContractDO;
import com.torrent.zuel.recruitment.model.entity.DeliverDO;
import com.torrent.zuel.recruitment.model.entity.PositionDO;
import com.torrent.zuel.recruitment.service.ProcessService;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 投递进度
 *
 * @author yan
 * @date 2021/12/7
 */
@Service
public class ProcessServiceImpl implements ProcessService {
    @Resource
    private DeliverDAO deliverDAO;
    @Resource
    private ContractDAO contractDAO;
    @Resource
    private PositionDAO positionDAO;

    @Override
    public PageInfo<DeliverResponseDTO> listDeliverDTO(Long stuUniCode, Integer deliverStatus, int pageNum, int pageSize) {
        if (!ObjectUtils.allNotNull(stuUniCode, deliverStatus)) {
            return new PageInfo<>();
        }
        PageInfo<DeliverDO> processDOPageInfo = deliverDAO.listDeliver(stuUniCode, deliverStatus, pageNum, pageSize);
        List<DeliverDO> deliverDOList = processDOPageInfo.getList();
        List<DeliverResponseDTO> deliverResponseDTOList = BeanCopyUtils.copyList(deliverDOList, DeliverResponseDTO.class);
        if (DeliverStatusEnum.MARK.getValue() == deliverStatus) {
            List<Long> jobIdList = deliverResponseDTOList.stream()
                    .filter(x -> Objects.nonNull(x.getJobId())).map(DeliverResponseDTO::getJobId).collect(Collectors.toList());
            Map<Long, Integer> jobIdToDeletedMap = positionDAO.listPosition(jobIdList).stream()
                    .collect(Collectors.toMap(PositionDO::getId, PositionDO::getDeleted, (x1, x2) -> x1));
            for (DeliverResponseDTO deliverResponseDTO : deliverResponseDTOList) {
                deliverResponseDTO.setDeleted(jobIdToDeletedMap.get(deliverResponseDTO.getJobId()));
            }
        }
        PageInfo<DeliverResponseDTO> processDTOPageInfo = new PageInfo<>();
        processDTOPageInfo.setTotal(processDOPageInfo.getTotal());
        processDTOPageInfo.setPageSize(processDOPageInfo.getPageSize());
        processDTOPageInfo.setPageNum(processDOPageInfo.getPageNum());
        processDTOPageInfo.setList(deliverResponseDTOList);
        return processDTOPageInfo;
    }

    @Override
    public PageInfo<ContractDTO> listContractDTO(Long stuUniCode, Integer contractStatus, int pageNum, int pageSize) {
        if (!ObjectUtils.allNotNull(stuUniCode, contractStatus)) {
            return new PageInfo<>();
        }
        PageInfo<ContractDO> processDOPageInfo = contractDAO.listContract(stuUniCode, contractStatus, pageNum, pageSize);
        List<ContractDO> deliverDOList = processDOPageInfo.getList();
        List<ContractDTO> deliverDTOList = BeanCopyUtils.copyList(deliverDOList, ContractDTO.class);
        PageInfo<ContractDTO> processDTOPageInfo = new PageInfo<>();
        processDTOPageInfo.setTotal(processDOPageInfo.getTotal());
        processDTOPageInfo.setPageSize(processDOPageInfo.getPageSize());
        processDTOPageInfo.setPageNum(processDOPageInfo.getPageNum());
        processDTOPageInfo.setList(deliverDTOList);
        return processDTOPageInfo;
    }
}
