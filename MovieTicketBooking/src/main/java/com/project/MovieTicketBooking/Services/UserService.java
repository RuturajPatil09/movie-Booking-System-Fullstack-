package com.project.MovieTicketBooking.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import com.project.MovieTicketBooking.Repositories.UserRepository;
import com.project.MovieTicketBooking.Required_Entities.UserDetails;

@Service
@Configurable
public class UserService
{
	@Autowired
	private UserRepository userRepository;
	
	
	public boolean userRegistration(String username, String email, String psw)
	{
		UserDetails user1 = new UserDetails();
		user1.setEmail(email);
		user1.setUserName(username);
		user1.setPassword(psw);
		if(email == null || psw == null)
		{
			return false;
		}
		else
		{
			UserDetails data = userRepository.findByEmail(email);
			
			if(data == null)
			{
				userRepository.save(user1);
				return true;
			}
			else
			{
				return false;
			}
		}
	}


	public UserDetails userAuthenticate(String email, String psw)
	{
		
		UserDetails data = userRepository.findByEmail(email);
		
		if(data == null)
		{
			return null;
		}
		else
		{
			if(data.getPassword().equals(psw))
			{
				return data;
			}
			
			return null;
		}
		
	}
	

}
