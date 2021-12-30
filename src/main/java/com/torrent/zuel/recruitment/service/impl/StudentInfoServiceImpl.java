package com.torrent.zuel.recruitment.service.impl;

import com.torrent.zuel.recruitment.dao.StudentInfoDAO;
import com.torrent.zuel.recruitment.enums.PoliticsEnum;
import com.torrent.zuel.recruitment.enums.SexEnum;
import com.torrent.zuel.recruitment.model.dto.response.StudentInfoResumeResponseDTO;
import com.torrent.zuel.recruitment.model.entity.StudentInfoDO;
import com.torrent.zuel.recruitment.service.StudentInfoService;
import com.torrent.zuel.recruitment.util.BeanCopyUtils;
import com.torrent.zuel.recruitment.util.EnumMapUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.Objects;
import java.util.Optional;

/**
 * StudentInfo
 *
 * @author yan
 * @date 2021/12/16
 */
@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    @Resource
    private StudentInfoDAO studentInfoDAO;

    @Override
    public StudentInfoResumeResponseDTO getStudentInfoDTO(Long stuUniCode) {
        if (Objects.isNull(stuUniCode)) {
            return null;
        }
        if (studentInfoDAO.getStudentInfoDTO(stuUniCode).isPresent()) {
            return BeanCopyUtils.copyProperties(studentInfoDAO.getStudentInfoDTO(stuUniCode).get(), StudentInfoResumeResponseDTO.class);
        }
        return null;
    }

    @Override
    public Integer modifyStudentInfo(Long stuUniCode, String name, Date stuBirthDate, Integer sex, String address, Integer political,
                                     Date stuGraduationDate, Long telephone, String stuEmail) {
        StudentInfoDO studentInfoDO = new StudentInfoDO();
        studentInfoDO.setStuUniCode(stuUniCode);
        studentInfoDO.setStuName(name);
        studentInfoDO.setStuBirthDate(stuBirthDate);
        Optional<SexEnum> sexEnumOptional = EnumMapUtil.getEnumByValue(sex, SexEnum.class);
        if (sexEnumOptional.isPresent()) {
            studentInfoDO.setStuSex(sexEnumOptional.get().getText());
        }
        studentInfoDO.setStuHomeAddress(address);
        Optional<PoliticsEnum> politicsEnumOptional = EnumMapUtil.getEnumByValue(political, PoliticsEnum.class);
        if (politicsEnumOptional.isPresent()) {
            studentInfoDO.setStuPolity(politicsEnumOptional.get().getText());
        }
        studentInfoDO.setStuGraduationDate(stuGraduationDate);
        studentInfoDO.setStuTel(telephone.toString());
        studentInfoDO.setStuEmail(stuEmail);
        return studentInfoDAO.modifyStudentInfo(studentInfoDO);
    }
}
