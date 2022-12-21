package com.jmvv.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jmvv.back.models.Skill;

public interface RepoSkill extends JpaRepository<Skill,Integer>{
    
}
