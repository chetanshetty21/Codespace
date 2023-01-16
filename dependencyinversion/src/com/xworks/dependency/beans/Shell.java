package com.xworks.dependency.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworks.dependency.connection.Fuel;
import com.xworks.dependency.connection.PetrolBunk;
@Component
public class Shell implements PetrolBunk{
	@Autowired
	@Qualifier("diesel")
private Fuel fuel;

@Override
public void purchase() {
	// TODO Auto-generated method stub
	fuel.consume();
}
}

