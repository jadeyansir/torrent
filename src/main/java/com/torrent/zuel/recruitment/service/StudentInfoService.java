package com.torrent.zuel.recruitment.service;


import java.sql.Date;

/**
 * StudentInfo
 *
 * @author yan
 * @date 2021/12/16
 */
public interface StudentInfoService {

    Integer modifyStudentInfo(Long stuUniCode, String name, Date stuBirthDate, Integer sex, String address, Integer political,
                              Date stuGraduationDate, Long telephone);
}
