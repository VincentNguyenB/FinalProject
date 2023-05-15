package com.hai_vincent.game.states;

import java.awt.Graphics2D;
import java.util.ArrayList;

import com.hai_vincent.game.util.KeyHandler;
import com.hai_vincent.game.util.MouseHandler;

public class GameStateManager {
	
	ArrayList<GameState> states;

	public GameStateManager() {
		states = new ArrayList<GameState>();
		states.add(new PlayState(this));
	}
	
	public void update() {
		for(int i = 0; i < states.size(); i++) {
			states.get(i).update();
		}
	}
	
	public void input(MouseHandler mouse, KeyHandler key) {
		for(int i = 0; i < states.size(); i++) {
			states.get(i).input(mouse, key);
		}
	}
	
	public void render(Graphics2D g) {
		for(int i = 0; i < states.size(); i++) {
			states.get(i).render(g);
		}
	}
	
}
