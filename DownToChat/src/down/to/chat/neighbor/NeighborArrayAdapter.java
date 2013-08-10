package down.to.chat.neighbor;

import down.to.chat.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Array adapter to display neighbors. This allows us to add neighbors to the
 * backing array in the background consistently and not have to worry about
 * directly updating the UI.
 * 
 * @author Matthew
 */
public class NeighborArrayAdapter extends ArrayAdapter<Neighbor> {

	private Context context;
	
	public NeighborArrayAdapter(Context context, int textViewResourceId) {
		super(context, textViewResourceId);
		
		this.context = context;
	}


	/**
	 * Draw the view associated with the neighbor at position in the backing
	 * array
	 * @param position the index of neighbor being drawn
	 * @param convertView
	 * @param parent parent view group of voncertView
	 * @return view representation on neighbor at position
	 */
	public View getView(int position, View convertView, ViewGroup parent) {
		Neighbor neighbor = getItem(position);
		ViewHolder holder;
		
		// check if view already existed
		if( convertView == null ) {
	        LayoutInflater mInflater = (LayoutInflater) context
	                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
	        convertView = mInflater.inflate(R.layout.neighbor_view, null);
			holder = new ViewHolder();
			holder.neighborImage = (ImageView) convertView.
					findViewById(R.id.neighbor_image);
			holder.neighborName = (TextView) convertView.
					findViewById(R.id.name);
			holder.background = (View) convertView.
					findViewById(R.id.neighbor_holder);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		// update values based on neighbor
		holder.neighborImage.setImageBitmap(neighbor.getPhoto());
		holder.neighborName.setText(neighbor.getName());
		switch( neighbor.getAvailability() ) {
		case AVAILABLE:
			holder.background.setBackgroundResource(
					android.R.color.holo_green_dark);
			break;
		case UNAVAILABLE:
			holder.background.setBackgroundResource(
					android.R.color.holo_red_dark);
		default:
			break;	
		}
		
		return convertView;
	}
	
	/**
	 * ViewHolder pattern is used to cache references to views and speed up 
	 * finding view related to a list item. It is stored as the Tag associated
	 *  with a view. Call getTag() to retrieve it.
	 */
	private class ViewHolder {
		ImageView neighborImage;
		TextView neighborName;
		View background;
	}
	
}
