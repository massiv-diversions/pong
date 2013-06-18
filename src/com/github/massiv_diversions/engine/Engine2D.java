package com.github.massiv_diversions.engine;

import javax.swing.*;

public class Engine2D {

	private ControlData cd;
	private EngineDetails ed;
	private JFrame frame;
	private StateManager sm;
	private Timer timer;
	
	public Engine2D(ControlData cd, EngineDetails ed, StateManager sm) {
		// store args
		this.cd = cd;
		this.ed = ed;
		this.sm = sm;
		
		// setup frame
		frame = new JFrame();
		frame.setSize(ed.width(), ed.height());
		frame.setTitle(ed.title());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // setup panel
        
        // setup timer
	}
	
	public void start() {
		frame.setVisible(true);
		timer.start();
	}
}