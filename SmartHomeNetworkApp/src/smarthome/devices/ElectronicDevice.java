package smarthome.devices;

import smarthome.devices.status.DeviceState;

public abstract class ElectronicDevice {

	private DeviceState state;

	public ElectronicDevice() {
//		System.out.println("Electronic Device State Created");
//		this.setState(DeviceState.OFF);
	}
	
	public ElectronicDevice(DeviceState state) {
		System.out.println("ElectronicDevice object created");
	}
	
	public abstract void powerOn();
	
	public DeviceState getState() {
		return state;
	}

	public void setState(DeviceState state) {
		this.state = state;
	}
	
	
}
