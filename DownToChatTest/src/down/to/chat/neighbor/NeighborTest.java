package down.to.chat.neighbor;

import down.to.chat.enums.Availability;
import android.os.Parcel;
import android.test.AndroidTestCase;

public class NeighborTest extends AndroidTestCase {

	/**
	 * Test that the neighbors parcelling works correctly.
	 */
	public void testCreateFromParcel() {
		Parcel p = Parcel.obtain();
		p.writeString("name-test");
		p.writeString("id-test");
		p.writeString(Availability.AVAILABLE.name());
		p.setDataPosition(0);
		Neighbor test = new Neighbor(p);
		
		Neighbor expected = new Neighbor("name-test", "id-test", 
				Availability.AVAILABLE);
		
		assertEquals(expected.getId(), test.getId());
		assertEquals(expected.getName(), test.getName());
		assertEquals(expected.getAvailability(), test.getAvailability());
		p.recycle();
	}
	
	
	
	/**
	 * Test that neighbors write parcels correctly
	 */
	public void testWriteParcel() {
		Parcel p = Parcel.obtain();
		Neighbor expected = new Neighbor("name-test", "id-test", 
				Availability.AVAILABLE);
		
		expected.writeToParcel(p, 0);
		
		p.setDataPosition(0);
		assertEquals("name-test", p.readString());
		assertEquals("id-test", p.readString());
		assertEquals(Availability.AVAILABLE.name(), p.readString());
		p.recycle();
	}
}
