package mobile.shenkar.com.listviewexample;

import java.util.ArrayList;
import java.util.List;

public class Weathercontroller  implements IWeatherController
{
	private IDataAcces dao;
	Weathercontroller()
	{
		descriptionList = new ArrayList<String>();
		descriptionList.add("Hard snow");
		descriptionList.add("Rainy day");
		descriptionList.add("Cloudy day");
		descriptionList.add("Sunny day");
		dao = MoockDAO.getInstance();
	}
	private List<String> descriptionList;

	public List<WeatherItem> GetWeather() {
		return dao.GetWeather();
	}
}
