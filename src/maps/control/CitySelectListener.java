package maps.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import maps.Main;
import maps.MapGUI;
import maps.cities.City;
import maps.tiles.Tile;
import maps.tiles.TileUtils;

public class CitySelectListener implements ActionListener {

	private MapGUI mapGUI;
	
	public CitySelectListener(MapGUI mapGUI) {
		this.mapGUI = mapGUI;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.mapGUI.setReferenceTile(TileUtils.getTile(this.mapGUI.getListOfCities().getItemAt((this.mapGUI.getListOfCities().getSelectedIndex()))));
	}
}
