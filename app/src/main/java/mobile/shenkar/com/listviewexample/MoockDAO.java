package mobile.shenkar.com.listviewexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoockDAO implements IDataAcces {

	private List<String> descriptionList;

	private String[] days = new String[] { "Sunday", "Monday", "Tuesday",
			"Wednesday", "Thursday", "Friday", "Saturday" };
	
	private static MoockDAO instance;

	private MoockDAO() {
		descriptionList = new ArrayList<String>();
		descriptionList.add("Hard snow");
		descriptionList.add("Rainy day");
		descriptionList.add("Cloudy day");
		descriptionList.add("Sunny day");
	}
	
	/*
	 * Single tone implement.
	 */
		public static MoockDAO getInstance()
		{
			if(instance ==  null)
				instance = new MoockDAO();
			return instance;
		}

	public List<WeatherItem> GetWeather() {
		return GenerateRandomWeather();
	}

	private List<WeatherItem> GenerateRandomWeather() {
		List<WeatherItem> weatherList = new ArrayList<WeatherItem>();
		for (int i = 0; i < 7; i++) {
			Random rand = new Random();

			int n = rand.nextInt(4);
			int image;
			switch (n) {
			case 0:
				image = R.drawable.snow;
				break;
			case 1:
				image = R.drawable.rain;
				break;
			case 2:
				image = R.drawable.cloud;
				break;
			case 3:
				image = R.drawable.sun;
				break;
			default:
				image = R.drawable.sun;
				break;
			}
			WeatherItem item = new WeatherItem(days[i], descriptionList.get(n),
					n * 10, image);
			weatherList.add(item);
		}
		return weatherList;
	}

}
