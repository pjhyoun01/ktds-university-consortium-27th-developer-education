package com.ktds.edu.fp.basic.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.ktds.edu.fp.basic.stream.object.Dish;
import com.ktds.edu.fp.basic.stream.object.DishList;
import com.ktds.edu.fp.basic.stream.object.DishType;
import com.ktds.edu.fp.basic.stream.object.FoodType;

public class StreamBasic {

	private void printDishUesFor() {
		System.out.println("전체요리 목록 - 칼로리 < 500 - for");
		List<Dish> dishList = DishList.makeDishList();

		for (Dish dish : dishList) {
			if (dish.getCalories() < 500) {
				System.out.println(dish);
			}
		}
		System.out.println();
	}

	private void printDishUseStream() {
		System.out.println("전체요리 목록 - 칼로리 < 500 - for each");
		List<Dish> dishList = DishList.makeDishList();
//		dishList.forEach( dish -> System.out.println(dish));
		
		// 메소드 레퍼런스
//		dishList.forEach(System.out::println);
		
		dishList // List<Dish>
				.stream() // Stream<Dish>
				.peek(dish ->{
					System.out.println("첫 번째 filter 수행하기 전의 인스턴스");
					System.out.println("1. " + dish.getName());
					System.out.println("1. " + dish.getCalories());
					System.out.println("1. " + dish.getFoodType());
					System.out.println("1. " + dish.getDishType());
					System.out.println();
				})
				.filter(dish -> dish.getCalories() < 500) // Stream<Dish>
				.peek(dish ->{
					System.out.println("첫 번째 filter 수행하기 전의 인스턴스");
					System.out.println("2. " + dish.getName());
					System.out.println("2. " + dish.getCalories());
					System.out.println("2. " + dish.getFoodType());
					System.out.println("2. " + dish.getDishType());
					System.out.println();
				})
				.filter(dish -> dish.getFoodType() == FoodType.MEAT)
				.peek(dish ->{
					System.out.println("첫 번째 filter 수행하기 전의 인스턴스");
					System.out.println("3. " + dish.getName());
					System.out.println("3. " + dish.getCalories());
					System.out.println("3. " + dish.getFoodType());
					System.out.println("3. " + dish.getDishType());
					System.out.println();
				})
				.filter(dish -> dish.getDishType() == DishType.FISH)
				.peek(dish ->{
					System.out.println("첫 번째 filter 수행하기 전의 인스턴스");
					System.out.println("4. " + dish.getName());
					System.out.println("4. " + dish.getCalories());
					System.out.println("4. " + dish.getFoodType());
					System.out.println("4. " + dish.getDishType());
					System.out.println();
				})
				.forEach(dish -> System.out.println(dish));
		System.out.println();
	}
	
	private void printEvenNumbers() {
		List<Integer> numbers = Arrays.asList(7, 2, 3, 7, 23, 7, 2, 37, 2, 37, 273);
		
//		numbers에 있는 값을 전부 2를 곱해서 짝수로 만들어 출력
//		numbers.stream()
//			   .map(number -> number * 2)
//			   .forEach(System.out::println);
		
		
		
		
//		numbers에 있는 값에서 중복된 숫자는 모두 제거하고 나머지 숫자에 전부 2를 곱해서 짝수로 만들어 출력한다
		numbers.stream()
			   .distinct()
			   .map(number -> number * 2)
			   .forEach(number -> System.out.println(number));
	}
	
	
	private void makeString() {
		List<Dish> dishs = DishList.makeDishList();
		String dishsName = dishs.stream()
								.filter(dish -> dish.getFoodType() == FoodType.VEGETABLES)
								.map(Dish::getName)
								.collect(Collectors.joining(", "));
		System.out.println(dishsName);
	}
	
	public List<Dish> getHealthyDishes(){
		List<Dish> dishs = DishList.makeDishList();
		
		List<Dish> result = dishs.stream()
								 .filter(dish -> dish.getCalories() < 400)
								 .toList();
								 // 리스트의 수정이 불가능한 버전
		
		return result;
	}

	public List<Dish> getHealthyDishes2(){
		List<Dish> dishs = DishList.makeDishList();
		
		List<Dish> result = dishs.stream()
								 .filter(dish -> dish.getCalories() < 400)
								 .collect(Collectors.toList());
								 // 리스트의 수정이 가능한 버전
		
		return result;
	}

	public static void main(String[] args) {

		StreamBasic basic = new StreamBasic();
//		basic.printDishUesFor();
//		basic.printDishUseStream();
//		basic.printEvenNumbers();
		basic.makeString();
		
//		List<Dish> result = basic.getHealthyDishes();
//		System.out.println(result);
//		result.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT));

		List<Dish> result2 = basic.getHealthyDishes2();
		System.out.println(result2);
		result2.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT));
		System.out.println(result2);
		
	}
}
