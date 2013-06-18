package com.github.massiv_diversions.engine;

public class EngineDetails {

	private int delay;
	private int height;
	private int width;
	private String title;
	
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