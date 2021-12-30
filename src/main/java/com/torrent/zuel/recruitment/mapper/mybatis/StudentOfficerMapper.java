package com.torrent.zuel.recruitment.mapper.mybatis;

import com.torrent.zuel.recruitment.model.entity.StudentOfficerDO;

import java.util.List;

public interface StudentOfficerMapper {
    Integer insertStudentOfficer(StudentOfficerDO studentOfficerDO);

    Integer updateStudentOfficer(StudentOfficerDO studentOfficerDO);

    Integer deleteStudentOfficer(StudentOfficerDO studentOfficerDO);

    List<StudentOfficerDO> listStudentOfficer(Long stuUniCode);
}
