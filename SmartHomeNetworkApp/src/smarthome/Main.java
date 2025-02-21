package smarthome;

import smarthome.devices.ElectronicDevice;
import smarthome. devices.*;

public class Main {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		phone.powerOn();
		phone.makeCall("Mom");
		
		Laptop pc = new Laptop();
		pc.powerOn();
		
		SmartTV tv = new SmartTV();
		tv.powerOn();
		tv.castDevice(phone);
		tv.castDevice(pc);
		//SmartPhone phone2 = new SmartPhone(DeviceState.ON);

	}

}
