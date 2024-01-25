package com.najot.savdoloyiha.repository;

import com.najot.savdoloyiha.entity.Skill;
import com.najot.savdoloyiha.entity.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
}
