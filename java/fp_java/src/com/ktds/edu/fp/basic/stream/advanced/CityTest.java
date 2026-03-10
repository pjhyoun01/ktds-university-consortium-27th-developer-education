package com.ktds.edu.fp.basic.stream.advanced;

import java.util.List;
import java.util.Optional;

public class CityTest {
	public static void main(String[] args) {
		List<City> cities = City.loadCityData();

//		cities
//		.stream()
//		.filter(city -> city.getStateId() == 3907 )
//		.forEach(city -> System.out.println(city.getName()));
//		System.out.println("-----------------------------------------");
//
//		cities
//			  .stream()
//			  .filter(city -> city.getCountryName().equals("South Korea") )
//			  .forEach(city -> System.out.println(city.get_native()));
//		System.out.println("-----------------------------------------");

//		cities
//		.stream()
//		.filter(city -> city.getCountryName().equals("South Korea") )
//		.filter(city -> city.get_native().length() >= 3 )
//		.forEach(city -> System.out.println(city.get_native()));
//		System.out.println("-----------------------------------------");

//		cities
//		.stream()
//		.filter(city -> city.getCountryName().equals("South Korea") )
//		.filter(city -> city.get_native().length() >= 3 )
//		.skip(3)
//		.limit(3)
//		.forEach(city -> System.out.println(city.get_native()));

		cities.stream()
			  .filter(city -> city.getStateId() == 3907)
//			  .map(city -> city.getCountryName())
			  .map(City::getCountryName)
			  .distinct()
			  .forEach(System.out::println);
		
		cities.stream()
			  .filter(city -> city.get_native().matches("^[가-힣]{4,}+$"))
//			  .filter(String)
//			  .filter(city -> city.get_native().length() >= 4)
			  .map(city -> city.getName())
			  .distinct()
			  .map(String::length)
			  .forEach(System.out::println);
	
		
		Optional<City> found = cities.stream()
						 			 .filter(city -> city.getName().equals("Gaigeturi"))
						 			 .findFirst();
		System.out.println(found.orElse(null).getStateName());
		Optional<City> found2 = cities.stream()
									 .filter(city -> city.getName().equals("Gaigeturiasdasd"))
									 .findFirst();
//		System.out.println(found2.orElse(null).getStateName());
		
		City city = found2.orElse(null);
		// Optional 을 사용하는 case1
		if (city != null) {
			System.out.println(city.getName());
		}
		
		// Optional 을 사용하는 case2
		if(found2.isPresent()) {
			System.out.println(found2.get().getStateName());
		}
		
		// Optional 을 사용하는 case3
		City city2 = found2.orElse(new City(""));
		System.out.println(city2.getStateName());
	}

}
