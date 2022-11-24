package com.jmvv.back.dto;

import java.time.LocalDate;

public record DtoExperency(
    int id,
    String Place,
    String Job,
    String Description,
    LocalDate startDate,
    LocalDate endDate,
    DtoImage image
) {
}