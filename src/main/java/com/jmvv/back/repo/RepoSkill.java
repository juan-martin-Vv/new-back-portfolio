package com.jmvv.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmvv.back.models.Skill;
@Repository
public interface RepoSkill extends JpaRepository<Skill,Integer>{
    
}
