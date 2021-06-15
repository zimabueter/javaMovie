package com.example.demo.dto;

import lombok.Data;

@Data
public class GetMovieOut {
    private Long id;
    private String title;
    private String country;
}