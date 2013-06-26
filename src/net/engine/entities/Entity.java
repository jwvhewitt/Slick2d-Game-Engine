package net.engine.entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

import net.engine.game.GameObject;

public abstract class Entity extends GameObject {

	public Entity(float x, float y) {
		super(x, y);
	}
	
	public abstract void init(GameContainer container, StateBasedGame game);
	public abstract void render(GameContainer container, StateBasedGame game, Graphics g);
	public abstract void update(GameContainer container, StateBasedGame game, int delta);
}
