package com.galactoise.alexamodel;

public class AlexaReprompt {

	private AlexaOutputSpeech outputSpeech;

	public AlexaOutputSpeech getOutputSpeech() {
		return outputSpeech;
	}

	public void setOutputSpeech(AlexaOutputSpeech outputSpeech) {
		this.outputSpeech = outputSpeech;
	}

	@Override
	public String toString() {
		return "AlexaReprompt [outputSpeech=" + outputSpeech + "]";
	}
}
