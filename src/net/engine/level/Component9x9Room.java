package net.engine.level;

import java.util.ArrayList;
import java.util.List;

import net.engine.game.GameState;
import net.engine.tiles.Tile;
import net.engine.tiles.dungeon.GreyBrickFloor;
import net.engine.tiles.dungeon.GreyBrickWall;
import net.engine.tiles.scenery.FountainBlood;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;

public class Component9x9Room extends DungeonComponent {

	private List<Tile> tiles = new ArrayList<Tile>();
	
	public Component9x9Room() {
		
	}
	
	@Override
	public void init(GameContainer container, StateBasedGame game) {
		
	}
	
	@Override
	public void generate(float x, float y) {
		//top wall
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (1*32), y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (2*32), y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (3*32), y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (4*32), y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (5*32), y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (6*32), y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (7*32), y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (8*32), y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (9*32), y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y, 1));
		//bottom wall
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (10*32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (1*32), y + (10*32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (2*32), y + (10*32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (3*32), y + (10*32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (4*32), y + (10*32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (5*32), y + (10*32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (6*32), y + (10*32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (7*32), y + (10*32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (8*32), y + (10*32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (9*32), y + (10*32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (10*32), 1));
		//left wall
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (1 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (2 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (3 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (4 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (5 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (6 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (7 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (8 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (9 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x, y + (10 * 32), 1));
		//right wall
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y, 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (1 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (2 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (3 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (4 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (5 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (6 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (7 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (8 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (9 * 32), 1));
			GameState.levelHandler.mapTiles.add(new GreyBrickWall(x + (10*32), y + (10 * 32), 1));
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				GameState.levelHandler.mapTiles.add(new GreyBrickFloor(x + 32 + (i*32), y + 32 + (j*32), 3));
			}
		}
	}

}
