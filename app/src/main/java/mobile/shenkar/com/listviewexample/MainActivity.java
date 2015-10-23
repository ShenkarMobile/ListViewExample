package mobile.shenkar.com.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class MainActivity extends Activity {
	
	private IWeatherController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller =  new Weathercontroller();
        ListView  lv = (ListView) findViewById(R.id.whetherListView);
        if(lv!=null)
        {
        	WeatherListBaseAdapter adapter = new WeatherListBaseAdapter(this, controller.GetWeather());
        	lv.setAdapter(adapter);
        	lv.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					Toast.makeText(MainActivity.this, "Item number "+(position+1)+" was clicked" , Toast.LENGTH_LONG).show();
				}
			});
        }
    }
}
