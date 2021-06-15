package com.example.demo.repos;

import com.example.demo.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRep extends JpaRepository<Movie, Long> {
}