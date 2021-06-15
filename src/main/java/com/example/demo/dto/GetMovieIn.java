package com.example.demo.dto;

import lombok.Data;

@Data
public class GetMovieIn {
    private Long id;
    private String title;
    private String country;
}