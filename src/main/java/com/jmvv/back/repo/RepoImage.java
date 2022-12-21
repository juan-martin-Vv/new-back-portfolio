package com.jmvv.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jmvv.back.models.Image;

public interface RepoImage extends JpaRepository<Image,Integer> {
    
}
