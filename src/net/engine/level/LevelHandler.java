package net.engine.level;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import net.engine.entities.Player;
import net.engine.tiles.Tile;

public class LevelHandler {

	Player player;
	
	public List<Tile> mapTiles = new ArrayList<Tile>();
	
	Component9x9Room room;
	
	public LevelHandler() {
		
	}
	
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		room = new Component9x9Room();
		room.generate(64, 64);
		player = new Player(500, 100);
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
		//System.out.println(mapTiles.size());
		player.update(container, game, delta);
	}
}
