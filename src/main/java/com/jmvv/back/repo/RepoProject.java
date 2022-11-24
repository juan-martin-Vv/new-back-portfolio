package com.jmvv.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmvv.back.models.Project;
@Repository
public interface RepoProject extends JpaRepository<Project,Integer>{
    
}
