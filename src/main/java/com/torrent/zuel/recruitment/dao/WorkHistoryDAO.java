package com.torrent.zuel.recruitment.dao;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.enums.DeletedEnum;
import com.torrent.zuel.recruitment.mapper.WorkHistoryMapper;
import com.torrent.zuel.recruitment.model.entity.WorkHistoryDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.isEqual;

/**
 * 工作经历
 *
 * @author yan
 * @date 2021/12/17
 */
@Repository
public class WorkHistoryDAO {

    @Resource
    private WorkHistoryMapper workHistoryMapper;

    private static final Integer DELETE = 3;

    public List<WorkHistoryDO> listWorkHistoryDO(Long stuUniCode) {
        DynamicQuery<WorkHistoryDO> query = DynamicQuery.createQuery(WorkHistoryDO.class)
                .and(WorkHistoryDO::getStuUniCode, isEqual(stuUniCode))
                .and(WorkHistoryDO::getDeleted, isEqual(DeletedEnum.NOT_DELETE.getValue()));
        return workHistoryMapper.selectByDynamicQuery(query);
    }

    public Integer modifyWorkHistoryDO(Integer modifyType, WorkHistoryDO workHistoryDO) {
        DynamicQuery<WorkHistoryDO> query = DynamicQuery.createQuery(WorkHistoryDO.class)
                .and(WorkHistoryDO::getId, isEqual(workHistoryDO.getId()));
        Optional<WorkHistoryDO> WorkHistoryDOOptional = workHistoryMapper.selectFirstByDynamicQuery(query);
        if (WorkHistoryDOOptional.isPresent()) {
            if (Objects.equals(DELETE, modifyType)) {
                WorkHistoryDO historyDO = WorkHistoryDOOptional.get();
                historyDO.setDeleted(DeletedEnum.DELETE.getValue());
                return workHistoryMapper.updateSelectiveByDynamicQuery(historyDO, query);
            }
            return workHistoryMapper.updateSelectiveByDynamicQuery(workHistoryDO, query);
        }
        return workHistoryMapper.insertSelective(workHistoryDO);
    }
}
