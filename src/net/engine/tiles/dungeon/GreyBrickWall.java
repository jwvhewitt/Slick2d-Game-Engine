package net.engine.tiles.dungeon;

import net.engine.tiles.SolidTile;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class GreyBrickWall extends SolidTile {

	public GreyBrickWall(float x, float y, int type) {
		super(x, y);
		try {
			switch(type) {
				case 1:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick1.png");
				break;
				case 2:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick2.png");
				break;
				case 3:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick3.png");
				break;
				case 4:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick4.png");
				break;
				case 5:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick5.png");
				break;
				case 6:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick6.png");
				break;
				case 7:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick7.png");
				break;
				case 8:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick8.png");
				break;
				case 9:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick9.png");
				break;
				case 10:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick10.png");
				break;
				case 11:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick11.png");
				break;
				case 12:
					this.sprite = new Image("/res/Dungeon Crawler Tiles/dc-dngn/wall/stone_brick12.png");
				break;
			}
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
