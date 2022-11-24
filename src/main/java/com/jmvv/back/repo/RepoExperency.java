package com.jmvv.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmvv.back.models.Experency;
@Repository
public interface RepoExperency extends JpaRepository<Experency,Integer>{
    
}
