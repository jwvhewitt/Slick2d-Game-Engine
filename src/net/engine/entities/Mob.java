package net.engine.entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

public class Mob extends Entity {

	protected float speed;
	protected float aggroRange;
	
	protected int maxHealth;
	protected int maxMana;
	protected int baseDamage;
	
	public Mob(float x, float y) {
		super(x, y);
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) {
		
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) {
		g.drawImage(sprite, x, y);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) {
		
	}
	
	public void setPosition(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(float xa, float ya) {
		if(xa != 0 && ya != 0) {
			move(xa, 0);
			move(0, ya);
			return;
		}
		
		this.x += xa * speed;
		this.y += ya * speed;
	}

}
