package down.to.chat.connector;

/**
 * Connector which connects using synchronous methods. The other party must 
 * also currently be connecting.
 * 
 * @author Matthew
 *
 */
public interface SynchronousConnector extends Connector {

	/**
	 * App will start trying to synchronously connect with other users. If 
	 * the connector is paused, willresume using previous allocated resources.
	 * stop() should be called once for every time start is called to make
	 * sure allocated resources are cleaned.
	 */
	public void start();
	
	/**
	 * Pause the connector, leaving resources intact but stops trying to 
	 * connect.
	 */
	public void pause();
	
	/**
	 * If app is trying to connect, stops trying to connect and cleans all 
	 * resources.
	 */
	public void stop();
}
