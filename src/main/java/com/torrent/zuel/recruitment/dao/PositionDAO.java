package com.torrent.zuel.recruitment.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.mapper.PositionDOMapper;
import com.torrent.zuel.recruitment.model.dto.request.PositionRequestDTO;
import com.torrent.zuel.recruitment.model.entity.PositionDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.*;

/**
 * 岗位持久层
 *
 * @author yan
 * @date 2021/11/26
 */
@Repository
public class PositionDAO {

    private static final Integer PAGE_SIZE = 50;

    @Resource
    private PositionDOMapper positionDOMapper;

    /**
     * 分页获取岗位信息
     *
     * @param positionRequestDTO positionRequestDTO
     * @return PositionDTO
     */
    public PageInfo<PositionDO> getPositionByPaging(PositionRequestDTO positionRequestDTO) {
        Integer educationLevel = positionRequestDTO.getEducationLevel();
        BigDecimal jobMaxSalary = positionRequestDTO.getJobMaxSalary();
        BigDecimal jobMinSalary = positionRequestDTO.getJobMinSalary();
        Integer jobWorkBeginYear = positionRequestDTO.getJobWorkBeginYear();
        Integer jobWorkEndYear = positionRequestDTO.getJobWorkEndYear();
        DynamicQuery<PositionDO> query = DynamicQuery.createQuery(PositionDO.class)
                .and(Objects.nonNull(educationLevel), PositionDO::getEducationLevel, lessThanOrEqual(educationLevel))
                .and(Objects.nonNull(jobMinSalary), PositionDO::getJobMinSalary, greaterThanOrEqual(jobMinSalary))
                .and(Objects.nonNull(jobMaxSalary), PositionDO::getJobMaxSalary, lessThanOrEqual(jobMaxSalary))
                .and(Objects.nonNull(jobWorkBeginYear), PositionDO::getJobWorkBeginYear, greaterThanOrEqual(jobWorkBeginYear))
                .and(Objects.nonNull(jobWorkEndYear), PositionDO::getJobWorkEndYear, lessThanOrEqual(jobWorkEndYear))
                .orderBy(PositionDO::getCreateTime, desc());
        if (Objects.isNull(positionRequestDTO.getPageNum())) {
            positionRequestDTO.setPageNum(1);
        }
        if (Objects.isNull(positionRequestDTO.getPageSize())) {
            positionRequestDTO.setPageSize(PAGE_SIZE);
        }
        return PageHelper.startPage(positionRequestDTO.getPageNum(), positionRequestDTO.getPageSize())
                .doSelectPageInfo(() -> positionDOMapper.selectByDynamicQuery(query));
    }

    public List<PositionDO> listPosition(List<Long> jobIdList) {
        DynamicQuery<PositionDO> query = DynamicQuery.createQuery(PositionDO.class)
                .and(PositionDO::getJobId, in(jobIdList));
        return positionDOMapper.selectByDynamicQuery(query);
    }
}
