package net.engine.items;

import net.engine.game.GameObject;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.state.StateBasedGame;

public abstract class Item extends GameObject {
	
	protected int strength;
	protected int agility;
	protected int intelligence;
	protected int endurance;
	
	public Item(float x, float y) {
		super(x, y);
	}
	
	public abstract void useItem();
	public abstract void init(GameContainer container, StateBasedGame game);
	public abstract void render(GameContainer container, StateBasedGame game, Graphics g);
	public abstract void update(GameContainer container, StateBasedGame game, int delta);
	
	public Image getSprite() {
		return this.sprite;
	}
}
