package com.galactoise.alexamodel;

public class AlexaRequestIntentSlotObject {

	private String name;
	private String value;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "AlexaSlotObject [name=" + name + ", value=" + value + "]";
	}
}
