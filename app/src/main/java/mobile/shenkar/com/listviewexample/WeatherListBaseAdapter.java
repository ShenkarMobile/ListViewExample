package mobile.shenkar.com.listviewexample;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherListBaseAdapter extends BaseAdapter {

	public WeatherListBaseAdapter(Context context, List<WeatherItem> items) {
		this.items = items;
		this.context = context;
	}

	static class ViewHolder {
		TextView tv_description;
		TextView tv_degree;
		TextView tv_day;
		ImageView img_itemImage;
	}

	private Context context;
	private List<WeatherItem> items;

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		if (this.items != null && items.size() > position)
			return this.items.get(position);
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = LayoutInflater.from(context).inflate(
					R.layout.list_view_item, null);
			holder = new ViewHolder();
			holder.tv_day = (TextView) convertView
					.findViewById(R.id.textView_day);
			holder.tv_description = (TextView) convertView
					.findViewById(R.id.textView_description);
			holder.tv_degree = (TextView) convertView
					.findViewById(R.id.textView_degree);
			holder.img_itemImage = (ImageView) convertView
					.findViewById(R.id.imageView1);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		holder.tv_day.setText(items.get(position).getDay());
		holder.tv_description.setText(items.get(position).getDescription());
		holder.tv_degree.setText(String.valueOf(items.get(position).getDegree()));
		holder.img_itemImage.setImageResource(items.get(position).getImageResource());
		return convertView;
	}

}
