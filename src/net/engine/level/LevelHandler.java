package net.engine.level;

import java.util.ArrayList;
import java.util.List;

import net.engine.entities.Entity;
import net.engine.entities.Player;
import net.engine.tiles.Tile;
import net.engine.tiles.scenery.AltarNormal;
import net.engine.tiles.scenery.GraniteStump;
import net.engine.tiles.scenery.StatueElephant;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class LevelHandler {

	Player player;
	
	public List<Tile> mapTiles = new ArrayList<Tile>();
	public List<Tile> sceneryTiles = new ArrayList<Tile>();
	private List<Entity> entities = new ArrayList<Entity>();
	
	Component9x9Room room;
	
	public LevelHandler() {
		
	}
	
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		room = new Component9x9Room();
		room.generate(64, 64);
		
		sceneryTiles.add(new GraniteStump(564, 500));
		sceneryTiles.add(new StatueElephant(564, 532));
		sceneryTiles.add(new AltarNormal(564, 564));
		player = new Player(500, 100);
		player.init(container, game);
	}

	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		for(Tile tile : mapTiles) {
			tile.render(container, game, g);
		}
		for(Tile tile : sceneryTiles) {
			tile.render(container, game, g);
		}
		for(Entity entity : entities) {
			entity.render(container, game, g);
		}
		player.render(container, game, g);
	}

	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		for(Tile tile : mapTiles) {
			tile.update(container, game, delta);
		}
		for(Tile tile : sceneryTiles) {
			tile.update(container, game, delta);
		}
		for(Entity entity : entities) {
			entity.update(container, game, delta);
		}
		player.update(container, game, delta);
	}
	
	public synchronized List<Entity> getEntities() {
		return entities;
	}
}
