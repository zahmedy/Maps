package maps.tiles;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

public class Tile {

	private String tileURL;
	private int xTile;
	private int yTile;
	private int zoom;
	
	public Tile(int xtile,int ytile, int zoom) {
		this.xTile = xtile;
		this.yTile = ytile;
		this.zoom = zoom;
		this.tileURL = "http://a.tile.openstreetmap.org/" + this.zoom + "/" + this.xTile + "/" + this.yTile + ".png";
	}
	
	public int getxTile() {
		return xTile;
	}

	public void setxTile(int xTile) {
		this.xTile = xTile;
	}

	public int getyTile() {
		return yTile;
	}

	public void setyTile(int yTile) {
		this.yTile = yTile;
	}

	public int getZoom() {
		return zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}

	public void setTileURL(String tileURL) {
		this.tileURL = tileURL;
	}

	public String getTileURL() {
		return this.tileURL;
	}
	
	public ImageIcon getImageIcon() {
	ImageIcon image =null;	
    try {
        URL url = new URL(this.tileURL);
        image = new ImageIcon(url);
    }catch(MalformedURLException e){
        e.printStackTrace();
       
    }	
		return image;
	}
	public String toString() {
		return this.tileURL;
	}
}
