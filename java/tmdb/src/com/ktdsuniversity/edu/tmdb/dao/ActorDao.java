package com.ktdsuniversity.edu.tmdb.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.tmdb.dao.query.ActorQuery;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.db.helper.SQLType;
import com.ktdsuniversity.edu.tmdb.vo.ActorsVO;
import com.ktdsuniversity.edu.tmdb.vo.FilmographyVO;

public class ActorDao {
	private DataAccessHelper dah;

	public ActorDao(DataAccessHelper dah) {
		this.dah = dah;
	}

	

}
