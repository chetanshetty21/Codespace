package com.xworks.dependency.connection;

import org.springframework.stereotype.Component;

public interface Fuel {
	default void consume() {
		System.out.println("creating consume");
	}
}
