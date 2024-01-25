package com.najot.savdoloyiha.mapper.impl;

import com.najot.savdoloyiha.dto.SkillDTO;
import com.najot.savdoloyiha.entity.Skill;
import com.najot.savdoloyiha.mapper.SkillMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SkillMapperImpl implements SkillMapper {

    @Override
    public SkillDTO toSkillDTO(Skill skill) {
        return SkillDTO.builder()
                .id(skill.getId())
                .name(skill.getName())
                .build();
    }

    @Override
    public Skill toSkillEntity(SkillDTO skillDTO) {
        return Skill.builder()
                .name(skillDTO.getName())
                .build();
    }

    @Override
    public List<SkillDTO> toSkillDTOList(List<Skill> skillList) {
        return skillList.stream()
                .map(this::toSkillDTO)
                .collect(Collectors.toList());
    }
}
