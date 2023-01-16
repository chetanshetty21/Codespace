package com.xworks.dependency.connection;

public interface Provider {
	default void connect() {
		System.out.println("creating connect");
	}

}
