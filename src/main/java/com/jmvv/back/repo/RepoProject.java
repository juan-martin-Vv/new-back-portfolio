package com.jmvv.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jmvv.back.models.Project;

public interface RepoProject extends JpaRepository<Project,Integer>{
    
}
