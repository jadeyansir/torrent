package com.torrent.zuel.recruitment.dao;

import com.torrent.zuel.recruitment.mapper.mybatis.ProfessionalSkillsMapper;
import com.torrent.zuel.recruitment.model.entity.ProfessionalSkillsDO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ProfessionalSkillsDAO {
    @Resource
    private ProfessionalSkillsMapper professionalSkillsMapper;

    public Integer insertProfessionalSkills(ProfessionalSkillsDO professionalSkillsDO) {
        return professionalSkillsMapper.insertProfessionalSkills(professionalSkillsDO);
    }

    public Integer updateProfessionalSkills(ProfessionalSkillsDO professionalSkillsDO) {
        return professionalSkillsMapper.updateProfessionalSkills(professionalSkillsDO);
    }

    public Integer deleteProfessionalSkills(Long id) {
        return professionalSkillsMapper.deleteProfessionalSkills(id);
    }
}
