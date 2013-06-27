package net.engine.tiles.scenery;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import net.engine.tiles.SolidTile;

public class StatueOrc extends SolidTile {

	public StatueOrc(float x, float y) {
		super(x, y);
		try {
			this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/dngn_orcish_idol.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
