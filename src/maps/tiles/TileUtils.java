package maps.tiles;

import java.util.ArrayList;

import maps.cities.City;

public class TileUtils {

	public static Tile getTile(City city) {

		double lon = city.getLongitude();
		double lan = city.getLatitude();
		int zoom = 6;

		Double xTile = ((lon+180)/360) * Math.pow(2, zoom);
		Double yTile = (1-(Math.log(Math.tan(lan*Math.PI/180)+1/Math.cos(lan*Math.PI/180)))/Math.PI)*Math.pow(2, zoom-1);

		int x = new Integer(xTile.intValue());
		int y = new Integer(yTile.intValue());

		Tile tile = new Tile(x,y,zoom);
		return tile;
	}
	

	public static ArrayList<Tile> getTileMap(Tile tile){
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		Tile eastTile = new Tile(tile.getxTile()+1,tile.getyTile(),tile.getZoom());
		Tile westTile = new Tile(tile.getxTile()-1,tile.getyTile(),tile.getZoom());
		
		Tile eastNorthTile = new Tile(tile.getxTile()+1,tile.getyTile()-1,tile.getZoom());
		Tile westNorthTile = new Tile(tile.getxTile()-1,tile.getyTile()-1,tile.getZoom());
		Tile northTile = new Tile(tile.getxTile(),tile.getyTile()-1,tile.getZoom());
		
		Tile eastSouthTile = new Tile(tile.getxTile()+1,tile.getyTile()+1,tile.getZoom());
		Tile southTile = new Tile(tile.getxTile(),tile.getyTile()+1,tile.getZoom());
		Tile westSouthTile = new Tile(tile.getxTile()-1,tile.getyTile()+1,tile.getZoom());
		
		
		tiles.add(westNorthTile);
		tiles.add(northTile);
		tiles.add(eastNorthTile);
		
		tiles.add(westTile);
		tiles.add(tile);
		tiles.add(eastTile);
		
		tiles.add(westSouthTile);
		tiles.add(southTile);
		tiles.add(eastSouthTile);
		
		return tiles;
	}
}
