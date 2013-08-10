package down.to.chat.activities;

import java.util.List;

import down.to.chat.R;
import down.to.chat.connector.AsynchronousConnector;
import down.to.chat.connector.TestConnector;
import down.to.chat.neighbor.Neighbor;
import down.to.chat.neighbor.NeighborArrayAdapter;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Main activity using list activity with arrayadapter to display neighbors.
 * 
 * @author Matthew
 *
 */
public class MainListActivity extends ListActivity {

	@Override
	protected void onCreate( Bundle savedInstanceState ){
		super.onCreate(savedInstanceState);
		
		// set to list view
		setContentView(R.layout.neighbor_list_layout);
		
		// associate adapter 
		ArrayAdapter<Neighbor> adapter = new NeighborArrayAdapter(this, 
				R.layout.neighbor_view);
		setListAdapter(adapter);
		
		// add neighbors to adapter
		AsynchronousConnector connector = new TestConnector(this);
		List<Neighbor> neighbors = connector.getNeighbors();
		adapter.addAll(neighbors);
	}
	
}
