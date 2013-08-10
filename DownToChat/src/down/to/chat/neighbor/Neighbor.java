package down.to.chat.neighbor;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import down.to.chat.enums.Availability;

/**
 * Another user of the app who is nearby. Parcelable to allow passing in bundle
 * 
 * @author Matthew
 *
 */
public class Neighbor implements Parcelable {
	

	private String name;	// human readable name
	private String id; 		// unique id
	private Availability availability;
	private Bitmap photo;
	// TODO discovery time
	// TODO proximity
	
	public Neighbor(String name, String id, Availability avail, Bitmap photo){
		setName(name);
		setId(id);
		setAvailability(avail);
		setPhoto(photo);
	}
	
	// parcelling logic
	@Override
	public int describeContents() {
		return 0;
	}
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(getName());
		dest.writeString(getId());
		dest.writeString(availability.name());
		dest.writeParcelable(photo,0);
	}
	public Neighbor( Parcel in ) {		
		setName(in.readString());
		setId(in.readString());
		setAvailability(Availability.valueOf(in.readString()));
		setPhoto((Bitmap)in.readParcelable(Bitmap.class.getClassLoader()));
	}
	
	// all will have unique id.
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object other) {
		if(other instanceof Neighbor){
			return id.equals(((Neighbor)other).getId()); 
		}
		return false;
	}
	
	// manditory for all parcelable
    public static final Parcelable.Creator<Neighbor> CREATOR
	    = new Parcelable.Creator<Neighbor>() {
			public Neighbor createFromParcel(Parcel in) {
			    return new Neighbor(in);
			}
			
			public Neighbor[] newArray(int size) {
			    return new Neighbor[size];
			}
	};
	
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

	/**
	 * @return the photo
	 */
	public Bitmap getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(Bitmap photo) {
		this.photo = photo;
	}
	
}
