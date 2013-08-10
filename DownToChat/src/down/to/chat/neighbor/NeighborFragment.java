package down.to.chat.neighbor;

import down.to.chat.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Fragment representing a neighbor.  
 * 
 * @author Matthew
 *
 */
public class NeighborFragment extends Fragment {
	
	private static final String NEIGHBOR_KEY = "neighbor";

	/**
	 * Neighbor information is passed thru a bundle and state is not associated
	 * with the class
	 * @param neighbor this fragment represents
	 * @return the new fragment representing the input neighbor
	 */
	public static NeighborFragment newInstance(Neighbor neighbor) {
		NeighborFragment nf = new NeighborFragment();
		
		Bundle args = new Bundle();
		args.putParcelable(NEIGHBOR_KEY, neighbor);
		nf.setArguments(args);
		
		return nf;
	}
	
	/**
	 * Access the neighbor this Fragment represents
	 * @return neighbor
	 */
	public Neighbor getNeighbor() {
		return getArguments().getParcelable(NEIGHBOR_KEY);
	}
	
	@Override
	public View onCreateView( LayoutInflater inflater, ViewGroup container, 
			Bundle savedInstanceState) {
		if( container == null ){
			// copied from example, avoids building the object if it never
			// gets shown.
			return null;
		}
		// initialize 
		View neighborView = inflater.inflate(R.layout.neighbor_view, container, 
				false);
		TextView nameView = (TextView) neighborView.findViewById(R.id.name);
		nameView.setText(getNeighbor().getName());
		ImageView neighborImage = (ImageView) neighborView.findViewById(
				R.id.neighbor_image);
		neighborImage.setImageBitmap(getNeighbor().getPhoto());
		
		View neighborHolder = neighborView.findViewById(R.id.neighbor_holder);
		switch( getNeighbor().getAvailability() ) {
		case AVAILABLE:
			neighborHolder.setBackgroundColor(0xFF00FF00);
			break;
		case UNAVAILABLE:
			neighborHolder.setBackgroundColor(0xFFFF0000);
		default:
			break;	
		}
		return neighborView;
	}
}

