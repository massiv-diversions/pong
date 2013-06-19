package com.github.massiv_diversions.engine;

import java.awt.Graphics2D;

public interface GameState {

	void update(ControlData cd);

	void render(Graphics2D g);

	GameState next();

}