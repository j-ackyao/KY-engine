package ky;

import java.util.ArrayList;

public class Entity {
	
	int[] position = null;
	ArrayList<Asset> assets = new ArrayList<Asset>();
	
	public Entity(int x, int y) {
		position = new int[]{x, y};
	}
	
	public void addAsset(Asset asset) {
		assets.add(asset);
	}
	
	public Asset getAsset(String name) {
		for(Asset asset : assets) {
			if(asset.getName().equals(name)) {
				return asset;
			}
		}
		return null;
	}
	
	public void setPos(int x, int y) {
		position[0] = x;
		position[1] = y;
	}
	
}
