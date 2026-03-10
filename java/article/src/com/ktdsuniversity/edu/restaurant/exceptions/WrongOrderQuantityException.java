package com.ktdsuniversity.edu.restaurant.exceptions;

public class WrongOrderQuantityException extends RuntimeException{
	public WrongOrderQuantityException(String message) {
		super(message);
	}
}
