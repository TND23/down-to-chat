package down.to.chat.neighbor;

import down.to.chat.enums.Availability;

/**
 * Another user of the app who is nearby.
 * 
 * @author Matthew
 *
 */
public class Neighbor {
	

	private String name;	// human readable name
	private String id; 	// unique id
	private Availability availability;
	// TODO discovery time
	// TODO proximity
	// TODO photo
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the availability
	 */
	public Availability getAvailability() {
		return availability;
	}
	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(Availability availability) {
		this.availability = availability;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
}
