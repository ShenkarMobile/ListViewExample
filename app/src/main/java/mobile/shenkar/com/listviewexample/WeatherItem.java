package mobile.shenkar.com.listviewexample;

public class WeatherItem {
	
	private String day;
	private String 	description;
	private int degree;
	private int imageResource;
	
	
	public WeatherItem(String day, String description, int degree,int imageResource) {
		super();
		this.day = day;
		this.description = description;
		this.degree = degree;
		this.imageResource =  imageResource;
		
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	public int getImageResource() {
		return imageResource;
	}
	public void setImageResource(int imageResource) {
		this.imageResource = imageResource;
	}

}
