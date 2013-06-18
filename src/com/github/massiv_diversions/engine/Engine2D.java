package com.github.massiv_diversions.engine;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Engine2D {

	private ControlData cd;
	private EngineDetails ed;
	private JFrame frame;
	private JPanel panel;
	private StateManager sm;
	private Timer timer;

	public Engine2D(ControlData cd, EngineDetails ed, StateManager sm) {
		// store arguments
		this.cd = cd;
		this.ed = ed;
		this.sm = sm;

		// setup frame
		frame = new JFrame();
		frame.setSize(ed.width(), ed.height());
		frame.setTitle(ed.title());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(new ControlListener());

		// setup panel

		// setup timer
		timer = new Timer(ed.delay(), new FrameListener());
		timer.setCoalesce(true);
	}

	public void start() {
		frame.setVisible(true);
		timer.start();
	}

	public void frame() {
		sm.update(cd);
		sm.render((Graphics2D) panel.getGraphics());
		sm.next();
	}

	private class ControlListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			cd.press(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			cd.release(e.getKeyCode());
		}

	}

	private class FrameListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			frame();
		}

	}


}