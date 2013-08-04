package down.to.chat.connector;

import down.to.chat.user.AsyncUserData;

/**
 * Connector for finding peers asynchronously. Location and availability info 
 * is stored and can be pulled.
 * 
 * @author Matthew
 *
 */
public interface AsynchronousConnector extends Connector {

	/**
	 * Set the data of the user that will be visible to other connectors
	 */
	public void setData(AsyncUserData data);
	
	/**
	 * Make a user visible to other connectors
	 */
	public void show();
	
	/**
	 * Hides the user from other connectors.
	 */
	public void hide();
}
