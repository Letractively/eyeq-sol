package com.eyeq.iamin.model.type;

public enum GenderType {

	M("Male"), F("Female");

	private final String value;

	private GenderType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
