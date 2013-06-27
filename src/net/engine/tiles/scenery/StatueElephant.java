package net.engine.tiles.scenery;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import net.engine.tiles.SolidTile;

public class StatueElephant extends SolidTile {

	public StatueElephant(float x, float y) {
		super(x, y);
		try {
			this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/elephant_statue.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
