package com.torrent.zuel.recruitment.dao;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.mapper.ResumeMapper;
import com.torrent.zuel.recruitment.model.entity.ResumeDO;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.isEqual;

/**
 * 简历
 *
 * @author yan
 * @date 2021/12/17
 */
@Repository
public class ResumeDAO {
    @Resource
    private ResumeMapper resumeMapper;

    public Integer modifyResume(ResumeDO resumeDO) {
        if (Objects.isNull(resumeDO)) {
            return 0;
        }
        DynamicQuery<ResumeDO> query = DynamicQuery.createQuery(ResumeDO.class)
                .and(ResumeDO::getStuUniCode, isEqual(resumeDO.getStuUniCode()));
        List<ResumeDO> resumeDOList = resumeMapper.selectByDynamicQuery(query);
        if (CollectionUtils.isEmpty(resumeDOList)) {
            return resumeMapper.insertSelective(resumeDO);
        }
        return resumeMapper.updateSelectiveByDynamicQuery(resumeDO, query);
    }

    public Optional<ResumeDO> getResumeByStuUniCode(Long stuUniCode) {
        DynamicQuery<ResumeDO> query = DynamicQuery.createQuery(ResumeDO.class)
                .and(ResumeDO::getStuUniCode, isEqual(stuUniCode));
        return resumeMapper.selectFirstByDynamicQuery(query);
    }
}
