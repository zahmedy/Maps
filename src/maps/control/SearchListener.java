package maps.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;

import maps.MapGUI;
import maps.cities.Cities;
import maps.cities.City;

public class SearchListener implements KeyListener{

	private MapGUI mapGUI;
	private Cities cities;
	
	public SearchListener(MapGUI mapGUI, Cities cities) {
		this.mapGUI = mapGUI;
		this.cities = cities;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		mapGUI.getListOfCities().removeAllItems();
		for(City city :this.cities.searchByName(mapGUI.getSearchBar().getText())){
			mapGUI.getListOfCities().addItem(city);
		}
		
	}

}
