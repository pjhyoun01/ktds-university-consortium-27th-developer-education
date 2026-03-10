package com.ktdsuniversity.edu.tmdb.dao.query;

public class MakeQuery {

	public static String getAllProducerBymovieIdQuery() {
		StringBuffer query = new StringBuffer();
		query.append(" SELECT M.MAKE_ID                      ");
		query.append(" 	    , M.MOVIE_ID                     ");
		query.append(" 	    , M.PRODUCER_ID                  ");
		query.append(" 	    , M.PRODUCER_ROLE                ");
		query.append(" 	    , M.PRODUCER_PART                ");
		query.append(" 	    , P.PRODUCER_NAME                ");
		query.append("   FROM MAKE M                         ");
		query.append("  INNER JOIN PRODUCERS P               ");
		query.append("     ON M.PRODUCER_ID = P.PRODUCER_ID  ");
		query.append("    AND MOVIE_ID = ?                   ");
		return query.toString();
	}
}
