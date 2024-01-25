package com.najot.savdoloyiha.controller;

import com.najot.savdoloyiha.dto.SkillDTO;
import com.najot.savdoloyiha.service.SkillService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skill")
@Data
public class SkillController {
    private final SkillService skillService;

    @GetMapping("/{id}")
    public SkillDTO getSkill(@PathVariable Integer id){
        return skillService.getSkill(id);
    }

    @GetMapping
    public List<SkillDTO> getSkills(){
        return skillService.getAllSkills();
    }

    @PostMapping
    public SkillDTO createSkill(@RequestBody SkillDTO skillDTO){
        return skillService.createSkill(skillDTO);
    }

    @PutMapping("/{id}")
    public SkillDTO updateSkill(@PathVariable Integer id, @RequestBody SkillDTO skillDTO){
        return skillService.updateSkill(id,skillDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable Integer id){
        skillService.deleteSkill(id);
    }
}
