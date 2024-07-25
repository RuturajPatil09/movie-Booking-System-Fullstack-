package com.project.MovieTicketBooking.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.project.MovieTicketBooking.Repositories.MovieRepository;
import com.project.MovieTicketBooking.Required_Entities.Movies;

@Controller
public class MovieController
{
	
	@Autowired
	private MovieRepository movieRepo;
	
	@GetMapping("/")
	public String showMovieList(Model model)
	{
		List<Movies> movieList = movieRepo.findAll();
		model.addAttribute("movies",movieList);
		return "index";
	}

}
