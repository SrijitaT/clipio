package com.clipio.controllers;

public class UserController {
	private static UserController instance=new UserController();
	private UserController() {}
	public static UserController getInstance() {
		return instance;
	}
}
