package com.najot.savdoloyiha.dto;

import com.najot.savdoloyiha.entity.Skill;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Builder
@Data
public class VacancyDTO {

    private Integer id;

    private String title;

    private Double salary;

    private Set<Skill> skills = new HashSet<>();

}
