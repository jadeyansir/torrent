package com.torrent.zuel.recruitment.mapper.mybatis;

import com.torrent.zuel.recruitment.model.entity.ProfessionalSkillsDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfessionalSkillsMapper {
    Integer insertProfessionalSkills(ProfessionalSkillsDO professionalSkillsDO);

    Integer updateProfessionalSkills(ProfessionalSkillsDO professionalSkillsDO);

    Integer deleteProfessionalSkills(Long id);
}
