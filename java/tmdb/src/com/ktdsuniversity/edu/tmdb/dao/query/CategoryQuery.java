package com.ktdsuniversity.edu.tmdb.dao.query;

public class CategoryQuery {

	public static String getAllGenreByMovieIdQuery() {
		StringBuffer query = new StringBuffer();
		query.append(" SELECT CATEGORY_ID                                 ");
		query.append(" 	    , CATEGORY_NAME                               ");
		query.append("   FROM CATEGORIES                                  ");
		query.append("  WHERE CATEGORY_ID IN (SELECT DISTINCT CATEGORY_ID ");
		query.append(" 					     	FROM GENRE                ");
		query.append(" 					       WHERE MOVIE_ID = ?)        ");
		return query.toString();
	}

}
