package com.jmvv.back.dto;

import com.jmvv.back.enums.ImageType;

public record DtoImage(
    int id,
    String Title,
    String urlString,
    ImageType type
) {
    
}
