package com.project.MovieTicketBooking.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.MovieTicketBooking.Repositories.ScreenRepository;
import com.project.MovieTicketBooking.Required_Entities.Screens;

@Controller
public class ScreenController
{
	
	@Autowired
	ScreenRepository screenRepo;
	
	@GetMapping("/screens")
	public ModelAndView redirectMovieBooking()
	{
		List<Screens> screenData = screenRepo.findAll();
		
		ModelAndView view = new ModelAndView();
		view.setViewName("movieBooking");
		view.addObject("screens", screenData);
		return view;
	}

}
