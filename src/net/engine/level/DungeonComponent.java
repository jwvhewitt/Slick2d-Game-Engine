package net.engine.level;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;

public abstract class DungeonComponent {

	public DungeonComponent() {
		
	}
	
	public abstract void init(GameContainer container, StateBasedGame game);
	public abstract void generate(float x, float y);
}
