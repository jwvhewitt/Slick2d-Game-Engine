package net.engine.tiles.scenery;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import net.engine.tiles.SolidTile;

public class GraniteStump extends SolidTile {

	public GraniteStump(float x, float y) {
		super(x, y);
		try {
			this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/granite_stump.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
