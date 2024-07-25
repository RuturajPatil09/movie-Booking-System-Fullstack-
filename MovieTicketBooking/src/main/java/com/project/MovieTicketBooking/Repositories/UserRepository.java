package com.project.MovieTicketBooking.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.MovieTicketBooking.Required_Entities.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer>
{
	
	public UserDetails findByEmail(String email);

}