package com.hai_vincent.game.states;

import java.awt.Color;
import java.awt.Graphics2D;

import com.hai_vincent.game.util.KeyHandler;
import com.hai_vincent.game.util.MouseHandler;

public class PlayState extends GameState{
	public PlayState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void update() {
		
	}
	
	public void input(MouseHandler mouse, KeyHandler key) {
		if(key.up.down) {
			System.out.println("'W' key is pressed");
		}
	}
	
	public void render(Graphics2D g) {
		g.setColor(Color.red);
		g.fillRect(100, 100, 64, 64);
	}
}
