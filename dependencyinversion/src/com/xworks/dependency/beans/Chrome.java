package com.xworks.dependency.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworks.dependency.connection.Browse;
import com.xworks.dependency.connection.Provider;
@Component
public class Chrome  implements Browse{
	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	@Autowired
	@Qualifier("jio")
	private Provider provider1;
	
	public Chrome() {
		System.out.println("creating chrome");
	}
	@Override
	public void Browse() {
		System.out.println("creating browse from chrome");
		provider.connect();
	provider1.connect();
	}

}
