package down.to.chat.connector;

import java.util.List;

import down.to.chat.enums.Availability;
import down.to.chat.neighbor.Neighbor;
import down.to.chat.user.AsyncUserData;

/**
 * Connector which users post their where-abouts to AWS and can pull 
 * @author Matthew
 *
 */
public class AWSConnector implements AsynchronousConnector {

	@Override
	public List<Neighbor> getNeighbors() {
		// TODO Auto-generated method stub
		return null;
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
