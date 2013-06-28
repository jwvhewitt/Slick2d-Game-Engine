package net.engine.items;

import net.engine.game.GameState;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;

public class ItemChestArmor extends Item {

	public ItemChestArmor(float x, float y) {
		super(x, y);
	}

	@Override
	public void useItem() {
		GameState.levelHandler.player.bodyArmorSlot.equipItem(this);
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) {
		
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) {
		g.drawImage(sprite, x, y);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) {
		
	}

}