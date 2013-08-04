/**
 * 
 */
package down.to.chat.connector;

import java.util.List;

import down.to.chat.enums.Availability;
import down.to.chat.neighbor.Neighbor;

/**
 * @author Matthew
 *
 */
public class WifiDirectConnector implements SynchronousConnector {

	/* (non-Javadoc)
	 * @see down.to.chat.connector.Connector#getNeighbors()
	 */
	@Override
	public List<Neighbor> getNeighbors() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see down.to.chat.connector.Connector#setAvailability(down.to.chat.enums.Availability)
	 */
	@Override
	public void setAvailability(Availability avail) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see down.to.chat.connector.SynchronousConnector#start()
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see down.to.chat.connector.SynchronousConnector#pause()
	 */
	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see down.to.chat.connector.SynchronousConnector#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
