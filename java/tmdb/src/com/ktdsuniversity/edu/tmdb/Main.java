package com.ktdsuniversity.edu.tmdb;

import java.util.Map;

import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.service.MovieService;
import com.ktdsuniversity.edu.tmdb.vo.MovieVO;

public class Main {

	public static void main(String[] args) {
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "TMDB", "TMDB");
		
		MovieService movieService = new MovieService(dah);
		Map<Integer, Object> movieInfo = movieService.readMovie("MV-20260227-000001");
		
		System.out.println("영화 정보:");
		System.out.println(movieInfo.get(1));
		System.out.println("장르 정보:");
		System.out.println(movieInfo.get(2));
		System.out.println("출연진 정보:");
		System.out.println(movieInfo.get(3));
		System.out.println("제작진 정보:");
		System.out.println(movieInfo.get(4));
		
		dah.close();
	}
	
}
