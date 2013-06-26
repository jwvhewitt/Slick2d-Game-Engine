package net.engine.tiles;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class TestTile extends BasicTile {

	public TestTile(float x, float y) {
		super(x, y);
		try {
			this.sprite = new Image("/res/blocks/grass.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
