package com.jmvv.back.dto;

import java.time.LocalDate;

public record DtoKnow(
    int id,
    String Type,
    String Comentary,
    LocalDate startDate,
    LocalDate endDate,
    DtoImage image
) {
    
}
