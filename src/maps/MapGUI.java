package maps;

import java.awt.GridLayout;


import javax.swing.*;

import maps.cities.Cities;
import maps.cities.City;
import maps.control.CitySelectListener;
import maps.control.SearchListener;
import maps.control.TranslateListener;
import maps.tiles.Tile;
import maps.tiles.TileUtils;

public class MapGUI {
	
	private Cities cities;
	private City defaultCity;

	private JPanel mapPanel;
	
	private JLabel label;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	
	private Tile tile;

	private JTextField searchBar;
	private JComboBox<City> listOfCities;
	private JButton button;


	public MapGUI(Cities cities) {
		this.mapPanel = new JPanel();
		this.label = new JLabel();
		this.label1 = new JLabel();
		this.label2 = new JLabel();
		this.label3 = new JLabel();
		this.label4 = new JLabel();
		this.label5 = new JLabel();
		this.label6 = new JLabel();
		this.label7 = new JLabel();
		this.label8 = new JLabel();
		this.cities = cities;
		this.defaultCity = cities.getDefaultCity();
		this.tile = TileUtils.getTile(this.defaultCity);
//		getMapPanel();
	}

	public Cities getCities() {
		return cities;
	}
	public void setCities(Cities cities) {
		this.cities = cities;
	}

	public JTextField getSearchBar() {
		return searchBar;
	}
	public void setSearchBar(JTextField searchBar) {
		this.searchBar = searchBar;
	}
	public JComboBox<City> getListOfCities() {
		return listOfCities;
	}
	public void setListOfCities(JComboBox<City> listOfCities) {
		this.listOfCities = listOfCities;
	}
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
	
	public Tile getLabel() {
		return tile;
	}

//	public ImageIcon getLabel1() {
//		return TileUtils.getTileMap(tile).get(1).getImageIcon();
//	}
//
//	public ImageIcon getLabel2() {
//		return TileUtils.getTileMap(tile).get(2).getImageIcon();
//	}
//
//	public ImageIcon getLabel3() {
//		return TileUtils.getTileMap(tile).get(3).getImageIcon();
//	}
//
//	public ImageIcon getLabel4() {
//		return TileUtils.getTileMap(tile).get(4).getImageIcon();
//	}
//
//	public ImageIcon getLabel5() {
//		return TileUtils.getTileMap(tile).get(5).getImageIcon();
//	}
//
//	public ImageIcon getLabel6() {
//		return TileUtils.getTileMap(tile).get(6).getImageIcon();
//	}
//
//	public ImageIcon getLabel7() {
//		return TileUtils.getTileMap(tile).get(7).getImageIcon();
//	}
//
//	public ImageIcon getLabel8() {
//		return TileUtils.getTileMap(tile).get(8).getImageIcon();
//	}

	public void setReferenceTile(Tile tile) {
		this.tile = tile;
		this.label.setIcon(TileUtils.getTileMap(tile).get(0).getImageIcon());
		this.label1.setIcon(TileUtils.getTileMap(tile).get(1).getImageIcon());
		this.label2.setIcon(TileUtils.getTileMap(tile).get(2).getImageIcon());
		this.label3.setIcon(TileUtils.getTileMap(tile).get(3).getImageIcon());
		this.label4.setIcon(TileUtils.getTileMap(tile).get(4).getImageIcon());
		this.label5.setIcon(TileUtils.getTileMap(tile).get(5).getImageIcon());
		this.label6.setIcon(TileUtils.getTileMap(tile).get(6).getImageIcon());
		this.label7.setIcon(TileUtils.getTileMap(tile).get(7).getImageIcon());
		this.label8.setIcon(TileUtils.getTileMap(tile).get(8).getImageIcon());
	}
	public JPanel getMapPanel() {
		
		this.label.setIcon(TileUtils.getTileMap(tile).get(0).getImageIcon());
		this.label1.setIcon(TileUtils.getTileMap(tile).get(1).getImageIcon());
		this.label2.setIcon(TileUtils.getTileMap(tile).get(2).getImageIcon());
		this.label3.setIcon(TileUtils.getTileMap(tile).get(3).getImageIcon());
		this.label4.setIcon(TileUtils.getTileMap(tile).get(4).getImageIcon());
		this.label5.setIcon(TileUtils.getTileMap(tile).get(5).getImageIcon());
		this.label6.setIcon(TileUtils.getTileMap(tile).get(6).getImageIcon());
		this.label7.setIcon(TileUtils.getTileMap(tile).get(7).getImageIcon());
		this.label8.setIcon(TileUtils.getTileMap(tile).get(8).getImageIcon());
		
		this.mapPanel.setLayout(new GridLayout(3, 3));

		this.mapPanel.add(label);
		this.mapPanel.add(label1);
		this.mapPanel.add(label2);
		this.mapPanel.add(label3);
		this.mapPanel.add(label4);
		this.mapPanel.add(label5);
		this.mapPanel.add(label6);
		this.mapPanel.add(label7);
		this.mapPanel.add(label8);

		this.label.addMouseListener(new TranslateListener(this,-1,-1));
		this.label1.addMouseListener(new TranslateListener(this,0,-1));
		this.label2.addMouseListener(new TranslateListener(this,1,-1));
		this.label3.addMouseListener(new TranslateListener(this,-1,0));
		this.label4.addMouseListener(new TranslateListener(this,0,0));
		this.label5.addMouseListener(new TranslateListener(this,1,0));
		this.label6.addMouseListener(new TranslateListener(this,-1,1));
		this.label7.addMouseListener(new TranslateListener(this,0,1));
		this.label8.addMouseListener(new TranslateListener(this,1,1));

//		
//		this.mapPanel.validate();
//		this.mapPanel.repaint();

		return this.mapPanel;
	}

	public JPanel getSearchPanel() {
		JPanel panel = new JPanel();
		this.searchBar = new JTextField(10);
		searchBar.addKeyListener(new SearchListener(this,this.cities));
		this.listOfCities = new JComboBox<>();
		this.button = new JButton("Go!");
		this.button.addActionListener(new CitySelectListener(this));
		
		panel.add(searchBar);
		panel.add(listOfCities);
		panel.add(button);
		
		return panel;
	}
	
}
