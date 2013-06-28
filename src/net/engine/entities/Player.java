package net.engine.entities;

import net.engine.game.GameState;
import net.engine.graphics.ISpriteSheet;
import net.engine.items.EquipmentSlot;
import net.engine.items.Inventory;
import net.engine.tiles.SolidTile;
import net.engine.tiles.Tile;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

public class Player extends Mob {
	
	private boolean blockedRight;
	private boolean blockedLeft;
	private boolean blockedUp;
	private boolean blockedDown;
	
	private boolean isWalking;
	
	private int animationFrameTimer = 175;
	private Animation walkingLeft = new Animation();
	private Animation walkingRight = new Animation();
	private Animation walkingDown = new Animation();
	private Animation walkingUp = new Animation();
	private Image standing = ISpriteSheet.playerSheet.getSubImage(0, 0);
	
	public EquipmentSlot headArmorSlot;
	public EquipmentSlot bodyArmorSlot;
	public EquipmentSlot legArmorSlot;
	public EquipmentSlot mainHandSlot;
	public EquipmentSlot offHandSlot;
	public EquipmentSlot trinketSlot;
	public EquipmentSlot ringSlot;
	public EquipmentSlot runeSlot;
	public EquipmentSlot amuletSlot;
	
	private int strength;
	private int agility;
	private int intelligence;
	private int endurance;
	
	public Inventory inventory;
	
	private int boxWidth = 28;
	private int boxHeight = 28;
	
	public Player(float x, float y) {
		super(x, y);
		strength = 0;
		agility = 0;
		intelligence = 0;
		endurance = 0;
		inventory = new Inventory(30);
		speed = 2;
		sprite = ISpriteSheet.playerSheet.getSubImage(0, 0);
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) {
		super.init(container, game);
		this.setBoundingBox(x, y, boxWidth, boxHeight);
		setAnimations();
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
		handleBlockCollisions();
		handleMovements(container);
		this.setBoundingBox(x, y, boxWidth, boxHeight);
	}
	
	public void handleMovements(GameContainer container) {
		Input input = container.getInput();
		
		int xb = 0;
		int yb = 0;
		
		if(!blockedUp) {
			if(input.isKeyDown(input.KEY_W)) {
				sprite = walkingUp.getCurrentFrame();
				walkingUp.draw(x, y);
				isWalking = true;
				yb--;
			}
		}
		if(!blockedDown) {
			if(input.isKeyDown(input.KEY_S)) {
				sprite = walkingDown.getCurrentFrame();
				walkingDown.draw(x, y);
				isWalking = true;
				yb++;
			}
		}
		if(!blockedLeft) {
			if(input.isKeyDown(input.KEY_A)) {
				sprite = walkingLeft.getCurrentFrame();
				walkingLeft.draw(x, y);
				isWalking = true;
				xb--;
			}
		}
		if(!blockedRight) {
			if(input.isKeyDown(input.KEY_D)) {
				sprite = walkingRight.getCurrentFrame();
				walkingRight.draw(x, y);
				isWalking = true;
				xb++;
			}
		}
		
		if(!isWalking) {
			this.sprite = standing;
		}
		
		if(xb == 0 && yb == 0) {
			isWalking = false;
		}
		
		if(xb != 0 || yb != 0) {
			move(xb, yb);
		}
	}
	
	public void handleBlockCollisions() {
		blockedRight = false;
		blockedLeft = false;
		blockedUp = false;
		blockedDown = false;
		for(Tile tile : GameState.levelHandler.mapTiles) {
			if(tile instanceof SolidTile) {
				if(this.collides(tile)) {
					if(this.x + boxWidth == tile.xPos()) {
						blockedRight = true;
					}
					if(this.y + boxHeight == tile.yPos()) {
						blockedDown = true;
					}
					if(this.x == tile.xPos() + tile.getBoundingBox().getWidth()) {
						blockedLeft = true;
					}
					if(this.y == tile.yPos() + tile.getBoundingBox().getHeight()) {
						blockedUp = true;
					}
				}
			}
		}
		for(Tile tile : GameState.levelHandler.sceneryTiles) {
			if(tile instanceof SolidTile) {
				if(this.collides(tile)) {
					if(this.x + boxWidth == tile.xPos()) {
						blockedRight = true;
					}
					if(this.y + boxHeight == tile.yPos()) {
						blockedDown = true;
					}
					if(this.x - boxWidth == tile.xPos()) {
						blockedLeft = true;
					}
					if(this.y - boxHeight == tile.yPos()) {
						blockedUp = true;
					}
				}
			}
		}
	}
	
	public void setAnimations() {
		//walking left
			walkingLeft.addFrame(ISpriteSheet.playerSheet.getSubImage(0, 1), animationFrameTimer);
			walkingLeft.addFrame(ISpriteSheet.playerSheet.getSubImage(1, 1), animationFrameTimer);
			walkingLeft.addFrame(ISpriteSheet.playerSheet.getSubImage(2, 1), animationFrameTimer);
		//walking right
			walkingRight.addFrame(ISpriteSheet.playerSheet.getSubImage(0, 2), animationFrameTimer);
			walkingRight.addFrame(ISpriteSheet.playerSheet.getSubImage(1, 2), animationFrameTimer);
			walkingRight.addFrame(ISpriteSheet.playerSheet.getSubImage(2, 2), animationFrameTimer);
		//walking down
			walkingDown.addFrame(ISpriteSheet.playerSheet.getSubImage(0, 0), animationFrameTimer);
			walkingDown.addFrame(ISpriteSheet.playerSheet.getSubImage(1, 0), animationFrameTimer);
			walkingDown.addFrame(ISpriteSheet.playerSheet.getSubImage(2, 0), animationFrameTimer);
		//walking up
			walkingUp.addFrame(ISpriteSheet.playerSheet.getSubImage(0, 3), animationFrameTimer);
			walkingUp.addFrame(ISpriteSheet.playerSheet.getSubImage(1, 3), animationFrameTimer);
			walkingUp.addFrame(ISpriteSheet.playerSheet.getSubImage(2, 3), animationFrameTimer);
	}

	public int getStrength() {
		return strength;
	}

	public int getAgility() {
		return agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getEndurance() {
		return endurance;
	}

	public void addStrength(int strength) {
		this.strength += strength;
	}

	public void addAgility(int agility) {
		this.agility += agility;
	}

	public void addIntelligence(int intelligence) {
		this.intelligence += intelligence;
	}

	public void addEndurance(int endurance) {
		this.endurance += endurance;
	}
}
