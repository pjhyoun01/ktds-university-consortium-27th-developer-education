package com.ktdsuniversity.edu.tmdb.vo;

public class FilmographyVO {
	private String filmographyId;
	private String movieId;
	private String actorId;
	private String actorRole;
	private ActorsVO actorsVO;
	
	public String getFilmographyId() {
		return filmographyId;
	}
	public void setFilmographyId(String filmographyId) {
		this.filmographyId = filmographyId;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getActorId() {
		return actorId;
	}
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}
	public String getActorRole() {
		return actorRole;
	}
	public void setActorRole(String actorRole) {
		this.actorRole = actorRole;
	}
	public ActorsVO getActorsVO() {
		return actorsVO;
	}
	public void setActorsVO(ActorsVO actorsVO) {
		this.actorsVO = actorsVO;
	}
	@Override
	public String toString() {
		return "Filmography) filmographyId: " + filmographyId + ", movieId: " + movieId + ", actorId: " + actorId
				+ ", actorRole: " + actorRole + ", ActorName: " + getActorsVO().getActorName() + "\n";
	}
	
}
