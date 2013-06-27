package net.engine.tiles;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

public class SolidTile extends BasicTile {

	public SolidTile(float x, float y) {
		super(x, y);
		this.isCollideable = true;
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) {
		// TODO Auto-generated method stub
		super.init(container, game);
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) {
		super.render(container, game, g);
		g.setColor(Color.white);
		g.draw(boundingBox);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) {
		super.update(container, game, delta);
		this.setBoundingBox(x, y, 32, 32);
	}

}
