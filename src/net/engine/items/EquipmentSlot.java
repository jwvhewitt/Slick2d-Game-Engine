package net.engine.items;

import net.engine.game.GameState;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.state.StateBasedGame;

public class EquipmentSlot extends Slot {
	
	private int equipedStrength;
	private int equipedAgility;
	private int equipedIntelligence;
	private int equipedEndurance;
	
	private Image itemSprite;
	
	private Item equipedItem;

	public EquipmentSlot(float x, float y) {
		super(x, y);
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) {
		equipedStrength = 0;
		equipedAgility = 0;
		equipedIntelligence = 0;
		equipedEndurance = 0;
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) {
		if(equipedItem != null) {
			g.drawImage(equipedItem.getSprite(), this.x, this.y);
		}
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) {
		if(equipedItem != null) {
			itemSprite = equipedItem.getSprite();
		}
	}
	
	public void equipItem(Item item) {
		this.unequipItem(equipedItem);
		equipedItem = item;
		
		equipedStrength = item.strength;
		equipedAgility = item.agility;
		equipedIntelligence = item.intelligence;
		equipedEndurance = item.endurance;
		
		GameState.levelHandler.player.addStrength(equipedStrength);
		GameState.levelHandler.player.addAgility(equipedAgility);
		GameState.levelHandler.player.addIntelligence(equipedIntelligence);
		GameState.levelHandler.player.addEndurance(equipedEndurance);
	}
	
	public void unequipItem(Item item) {
		GameState.levelHandler.player.addStrength(-equipedStrength);
		GameState.levelHandler.player.addAgility(-equipedAgility);
		GameState.levelHandler.player.addIntelligence(-equipedIntelligence);
		GameState.levelHandler.player.addEndurance(-equipedEndurance);
		
		equipedStrength = 0;
		equipedAgility = 0;
		equipedIntelligence = 0;
		equipedEndurance = 0;
		
		if(equipedItem != null) {
			GameState.levelHandler.player.inventory.add(equipedItem);
		}
		
		equipedItem = null;
	}
}
