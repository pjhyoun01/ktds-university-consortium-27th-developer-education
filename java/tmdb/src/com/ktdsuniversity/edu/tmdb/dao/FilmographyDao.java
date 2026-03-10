package com.ktdsuniversity.edu.tmdb.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.tmdb.dao.query.FilmographyQuery;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.db.helper.SQLType;
import com.ktdsuniversity.edu.tmdb.vo.ActorsVO;
import com.ktdsuniversity.edu.tmdb.vo.FilmographyVO;

public class FilmographyDao {
	private DataAccessHelper dah;
	private ActorsVO actorsVO;

	public FilmographyDao(DataAccessHelper dah) {
		this.dah = dah;
	}

	public List<FilmographyVO> getAllActorByMovieId(String movieId) {
		this.dah.preparedStatement(FilmographyQuery.getAllActorByMovieIdQuery(), arg -> arg.setString(1, movieId));
		List<FilmographyVO> resultList = new ArrayList<>();
		FilmographyVO filmographyResult = new FilmographyVO();
		ActorsVO actorResult = new ActorsVO();
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			filmographyResult.setFilmographyId(rs.getString("FILMOGRAPHY_ID"));
			filmographyResult.setMovieId(rs.getString("MOVIE_ID"));
			filmographyResult.setActorId(rs.getString("ACTOR_ID"));
			filmographyResult.setActorRole(rs.getString("ACTOR_ROLE"));
			actorResult.setActorName(rs.getString("ACTOR_NAME"));
			filmographyResult.setActorsVO(actorResult);
			resultList.add(filmographyResult);
		});
		return resultList;
	}
}
