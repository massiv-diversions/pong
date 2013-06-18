package com.github.massiv_diversions.engine;

import java.awt.Graphics2D;

public class StateManager {

	private EngineDetails ed;
	private GameState state;

	public StateManager(EngineDetails ed, GameState initialState) {
		this.ed = ed;
		this.state = initialState;
	}

	protected void update(ControlData cd) { state.update(cd); }

	protected void render(Graphics2D g) { state.render(g); }

	protected void next() {
		GameState nextState = state.next(ed);
		if (nextState != null)
			state = nextState;
	}

}