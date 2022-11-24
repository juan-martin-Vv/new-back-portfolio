package com.jmvv.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jmvv.back.models.Image;
@Repository
public interface RepoImage extends JpaRepository<Image,Integer> {
    
}
