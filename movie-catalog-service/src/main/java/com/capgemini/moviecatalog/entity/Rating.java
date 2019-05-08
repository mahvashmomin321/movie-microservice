package com.capgemini.moviecatalog.entity;

public class Rating {

	private int MovieId;
	private double rating;

	public Rating() {
		super();
	}

	public Rating(int movieId, double rating) {
		super();
		MovieId = movieId;
		this.rating = rating;
	}

	public int getMovieId() {
		return MovieId;
	}

	public void setMovieId(int movieId) {
		MovieId = movieId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
