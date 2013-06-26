package net.engine.game;

import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;

public class GameObject {

	protected float x, y;
	protected Rectangle boundingBox;
	protected Image sprite;
	
	public GameObject(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float xPos() {
		return x;
	}
	
	public float yPos() {
		return y;
	}
	
	public Rectangle getBoundingBox() {
		return boundingBox;
	}
	
	public void setBoundingBox(int x, int y, int width, int height) {
		boundingBox = new Rectangle(x, y, width, height);
	}
	
	public void setBoundingBox(float x, float y, int width, int height) {
		boundingBox = new Rectangle(x, y, width, height);
	}
	
	public boolean collides(GameObject object) {
		if(this.boundingBox.intersects(object.boundingBox)) {
			return true;
		}
		return false;
	}
}
