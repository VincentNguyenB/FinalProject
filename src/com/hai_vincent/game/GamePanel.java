package com.hai_vincent.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.hai_vincent.game.states.GameStateManager;
import com.hai_vincent.game.util.KeyHandler;
import com.hai_vincent.game.util.MouseHandler;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable {
	
	public static int width;
	public static int height;
	
	private Thread thread;
	private boolean running = false;
	
	private BufferedImage img;
	private Graphics2D g;
	
	private MouseHandler mouse;
	private KeyHandler key;
	
	private GameStateManager gsm;
	
	@SuppressWarnings("static-access")
	public GamePanel(int width, int height) {
		this.width = width;
		this.height = height;
		
		setPreferredSize(new Dimension(width, height));
		setFocusable(true);
		requestFocus();
	}
	
	public void addNotify() {
		super.addNotify();
		
		if(thread == null) {
			thread = new Thread(this, "GameThread");
			thread.start();
		}	
	}
	
	public void init() {
		running = true;
		
		img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		g = (Graphics2D) img.getGraphics();
		
		mouse = new MouseHandler(this);
		key = new KeyHandler(this);
		
		gsm = new GameStateManager();
	}
	
	public void run() {
		init();
		
		final double GAME_HERTZ = 60.0;
		final double TimeBeforeUpdate = 1000000000 / GAME_HERTZ;
		
		final int MustUpdateBeforeRender = 5;
		
		double LastUpdateTime = System.nanoTime();
		double LastRenderTime;
		
		final double TARGET_FPS = 60;
		final double TotalTimeBeforeRender = 1000000000 / TARGET_FPS;
		
		int FrameCount = 0;
		int LastSecondTime = (int) (LastUpdateTime / 1000000000);
		int OldFrameCount = 0;
		
		while(running) {			
			double now = System.nanoTime();
			int UpdateCount = 0;
			while(((now - LastUpdateTime) > TimeBeforeUpdate) && (UpdateCount < MustUpdateBeforeRender)) {
				update();
				input(mouse, key);
				LastUpdateTime += TimeBeforeUpdate;
				UpdateCount++;
			}
			
			if(now - LastUpdateTime > TimeBeforeUpdate) {
				LastUpdateTime = now - TimeBeforeUpdate;
			}
			
			input(mouse, key);
			render();
			draw();
			LastRenderTime = now;
			FrameCount++;
			
			int thisSecond = (int) (LastUpdateTime / 1000000000);
			if(thisSecond > LastSecondTime) {
				if(FrameCount != OldFrameCount) {
					System.out.println("NEW SECOND " + thisSecond + " " + FrameCount);
					OldFrameCount = FrameCount;
				}
				FrameCount = 0;
				LastSecondTime = thisSecond;
			}
			
			while(now - LastRenderTime < TotalTimeBeforeRender && now - LastUpdateTime < TimeBeforeUpdate) {
				Thread.yield();	
				
				try {
					Thread.sleep(1);
				} catch (Exception e) {
					System.out.println("YIELDING THREAT ERROR");
				}
				now = System.nanoTime();
			}
			
		}
	}
		
	public void update() {
		gsm.update();
	}
	 
	public void input(MouseHandler mouse, KeyHandler key) {
		gsm.input(mouse, key);
	}
	
	public void render() {
		if(g != null) {
			g.setColor(new Color(66, 135, 242));
			g.fillRect(0, 0, width, height);
			gsm.render(g);
		}
	}
	
	public void draw() {
		Graphics g2 = (Graphics) this.getGraphics();
		g2.drawImage(img, 0, 0, width, height, null);
		g2.dispose();
	}
}
