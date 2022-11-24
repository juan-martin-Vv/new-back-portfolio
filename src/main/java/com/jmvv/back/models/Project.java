package com.jmvv.back.models;

import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private int Id;
    @NotBlank
    private String Title;
    @NotBlank
    private String Comentary;
    @Basic
    private LocalDate startDate;
    @Basic
    private LocalDate endDate;

}
