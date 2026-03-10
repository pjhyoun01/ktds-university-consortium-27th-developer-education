package com.ktdsuniversity.edu.store.inheritance.exceptions;

public class WrongOrderQuantityException extends RuntimeException{
	public WrongOrderQuantityException(String message) {
		super(message);
	}
}
