package com.github.massiv_diversions.engine;

public class EngineDetails {

	private final int delay;
	private final int height;
	private final int width;
	private final String title;

	public EngineDetails(int width, int height, int delay, String title) {
		//TODO exceptions
		this.delay = delay;
		this.width = width;
		this.height = height;
		this.title = title;
	}

	public int delay() { return delay; }

	public int height() { return height; }

	public int width() { return width; }

	public String title() { return title; }

}