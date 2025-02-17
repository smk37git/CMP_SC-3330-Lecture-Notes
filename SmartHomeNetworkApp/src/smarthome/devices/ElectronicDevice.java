package smarthome.devices;

import smarthome.devices.status.DeviceState;

public abstract class ElectronicDevice {

	private DeviceState state;

	public ElectronicDevice() {
		System.out.println("Electronic Device State Created");
		this.setState(DeviceState.OFF);
	}
	
	public DeviceState getState() {
		return state;
	}

	public void setState(DeviceState state) {
		this.state = state;
	}
	
	
}
