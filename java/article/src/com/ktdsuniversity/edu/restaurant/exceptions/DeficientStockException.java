package com.ktdsuniversity.edu.restaurant.exceptions;

public class DeficientStockException extends RuntimeException {
	public DeficientStockException(String message) {
		super(message);
	}
}
