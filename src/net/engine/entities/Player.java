package net.engine.entities;

import net.engine.game.GameObject;
import net.engine.game.GameState;
import net.engine.tiles.SolidTile;
import net.engine.tiles.Tile;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Player extends Mob {
	
	private boolean blockedRight;
	private boolean blockedLeft;
	private boolean blockedUp;
	private boolean blockedDown;

	public Player(float x, float y) {
		super(x, y);
		speed = 2;
		try {
			sprite = new Image("/res/entities/player.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) {
		super.init(container, game);
		this.setBoundingBox(x, y, 32, 32);
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) {
		super.render(container, game, g);
		g.setColor(Color.white);
		g.draw(boundingBox);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) {
		super.update(container, game, delta);
		blockedRight = false;
		blockedLeft = false;
		blockedUp = false;
		blockedDown = false;
		handleBlockCollisions();
		handleMovements(container);
		this.setBoundingBox(x, y, 32, 32);
		
		System.out.println("Player: " + "xPos: " + x + ", yPos: " + y);
	}
	
	public void handleMovements(GameContainer container) {
		Input input = container.getInput();
		
		int xb = 0;
		int yb = 0;
		
		if(!blockedUp) {
			if(input.isKeyDown(input.KEY_W)) {
				yb--;
			}
		}
		if(!blockedDown) {
			if(input.isKeyDown(input.KEY_S)) {
				yb++;
			}
		}
		if(!blockedLeft) {
			if(input.isKeyDown(input.KEY_A)) {
				xb--;
			}
		}
		if(!blockedRight) {
			if(input.isKeyDown(input.KEY_D)) {
				xb++;
			}
		}
		
		if(xb != 0 || yb != 0) {
			move(xb, yb);
		}
	}
	
	public void handleBlockCollisions() {
		for(Tile tile : GameState.levelHandler.mapTiles) {
			if(tile instanceof SolidTile) {
				if(this.collides(tile)) {
					if(this.x + 32 == tile.xPos()) {
						blockedRight = true;
					}
					if(this.y + 32 == tile.yPos()) {
						blockedDown = true;
					}
					if(this.x - 32 == tile.xPos()) {
						blockedLeft = true;
					}
					if(this.y - 32 == tile.yPos()) {
						blockedUp = true;
					}
				}
			}
		}
	}
}
