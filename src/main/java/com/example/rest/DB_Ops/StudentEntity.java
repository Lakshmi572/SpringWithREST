package com.example.rest.DB_Ops;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_entity")
@Data
@NoArgsConstructor
public class StudentEntity {
    @Id
    private Integer id;
    private String name;
    private Integer ranks;
    private Integer age;
}
