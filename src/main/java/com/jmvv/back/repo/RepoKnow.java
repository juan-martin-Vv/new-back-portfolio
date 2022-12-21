package com.jmvv.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jmvv.back.models.Know;

public interface RepoKnow extends JpaRepository<Know,Integer>{
    
}
