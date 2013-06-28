package net.engine.items;

import java.util.LinkedList;
import java.util.List;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.GameState;

public class Inventory {

	private int max;
	private boolean full;
	
	private List<Item> itemList = new LinkedList<Item>();
	
	public Inventory(int max) {
		this.max = max;
		this.full = false;
	}
	
	public boolean isFull() {
		return full;
	}
	
	public int getMax() {
		return max;
	}
	
	public void add(Item item) {
		if(!full) {
			itemList.add(item);
		}
	}
	
	public void remove(Item item) {
		if(item != null) {
			itemList.remove(itemList.indexOf(item));
		}
	}
	
	public synchronized List<Item> getItems() {
		return itemList;
	}
	
	public void update(GameContainer container, GameState state, int delta) {
		if(itemList.size() == max) {
			full = true;
		}
	}
}
