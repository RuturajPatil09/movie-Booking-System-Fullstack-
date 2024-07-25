package com.project.MovieTicketBooking.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.project.MovieTicketBooking.Required_Entities.UserDetails;
import com.project.MovieTicketBooking.Services.UserService;

@Controller
public class UserController
{
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String registerPageRedirect()
	{
		return "userregistration";
	}
	
	@GetMapping("/login")
	public String loginPageRedirect()
	{
		return "login";
	}
	
	@PostMapping("/userregister")
	public String userDataRegistration(@RequestParam String username, @RequestParam String email, @RequestParam String psw)
	{
		
		
		if(userService.userRegistration(username, email, psw))
		{
			return "login";
		}
		else
		{
			return "loginerror";
		}
		
	}
	
	
	@PostMapping("/userlogin")
	public ModelAndView userLogin(@RequestParam String email, @RequestParam String psw)
	{
		UserDetails user1 = userService.userAuthenticate(email,psw);
		ModelAndView modelAndView = new ModelAndView();
		if(user1 != null)
		{
			modelAndView.setViewName("userLandingPage");
			modelAndView.addObject("userEmailId", user1.getEmail());
			modelAndView.addObject("userName", user1.getUserName());
			return modelAndView;
		}
		else
		{
			modelAndView.setViewName("loginerror");
			return modelAndView;
		}
		
	}

}
