package com.jmvv.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmvv.back.models.Know;
@Repository
public interface RepoKnow extends JpaRepository<Know,Integer>{
    
}
