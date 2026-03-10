package com.ktdsuniversity.edu.tmdb.vo;

import java.util.List;

public class MovieVO {
	private String movieId;
	private String posterUrl;
	private String title;
	private String movieRating;
	private String openDate;
	private String openCountry;
	private int runningTime;
	private String introduce;
	private String synopsis;
	private String orignalTitle;
	private String state;
	private String language;
	private float budget;
	private float profit;
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getPosterUrl() {
		return posterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public String getOpenCountry() {
		return openCountry;
	}
	public void setOpenCountry(String openCountry) {
		this.openCountry = openCountry;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getOrignalTitle() {
		return orignalTitle;
	}
	public void setOrignalTitle(String orignalTitle) {
		this.orignalTitle = orignalTitle;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public float getBudget() {
		return budget;
	}
	public void setBudget(float budget) {
		this.budget = budget;
	}
	public float getProfit() {
		return profit;
	}
	public void setProfit(float profit) {
		this.profit = profit;
	}
	@Override
	public String toString() {
		return "Movie) movieId: " + movieId + ", posterUrl: " + posterUrl + ", title: " + title + ", movieRating: "
				+ movieRating + ", openDate: " + openDate + ", openCountry: " + openCountry + ", runningTime: "
				+ runningTime + ", introduce: " + introduce + ", synopsis: " + synopsis + ", orignalTitle: " + orignalTitle
				+ ", state: " + state + ", language: " + language + ", budget: " + budget + ", profit: " + profit + "\n";
	}
}
