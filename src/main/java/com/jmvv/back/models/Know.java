package com.jmvv.back.models;

import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Know {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @NotBlank
    private String Type;
    @NotBlank
    private String Title;
    private String Comentary;
    @Basic
    private LocalDate startDate;
    @Basic
    private LocalDate endDate;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "person_id")
    private Person person;
}
