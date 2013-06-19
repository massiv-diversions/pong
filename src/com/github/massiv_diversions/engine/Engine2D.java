package com.github.massiv_diversions.engine;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import javax.swing.*;

public class Engine2D {

	private ControlData cd;
	private EngineDetails ed;
	private Graphics2D graphics;
	private JFrame frame;
	private JPanel panel;
	private StateManager sm;
	private Timer timer;

	public Engine2D(ControlData cd, EngineDetails ed, StateManager sm) {
		// store arguments
		this.cd = cd;
		this.ed = ed;
		this.sm = sm;

		// setup panel
		panel = new JPanel();
		panel.setPreferredSize(ed.size());

		// setup frame
		frame = new JFrame();
		frame.setTitle(ed.title());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(new ControlListener());
		frame.add(panel);
		frame.pack();

		// setup timer
		timer = new Timer(ed.delay(), new FrameListener());
		timer.setCoalesce(true);
	}

	public void start() {
		frame.setVisible(true);
		graphics = (Graphics2D) panel.getGraphics();
		timer.start();
	}

	private void frame() {
		sm.update(cd);
		Rectangle2D toClear = panel.getVisibleRect();
		int clearWidth = (int) toClear.getWidth();
		int clearHeight = (int)toClear.getHeight();
		graphics.clearRect(0, 0, clearWidth, clearHeight);
		panel.setSize(ed.size());
		frame.pack();
		sm.render(graphics);
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