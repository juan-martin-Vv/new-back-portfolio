package com.jmvv.back.models;

import java.time.LocalDate;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

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
