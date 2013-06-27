package net.engine.tiles.scenery;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import net.engine.tiles.SolidTile;

public class CrumbledColumn extends SolidTile {

	public CrumbledColumn(float x, float y) {
		super(x, y);
		try {
			this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/crumbled_column.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
