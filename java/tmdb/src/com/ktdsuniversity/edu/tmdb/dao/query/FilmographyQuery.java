package com.ktdsuniversity.edu.tmdb.dao.query;

public class FilmographyQuery {

	public static String getAllActorByMovieIdQuery() {
		StringBuffer query = new StringBuffer();
		query.append(" SELECT F.FILMOGRAPHY_ID         ");
		query.append(" 	    , F.MOVIE_ID               ");
		query.append(" 	    , F.ACTOR_ID               ");
		query.append(" 	    , F.ACTOR_ROLE             ");
		query.append(" 	    , A.ACTOR_NAME             ");
		query.append("   FROM FILMOGRAPHY F            ");
		query.append("  INNER JOIN ACTORS A            ");
		query.append("     ON F.ACTOR_ID = A.ACTOR_ID  ");
		query.append("    AND F.MOVIE_ID = ?           ");
		return query.toString();
	}
}
