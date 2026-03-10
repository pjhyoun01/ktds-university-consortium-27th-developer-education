package com.ktdsuniversity.edu.tmdb.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ktdsuniversity.edu.tmdb.dao.ActorDao;
import com.ktdsuniversity.edu.tmdb.dao.AppearanceDao;
import com.ktdsuniversity.edu.tmdb.dao.CategoryDao;
import com.ktdsuniversity.edu.tmdb.dao.FilmographyDao;
import com.ktdsuniversity.edu.tmdb.dao.MakeDao;
import com.ktdsuniversity.edu.tmdb.dao.MovieDao;
import com.ktdsuniversity.edu.tmdb.dao.ProducerDao;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.vo.ActorsVO;
import com.ktdsuniversity.edu.tmdb.vo.CategoriesVO;
import com.ktdsuniversity.edu.tmdb.vo.FilmographyVO;
import com.ktdsuniversity.edu.tmdb.vo.GenreVO;
import com.ktdsuniversity.edu.tmdb.vo.MakeVO;
import com.ktdsuniversity.edu.tmdb.vo.MovieVO;
import com.ktdsuniversity.edu.tmdb.vo.ProducersVO;

public class MovieService {

	private DataAccessHelper dah;

	private MovieDao movieDao;
	private CategoryDao categoryDao;
	private FilmographyDao filmographyDao;
	private MakeDao makeDao;

	public MovieService(DataAccessHelper dah) {
		this.dah = dah;
		this.movieDao = new MovieDao(this.dah);
		this.categoryDao = new CategoryDao(this.dah);
		this.filmographyDao = new FilmographyDao(dah);
		this.makeDao = new MakeDao(dah);
	}

	public Map<Integer, Object> readMovie(String movieId) {
		Map<Integer, Object> movieInfo = new HashMap<>();
		// 영화 정보
		MovieVO oneMovie = this.movieDao.getOneMovie(movieId);
		movieInfo.put(1, oneMovie);

		// 장르 정보
		List<CategoriesVO> CategoryList = this.categoryDao.getAllGenreByMovieId(movieId);
		movieInfo.put(2, CategoryList);

		// 출연진 정보
		List<FilmographyVO> actorList = this.filmographyDao.getAllActorByMovieId(movieId);
		movieInfo.put(3, actorList);

		// 제작진 정보
		List<MakeVO> producerList = this.makeDao.getAllProducerBymovieId(movieId);
		movieInfo.put(4, producerList);

		return movieInfo;
	}

}
