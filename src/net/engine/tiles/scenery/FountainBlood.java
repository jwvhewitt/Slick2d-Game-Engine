package net.engine.tiles.scenery;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import net.engine.tiles.SolidTile;

public class FountainBlood extends SolidTile {

	public FountainBlood(float x, float y, int type) {
		super(x, y);
		try {
			switch(type) {
				case 1:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/dngn_blood_fountain.png");
				break;
				case 2:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/dngn_blood_fountain2.png");
				break;
			}
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
