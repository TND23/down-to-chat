package down.to.chat.factory;

import down.to.chat.connector.AWSConnector;
import down.to.chat.connector.BluetoothConnector;
import down.to.chat.connector.WifiDirectConnector;

/**
 * Factory for generating connectors. makes sure we only have one connector
 * of each type running at a time. Singleton so connectors aren't actually
 * forced to be singletons.
 * 
 * @author Matthew
 *
 */
public class ConnectorFactory {

	// various connectors
	private AWSConnector awsConnector;
	private WifiDirectConnector wifiDirectConnector;
	private BluetoothConnector bluetoothConnector;
	
	// singleton stuff
	private static ConnectorFactory factory = new ConnectorFactory();
	private ConnectorFactory() {};
	public static ConnectorFactory get() {
		return factory;
	}
	
	/**
	 * Lazily initialize AWSConnector
	 * @return reference to applications aws connector
	 */
	public AWSConnector getAWSConnector() {
		if(awsConnector == null){
			awsConnector = new AWSConnector();
		}
		return awsConnector;
	}
	
	/**
	 * Lazily initialize WifiDirectConnector
	 * @return reference to applications wifidirectconnector
	 */
	public WifiDirectConnector getWifiDirectConnector() {
		if(wifiDirectConnector == null){
			wifiDirectConnector = new WifiDirectConnector();
		}
		return wifiDirectConnector;
	}

	/**
	 * Lazily initialize BluetoothConnector
	 * @return reference to applications bluetoothconnector
	 */
	public BluetoothConnector getBluetoothConnector() {
		if(bluetoothConnector == null){
			bluetoothConnector = new BluetoothConnector();
		}
		return bluetoothConnector;
	}
}
