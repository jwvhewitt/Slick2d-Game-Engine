package net.engine.tiles.scenery;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import net.engine.tiles.SolidTile;

public class FountainDry extends SolidTile {

	public FountainDry(float x, float y) {
		super(x, y);
		try {
			this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/dngn_dry_fountain.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
