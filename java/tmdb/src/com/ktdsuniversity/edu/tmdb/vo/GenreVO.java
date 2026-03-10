package com.ktdsuniversity.edu.tmdb.vo;

public class GenreVO {
	private String genreId;
	private String movieId;
	private String categorieId;
	
	public String getGenreId() {
		return genreId;
	}
	public void setGenreId(String genreId) {
		this.genreId = genreId;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getCategorieId() {
		return categorieId;
	}
	public void setCategorieId(String categorieId) {
		this.categorieId = categorieId;
	}
	@Override
	public String toString() {
		return "Genre) genreId: " + genreId + ", movieId: " + movieId + ", categorieId: " + categorieId + "\n";
	}
}
