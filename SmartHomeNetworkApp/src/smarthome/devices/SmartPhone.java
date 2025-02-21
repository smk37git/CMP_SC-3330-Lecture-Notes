package smarthome.devices;

import java.util.Random;
import smarthome.devices.status.DeviceState;

public class SmartPhone extends CastableElectronicDevice {
	
	
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(DeviceState state) {
		
	}
	
	public boolean makeCall(String contact) {
		Random rand = new Random();
		System.out.println("Calling " + contact + "...");
		if(rand.nextBoolean()) {
			System.out.println("Call answered!");
			return true;
		}
		
		System.out.println("No Response!");
		return false;
	}

	@Override
	public String toString() {
		return "SmartPhone [toString()=" + super.toString() + "]";
	}

	@Override
	public void powerOn() {
		System.out.println("Turning on Smartphone...");
		try {
			Thread.sleep(1000);
			System.out.println("Smartphone ready to use!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//setState(DeviceState.ON);
		
	}
	
	
}
