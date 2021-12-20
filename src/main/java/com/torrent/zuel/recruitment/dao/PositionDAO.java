package com.torrent.zuel.recruitment.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.mapper.PositionDOMapper;
import com.torrent.zuel.recruitment.model.dto.request.PositionRequestDTO;
import com.torrent.zuel.recruitment.model.entity.PositionDO;
import com.torrent.zuel.recruitment.model.entity.PublicDictDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.desc;
import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.in;

/**
 * 岗位持久层
 *
 * @author yan
 * @date 2021/11/26
 */
@Repository
public class PositionDAO {

    private static final Integer PAGE_SIZE = 50;
    private static final Integer SALARY = 1001;
    private static final Integer YEAR = 1002;
    @Resource
    private PositionDOMapper positionDOMapper;

    /**
     * 分页获取岗位信息
     *
     * @param positionRequestDTO positionRequestDTO
     * @return PositionDTO
     */
    public PageInfo<PositionDO> getPositionByPaging(PositionRequestDTO positionRequestDTO, List<PublicDictDO> publicDictDOList) {
        Map<Integer, List<PublicDictDO>> dictDOMap = publicDictDOList.stream()
                .collect(Collectors.groupingBy(PublicDictDO::getParameterSystemCode));
        List<PublicDictDO> publicDictDOList1 = dictDOMap.get(SALARY);
        publicDictDOList1.stream().collect(Collectors.toMap(PublicDictDO::getParameterCode, PublicDictDO::getParameterName));
        List<PublicDictDO> publicDictDOList2 = dictDOMap.get(YEAR);

        List<Integer> educationLevel = positionRequestDTO.getEducationLevel();
        List<Integer> jobSalary = positionRequestDTO.getJobSalary();
        List<Integer> jobType = positionRequestDTO.getJobType();
        List<Integer> jobWorkYear = positionRequestDTO.getJobWorkYear();
        List<Integer> jobAddress = positionRequestDTO.getJobAddress();
        List<Integer> comSize = positionRequestDTO.getComSize();
        List<Integer> comType = positionRequestDTO.getComType();
        Integer displayType = positionRequestDTO.getDisplayType();
        Integer jobIndustry = positionRequestDTO.getJobIndustry();
        String searchJob = positionRequestDTO.getSearchJob();
        DynamicQuery<PositionDO> query = DynamicQuery.createQuery(PositionDO.class)
                .and(Objects.nonNull(educationLevel), PositionDO::getEducationLevel, in(educationLevel))
                //.and(Objects.nonNull(jobSalary), PositionDO::getJobMinSalary, greaterThanOrEqual(jobMinSalary))
                //.and(Objects.nonNull(jobMaxSalary), PositionDO::getJobMaxSalary, lessThanOrEqual(jobMaxSalary))
                //.and(Objects.nonNull(jobWorkBeginYear), PositionDO::getJobWorkBeginYear, greaterThanOrEqual(jobWorkBeginYear))
                //.and(Objects.nonNull(jobWorkEndYear), PositionDO::getJobWorkEndYear, lessThanOrEqual(jobWorkEndYear))
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
                .and(PositionDO::getId, in(jobIdList));
        return positionDOMapper.selectByDynamicQuery(query);
    }
}
