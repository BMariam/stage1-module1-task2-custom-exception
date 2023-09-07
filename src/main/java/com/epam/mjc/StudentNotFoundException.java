package com.epam.mjc;

class StudentNotFoundException extends IllegalArgumentException {
	StudentNotFoundException(String message) {
		super(message);
	}
}
