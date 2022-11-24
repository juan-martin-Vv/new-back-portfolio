package com.jmvv.back.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.jmvv.back.models.Person;
@Repository
public interface RepoPerson extends JpaRepository <Person,Integer>{
    @Query(
        "SELECT CASE WHEN COUNT (p) > 0 THEN FALSE ELSE TRUE END "+
        "FROM Person p "+
        "WHERE  p.numberId=?1 OR p.email=?2 "
    )
    Boolean freeUser(Integer idNumber , String email);
}
