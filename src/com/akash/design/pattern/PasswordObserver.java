package com.akash.design.pattern;

import java.util.Observable;
import java.util.Observer;

public class PasswordObserver implements Observer {
	private String password;
	
	public PasswordObserver() {
	System.out.println(getClass().getSimpleName() +"Created");
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(getClass().getSimpleName()+":Password Changed "+arg);
	}
}
