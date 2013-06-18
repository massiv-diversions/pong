package com.github.massiv_diversions.engine;

public class Engine2D {

	private ControlData cd;
	private EngineDetails ed;
	private StateManager sm;
	
	public Engine2D(ControlData cd, EngineDetails ed, StateManager sm) {
		this.cd = cd;
		this.ed = ed;
		this.sm = sm;
	}
}