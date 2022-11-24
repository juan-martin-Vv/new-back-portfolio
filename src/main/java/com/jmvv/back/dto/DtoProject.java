package com.jmvv.back.dto;

import java.time.LocalDate;

public record DtoProject(
    int id,
    String Title,
    String Comentary,
    LocalDate startDate,
    LocalDate endDate,
    DtoImage image
) {
    
}
