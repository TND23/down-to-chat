package down.to.chat.activities;

import java.util.List;

import down.to.chat.R;
import down.to.chat.connector.AsynchronousConnector;
import down.to.chat.connector.TestConnector;
import down.to.chat.neighbor.Neighbor;
import down.to.chat.neighbor.NeighborFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;

/**
 * Main activity using Neighbor fragment to generate list appearance of 
 * neighbor fragments. 
 * 
 * (( initial implementation. List view will be more efficient and allow better
 * access to neighbor elements ))
 * 
 * @author Matthew
 *
 */
public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.neighbor_scroll);
		
		// make sure the holder exists
		if( findViewById(R.id.neighbor_container) != null ){
		
			// make sure we haven't drawn the fragment yet
			if( savedInstanceState != null) {
				Log.i("MAIN", "Exiting due to existing saveInstanceState.");
				return;
			}
			
			AsynchronousConnector connector = new TestConnector(this);
			
			List<Neighbor> neighbors = connector.getNeighbors();
			
			for(Neighbor n : neighbors) {
				NeighborFragment nf = NeighborFragment.newInstance(n);
				Log.i("MAIN", "Adding neighbor " + n.getName());
				getSupportFragmentManager().beginTransaction().
					add(R.id.neighbor_container, nf).commit();
			}
			
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
