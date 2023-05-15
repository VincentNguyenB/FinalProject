package com.hai_vincent.game.states;

import java.awt.Graphics2D;

import com.hai_vincent.game.util.KeyHandler;
import com.hai_vincent.game.util.MouseHandler;

public abstract class GameState {
	
	private GameStateManager gsm;
	
	public GameState(GameStateManager gsm) {
		this.gsm = gsm;
	}
	
	public abstract void update();
	public abstract void input(MouseHandler mouse, KeyHandler key);
	public abstract void render(Graphics2D g);
	
}
 