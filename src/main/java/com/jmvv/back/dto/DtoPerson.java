package com.jmvv.back.dto;

import java.time.LocalDate;
import java.util.List;

public record DtoPerson(
    int id,
    String Name,
    String LastName,
    String ProfPerfil,
    String EmailString,
    LocalDate bornDate,
    int IdNumber,
    List<DtoImage> images
) {
    
}
