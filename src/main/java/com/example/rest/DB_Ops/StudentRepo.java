package com.example.rest.DB_Ops;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}
