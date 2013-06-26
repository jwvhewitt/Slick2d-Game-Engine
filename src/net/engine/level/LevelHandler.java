package net.engine.level;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import net.engine.entities.Player;
import net.engine.tiles.TestCollideTile;
import net.engine.tiles.TestTile;
import net.engine.tiles.Tile;

public class LevelHandler {

	Player player;
	
	public List<Tile> mapTiles = new ArrayList<Tile>();
	
	public LevelHandler() {
		
	}
	
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		mapTiles.add(new TestTile(250, 250));
		mapTiles.add(new TestCollideTile(300, 300));
		player = new Player(100, 100);
		player.init(container, game);
	}

	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		for(Tile tile : mapTiles) {
			tile.render(container, game, g);
		}
		player.render(container, game, g);
	}

	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		for(Tile tile : mapTiles) {
			tile.update(container, game, delta);
		}
		player.update(container, game, delta);
	}
}
