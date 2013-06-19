package com.github.massiv_diversions.engine;

import java.awt.Graphics2D;

public class StateManager {

	private GameState state;

	public StateManager(GameState initialState) {
		this.state = initialState;
	}

	protected void update(ControlData cd) { state.update(cd); }

	protected void render(Graphics2D g) { state.render(g); }

	protected void next() {
		GameState nextState = state.next();
		if (nextState != null)
			state = nextState;
	}

}