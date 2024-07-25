package com.project.MovieTicketBooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.MovieTicketBooking.Required_Entities.Movies;

public interface MovieRepository extends JpaRepository<Movies, Integer>
{

}
