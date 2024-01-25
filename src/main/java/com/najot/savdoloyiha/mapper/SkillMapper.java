package com.najot.savdoloyiha.mapper;

import com.najot.savdoloyiha.dto.SkillDTO;
import com.najot.savdoloyiha.entity.Skill;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface SkillMapper {
    SkillDTO toSkillDTO(Skill skill);
    Skill toSkillEntity(SkillDTO skillDTO);
    List<SkillDTO> toSkillDTOList(List<Skill> skillList);

}
