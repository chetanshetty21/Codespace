package com.xworks.dependency.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworks.dependency.connection.Provider;

@Component
public class Airtel implements Provider {


	@Override
	public void connect() {
		System.out.println("creating connect");
		
	}
}
