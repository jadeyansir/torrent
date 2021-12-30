package com.torrent.zuel.recruitment.dao;

import com.torrent.zuel.recruitment.mapper.mybatis.StudentOfficerMapper;
import com.torrent.zuel.recruitment.model.entity.StudentOfficerDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class StudentOfficerDAO {
    @Resource
    private StudentOfficerMapper studentOfficerMapper;
    public Integer insertStudentOfficer(StudentOfficerDO studentOfficerDO) {
        return studentOfficerMapper.insertStudentOfficer(studentOfficerDO);
    }

    public Integer updateStudentOfficer(StudentOfficerDO studentOfficerDO) {
        return studentOfficerMapper.updateStudentOfficer(studentOfficerDO);
    }

    public Integer deleteStudentOfficer(StudentOfficerDO studentOfficerDO) {
        return studentOfficerMapper.deleteStudentOfficer(studentOfficerDO);
    }
}
