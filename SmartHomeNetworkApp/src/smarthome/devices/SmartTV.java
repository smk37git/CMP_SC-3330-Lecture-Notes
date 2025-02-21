package smarthome.devices;

import smarthome.devices.status.DeviceState;

public class SmartTV extends NonCastableElectronicDevice {

	public boolean castDevice(CastableElectronicDevice device) {
		System.out.print("Casting " + device);
		return true;
	}
	
	

	@Override
	public String toString() {
		return "SmartTV [toString()=" + super.toString() + "]";
	}



	@Override
	public void powerOn() {
		System.out.println("Turning on SmartTV...");
		try {
			Thread.sleep(5000);
			System.out.println("SmartTV ready to use!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//setState(DeviceState.ON);

	}
	
	
	
	
}
