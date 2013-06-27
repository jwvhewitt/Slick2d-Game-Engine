package net.engine.graphics;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;


public class ISpriteSheet {
	
	public static ISpriteSheet playerSheet = new ISpriteSheet("/res/entities/playerSheet.png", 32, 32);
	
	private SpriteSheet sheet;
	
	public ISpriteSheet(String path, int width, int height) {
		try {
			sheet = new SpriteSheet(path, width, height);
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
	
	public Image getSubImage(int x, int y) {
		return sheet.getSubImage(x, y);
	}
}
