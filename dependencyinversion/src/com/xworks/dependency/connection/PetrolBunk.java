package com.xworks.dependency.connection;

import org.springframework.stereotype.Component;

public interface PetrolBunk {
	
	default void purchase(){
		System.out.println("creating Purchase");
	}

}
