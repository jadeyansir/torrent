package com.torrent.zuel.recruitment.dao;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.enums.DeletedEnum;
import com.torrent.zuel.recruitment.mapper.EducationHistoryMapper;
import com.torrent.zuel.recruitment.model.entity.EducationHistoryDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.isEqual;

/**
 * 教育经历
 *
 * @author yan
 * @date 2021/12/17
 */
@Repository
public class EducationHistoryDAO {

    private static final Integer DELETE = 3;

    @Resource
    private EducationHistoryMapper educationHistoryMapper;

    public List<EducationHistoryDO> listEducationHistoryDO(Long stuUniCode) {
        DynamicQuery<EducationHistoryDO> query = DynamicQuery.createQuery(EducationHistoryDO.class)
                .and(EducationHistoryDO::getStuUniCode, isEqual(stuUniCode))
                .and(EducationHistoryDO::getDeleted, isEqual(DeletedEnum.NOT_DELETE.getValue()));
        return educationHistoryMapper.selectByDynamicQuery(query);
    }

    public Integer modifyEducationHistoryDO(Integer modifyType, EducationHistoryDO educationHistoryDO) {
        DynamicQuery<EducationHistoryDO> query = DynamicQuery.createQuery(EducationHistoryDO.class)
                .and(EducationHistoryDO::getId, isEqual(educationHistoryDO.getId()));
        Optional<EducationHistoryDO> educationHistoryDOOptional = educationHistoryMapper.selectFirstByDynamicQuery(query);
        if (educationHistoryDOOptional.isPresent()) {
            if (Objects.equals(DELETE, modifyType)) {
                EducationHistoryDO historyDO = educationHistoryDOOptional.get();
                historyDO.setDeleted(DeletedEnum.DELETE.getValue());
                educationHistoryMapper.updateSelectiveByDynamicQuery(historyDO, query);
            }
            return educationHistoryMapper.updateSelectiveByDynamicQuery(educationHistoryDO, query);
        }
        return educationHistoryMapper.insertSelective(educationHistoryDO);
    }

}
