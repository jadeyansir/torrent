package com.torrent.zuel.recruitment.dao;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.mapper.JobExpectMapper;
import com.torrent.zuel.recruitment.model.entity.JobExpectDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.isEqual;

/**
 * 简历
 *
 * @author yan
 * @date 2021/12/17
 */
@Repository
public class JobExpectDAO {
    @Resource
    private JobExpectMapper jobExpectMapper;

    public Integer modifyJobExpect(JobExpectDO jobExpectDO) {
        if (Objects.isNull(jobExpectDO)) {
            return 0;
        }
        DynamicQuery<JobExpectDO> query = DynamicQuery.createQuery(JobExpectDO.class)
                .and(Objects.nonNull(jobExpectDO.getId()), JobExpectDO::getId, isEqual(jobExpectDO.getId()))
                .and(JobExpectDO::getStuUniCode, isEqual(jobExpectDO.getStuUniCode()));
        return jobExpectMapper.updateSelectiveByDynamicQuery(jobExpectDO, query);
    }

    public Integer insertJobExpect(JobExpectDO jobExpectDO) {
        if (Objects.isNull(jobExpectDO)) {
            return 0;
        }
        return jobExpectMapper.insertSelective(jobExpectDO);
    }

    public Integer deleteJobExpect(Long id) {
        return jobExpectMapper.deleteByPrimaryKey(id);
    }

    public List<JobExpectDO> getJobExpectByStuUniCode(Long stuUniCode) {
        DynamicQuery<JobExpectDO> query = DynamicQuery.createQuery(JobExpectDO.class)
                .and(JobExpectDO::getStuUniCode, isEqual(stuUniCode));
        return jobExpectMapper.selectByDynamicQuery(query);
    }
}
