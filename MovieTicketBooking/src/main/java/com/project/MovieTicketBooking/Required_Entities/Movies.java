package com.project.MovieTicketBooking.Required_Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movies
{
	@Id
	@Column(name="movieid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	
	@Column(name="moviename")
	private String movieName;
	
	@Column(name="movieprice")
	private double moviePrice;
	
	@Column(name="movieimage")
	private String movieImage;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="description" , columnDefinition = "TEXT")
	private String description;
	
	@Column(name="ratings")
	private double ratings;
	
	
	public Movies() {
		// TODO Auto-generated constructor stub
	}


	public Movies(int movieId, String movieName, double moviePrice, String movieImage, String genre, String description,
			double ratings) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.moviePrice = moviePrice;
		this.movieImage = movieImage;
		this.genre = genre;
		this.description = description;
		this.ratings = ratings;
	}


	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public double getMoviePrice() {
		return moviePrice;
	}


	public void setMoviePrice(double moviePrice) {
		this.moviePrice = moviePrice;
	}


	public String getMovieImage() {
		return movieImage;
	}


	public void setMovieImage(String movieImage) {
		this.movieImage = movieImage;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getRatings() {
		return ratings;
	}


	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	
	
}
