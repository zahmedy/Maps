package maps.cities;

public class City {

	private int population;
	private String name;
	private String region;
	private String country;
	private double latitude;
	private double longitude;
	
	public City(String country, String name, String region, int population, double latitude, double longitude) {
		this.population = population;
		this.name = name;
		this.region = region;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public String toString() {
		return this.population + " - " + this.name + ", " + this.region + ", " + this.country;
	}
	
	
}
