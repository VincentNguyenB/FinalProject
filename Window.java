package com.hai_vincent.game;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame {
	
	public Window() {
		setTitle("EPIC RPG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new GamePanel(1280, 720));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
