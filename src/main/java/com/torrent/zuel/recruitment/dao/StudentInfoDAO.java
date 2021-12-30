package com.torrent.zuel.recruitment.dao;

import com.github.wz2cool.dynamic.DynamicQuery;
import com.torrent.zuel.recruitment.mapper.StudentInfoMapper;
import com.torrent.zuel.recruitment.model.entity.StudentInfoDO;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static com.github.wz2cool.dynamic.builder.DynamicQueryBuilderHelper.isEqual;

/**
 * StudentInfo
 *
 * @author yan
 * @date 2021/12/16
 */
@Repository
public class StudentInfoDAO {

    @Resource
    private StudentInfoMapper studentInfoMapper;

    public Integer modifyStudentInfo(StudentInfoDO studentInfoDO) {
        if (Objects.isNull(studentInfoDO)) {
            return 0;
        }
        DynamicQuery<StudentInfoDO> query = DynamicQuery.createQuery(StudentInfoDO.class)
                .and(StudentInfoDO::getStuUniCode, isEqual(studentInfoDO.getStuUniCode()));
        List<StudentInfoDO> studentInfoDOList = studentInfoMapper.selectByDynamicQuery(query);
        if (CollectionUtils.isEmpty(studentInfoDOList)) {
            return studentInfoMapper.insertSelective(studentInfoDO);
        }
        return studentInfoMapper.updateSelectiveByDynamicQuery(studentInfoDO, query);
    }

    public Optional<StudentInfoDO> getStudentInfoDTO(Long stuUniCode) {
        if (Objects.isNull(stuUniCode)) {
            return Optional.empty();
        }
        DynamicQuery<StudentInfoDO> query = DynamicQuery.createQuery(StudentInfoDO.class)
                .and(StudentInfoDO::getStuUniCode, isEqual(stuUniCode));
        return studentInfoMapper.selectFirstByDynamicQuery(query);
    }
}
