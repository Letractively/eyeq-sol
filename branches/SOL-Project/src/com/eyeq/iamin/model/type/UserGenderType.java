package com.eyeq.iamin.model.type;

public enum UserGenderType {

	M("Male"), F("Female");

	private final String value;

	private UserGenderType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
