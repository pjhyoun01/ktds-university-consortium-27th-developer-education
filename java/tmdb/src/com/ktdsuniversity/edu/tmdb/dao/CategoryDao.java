package com.ktdsuniversity.edu.tmdb.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.tmdb.dao.query.CategoryQuery;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.db.helper.SQLType;
import com.ktdsuniversity.edu.tmdb.vo.CategoriesVO;

public class CategoryDao {
	private DataAccessHelper dah;
	
	public CategoryDao(DataAccessHelper dah) {
		this.dah = dah;
	}

	public List<CategoriesVO> getAllGenreByMovieId(String movieId) {
		this.dah.preparedStatement(CategoryQuery.getAllGenreByMovieIdQuery(), arg -> arg.setString(1, movieId));
		List<CategoriesVO> resultList = new ArrayList<>();
		CategoriesVO result = new CategoriesVO();
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			result.setCategoryId(rs.getString("CATEGORY_ID"));
			result.setCategoryName(rs.getString("CATEGORY_NAME"));
			resultList.add(result);
		});
		return resultList;
		
	}

}
