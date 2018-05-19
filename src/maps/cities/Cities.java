package maps.cities;

import java.io.IOException;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Cities {

	private String filename;
	private ArrayList<City> cities;
	
	@SuppressWarnings("deprecation")
	public Cities(String filename) {
		this.filename = filename;
		this.cities = new ArrayList<>();
		try {
			for(String line:Files.readAllLines(Paths.get(this.filename))) {
				String ca = line.split(",")[0];
				String city = line.split(",")[1];
				String region = line.split(",")[2];
				Integer population = new Integer(line.split(",")[3]);
				Double lat = new Double(line.split(",")[4]);
				Double longi = new Double(line.split(",")[5]);
				City theCity = new City(ca,city,region,population,lat,longi);
				cities.add(theCity);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public City getDefaultCity(){
		City default1= new City("","","",1,1.0,1.0);
		for(City city :cities) {
			if(city.getName().contains("buffalo") && city.getRegion().equals("NY")) {
				return city;
			}
		}
		return default1;
	}
	public ArrayList<City> searchByName(String searchCra){
		ArrayList<City> results = new ArrayList<City>();
		
		for(City city :this.cities) {
			if(city.getName().contains(searchCra)) {
				results.add(city);
			}
		}
		Collections.sort(results, new Comparator<City>() {
			@Override
			public int compare(City o1, City o2) {
				if(o1.getPopulation() > o2.getPopulation()) {
					return -1;
				}
				if(o1.getPopulation() < o2.getPopulation()) {
					return 1;
				}
				return 0;
			}
		});
		return results;
	}
}
