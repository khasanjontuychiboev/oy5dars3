package com.najot.savdoloyiha.service.impl;

import com.najot.savdoloyiha.dto.SkillDTO;
import com.najot.savdoloyiha.entity.Skill;
import com.najot.savdoloyiha.mapper.SkillMapper;
import com.najot.savdoloyiha.repository.SkillRepository;
import com.najot.savdoloyiha.service.SkillService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;
    private final SkillMapper skillMapper;
    @Override
    public SkillDTO getSkill(Integer id) {
        return skillMapper
                .toSkillDTO(skillRepository
                        .getReferenceById(id));
    }

    @Override
    public List<SkillDTO> getAllSkills() {
        return skillMapper
                .toSkillDTOList(skillRepository
                        .findAll());
    }

    @Override
    public SkillDTO createSkill(SkillDTO skillDTO) {
        Skill skill = skillMapper
                .toSkillEntity(skillDTO);

        skill = skillRepository
                .save(skill);

        return skillMapper
                .toSkillDTO(skill);
    }

    @Override
    public SkillDTO updateSkill(Integer id, SkillDTO skillDTO) {
        Skill skill = skillRepository.getReferenceById(id);

        skill.setName(skillDTO.getName());

        return skillMapper
                .toSkillDTO(skillRepository
                        .save(skill));
    }

    @Override
    public void deleteSkill(Integer id) {
        skillRepository
                .deleteById(id);
    }
}
