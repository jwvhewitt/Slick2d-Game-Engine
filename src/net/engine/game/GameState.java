package net.engine.game;


import net.engine.level.LevelHandler;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends BasicGameState {
	
	public static LevelHandler levelHandler;
	
	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		levelHandler = new LevelHandler();
		levelHandler.init(container, game);
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		g.drawString("GameState", 50, 50);
		levelHandler.render(container, game, g);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		levelHandler.update(container, game, delta);
	}

	@Override
	public int getID() {
		return 2;
	}
}
