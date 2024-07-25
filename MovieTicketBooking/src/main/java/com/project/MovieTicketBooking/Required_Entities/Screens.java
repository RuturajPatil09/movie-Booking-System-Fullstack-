package com.project.MovieTicketBooking.Required_Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="screens")
public class Screens
{
	
	@Id
	@Column(name="screenname")
	private String screenName;
	
	@Column(name="moviename")
	private String screenMovieName;
	
	@Column(name="movieprice")
	private int screenMoviePrice;
	
	@Column(name="movieimage")
	private String screenMovieImage;
	
	
	public Screens() {
		// TODO Auto-generated constructor stub
	}


	public Screens(String screenName, String screenMovieName, int screenMoviePrice, String screenMovieImage) {
		super();
		this.screenName = screenName;
		this.screenMovieName = screenMovieName;
		this.screenMoviePrice = screenMoviePrice;
		this.screenMovieImage = screenMovieImage;
	}


	public String getScreenName() {
		return screenName;
	}


	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}


	public String getScreenMovieName() {
		return screenMovieName;
	}


	public void setScreenMovieName(String screenMovieName) {
		this.screenMovieName = screenMovieName;
	}


	public double getScreenMoviePrice() {
		return screenMoviePrice;
	}


	public void setScreenMoviePrice(int screenMoviePrice) {
		this.screenMoviePrice = screenMoviePrice;
	}


	public String getScreenMovieImage() {
		return screenMovieImage;
	}


	public void setScreenMovieImage(String screenMovieImage) {
		this.screenMovieImage = screenMovieImage;
	}
	
	
}
