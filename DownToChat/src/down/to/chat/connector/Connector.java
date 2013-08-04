package down.to.chat.connector;

import java.util.List;

import down.to.chat.enums.Availability;
import down.to.chat.neighbor.Neighbor;

/**
 * Basic interface for connecting with neighbors
 * 
 * @author Matthew
 *
 */
public interface Connector {

	/**
	 * @return a list of all the neighbors in the local vicinity. 
	 */
	public List<Neighbor> getNeighbors();
	
	/**
	 * Set the users availability which is visible to others via the connector.
	 * @param avail
	 */
	public void setAvailability(Availability avail);
	
}
