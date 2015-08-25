package com.galactoise.alexamodel;

import java.util.HashMap;

public class AlexaRequestIntent {

	private String name;
	private HashMap<String, AlexaRequestIntentSlotObject> slots;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public HashMap<String, AlexaRequestIntentSlotObject> getSlots() {
		return slots;
	}
	
	public void setSlots(HashMap<String, AlexaRequestIntentSlotObject> slots) {
		this.slots = slots;
	}
	
	@Override
	public String toString() {
		return "AlexaRequestIntent [name=" + name + ", slots=" + slots + "]";
	}
}
