package down.to.chat.connector;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import down.to.chat.R;
import down.to.chat.enums.Availability;
import down.to.chat.neighbor.Neighbor;
import down.to.chat.user.AsyncUserData;

/**
 * Sample connector used to test UI.
 * 
 * @author Matthew
 *
 */
public class TestConnector implements AsynchronousConnector {

	private Context context;
	
	public TestConnector(Context ctx) {
		this.context = ctx;
	}
	
	@Override
	public List<Neighbor> getNeighbors() {
		// TODO Auto-generated method stub
		List<Neighbor> neighbors = new ArrayList<Neighbor>();
		Bitmap largeIcon = BitmapFactory.decodeResource(context.
				getResources(),	R.drawable.ic_action_user);
		
		neighbors.add(new Neighbor("name1","id1",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name2","id2",Availability.UNAVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name3","id3",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name4","id1",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name5","id2",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name6","id3",Availability.UNAVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name7","id1",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name8","id2",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name9","id3",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name10","id1",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name11","id2",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name12","id3",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name13","id1",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name14","id2",Availability.AVAILABLE, largeIcon));
		neighbors.add(new Neighbor("name15","id3",Availability.AVAILABLE, largeIcon));
		
		return neighbors;
	}

	@Override
	public void setAvailability(Availability avail) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setData(AsyncUserData data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

}
