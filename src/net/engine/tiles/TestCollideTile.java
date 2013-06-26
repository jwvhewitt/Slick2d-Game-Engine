package net.engine.tiles;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class TestCollideTile extends SolidTile {

	public TestCollideTile(float x, float y) {
		super(x, y);
		try {
			this.sprite = new Image("/res/blocks/stone.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
