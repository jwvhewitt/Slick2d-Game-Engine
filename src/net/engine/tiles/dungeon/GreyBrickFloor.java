package net.engine.tiles.dungeon;

import net.engine.tiles.BasicTile;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class GreyBrickFloor extends BasicTile {

	public GreyBrickFloor(float x, float y, int type) {
		super(x, y);
		try {
			switch(type) {
				case 0:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/floor/rect_gray0.png");
				break;
				case 1:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/floor/rect_gray1.png");
				break;
				case 2:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/floor/rect_gray2.png");
				break;
				case 3:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/floor/rect_gray3.png");
				break;
			}
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
