package com.arghya.tinytrail_server.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UrlMappingDto {
    private Long id;
    private String originalUrl;
    private String shortUrl;
    private int clickCount;
    private LocalDateTime createdDate;
    private String username;
}
