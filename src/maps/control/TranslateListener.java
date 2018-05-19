package maps.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import maps.MapGUI;
import maps.tiles.*;

public class TranslateListener implements MouseListener{
	
	private MapGUI mapGUI;
	private int x;
	private int y;
	
	public TranslateListener(MapGUI mapGUI,int x,int y) {
		this.mapGUI = mapGUI;
		this.x = x;
		this.y = y;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
			System.out.println(mapGUI.getLabel().getxTile());
			System.out.println(mapGUI.getLabel().getyTile());
			System.out.println("below is x and y");
			System.out.println(this.x);
			System.out.println(this.y);

			Tile tile = new Tile(mapGUI.getLabel().getxTile()+this.x,mapGUI.getLabel().getyTile()+this.y,6);
			mapGUI.setReferenceTile(tile);
			System.out.println("New tile :" + tile);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}

}
