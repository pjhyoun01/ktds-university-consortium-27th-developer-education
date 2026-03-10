package com.ktdsuniversity.edu.tmdb.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.tmdb.dao.query.MakeQuery;
import com.ktdsuniversity.edu.tmdb.dao.query.ProducerQuery;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.db.helper.SQLType;
import com.ktdsuniversity.edu.tmdb.vo.MakeVO;
import com.ktdsuniversity.edu.tmdb.vo.ProducersVO;

public class MakeDao {

	private DataAccessHelper dah;
	
	public MakeDao(DataAccessHelper dah) {
		this.dah = dah;
	}

	public List<MakeVO> getAllProducerBymovieId(String movieId) {
		this.dah.preparedStatement(MakeQuery.getAllProducerBymovieIdQuery(), arg -> arg.setString(1, movieId));
		List<MakeVO> resultList = new ArrayList<>();
		MakeVO makeResult = new MakeVO();
		ProducersVO producerResult = new ProducersVO();
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			makeResult.setMakeId(rs.getString("MAKE_ID"));
			makeResult.setMovieId(rs.getString("MOVIE_ID"));
			makeResult.setProducerId(rs.getString("PRODUCER_ID"));
			makeResult.setProducerRole(rs.getString("PRODUCER_ROLE"));
			makeResult.setProducerPart(rs.getString("PRODUCER_PART"));
			producerResult.setProducerName(rs.getString("PRODUCER_NAME"));
			makeResult.setProducersVO(producerResult);
			resultList.add(makeResult);
		});
		return resultList;
	}
}
