package down.to.chat.neighbor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
		
		TextView tv = new TextView(getActivity());
		
		return tv;
	}
}

