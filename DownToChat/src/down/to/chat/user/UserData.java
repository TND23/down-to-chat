package down.to.chat.user;

import down.to.chat.enums.Availability;

/**
 * Data about an application user
 * @author Matthew
 *
 */
public class UserData {
	
	private String name;
	private String id;
	private Availability availability;
	//TODO photo
	
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

}
