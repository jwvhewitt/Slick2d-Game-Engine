package net.engine.items;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

public abstract class Slot {

	protected float x;
	protected float y;
	
	public Slot(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void init(GameContainer container, StateBasedGame game);
	public abstract void render(GameContainer container, StateBasedGame game, Graphics g);
	public abstract void update(GameContainer container, StateBasedGame game, int delta);
}
