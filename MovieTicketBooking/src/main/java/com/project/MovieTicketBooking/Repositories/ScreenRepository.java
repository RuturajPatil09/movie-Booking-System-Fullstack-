package com.project.MovieTicketBooking.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.MovieTicketBooking.Required_Entities.Screens;

public interface ScreenRepository extends JpaRepository<Screens, String>
{

}
