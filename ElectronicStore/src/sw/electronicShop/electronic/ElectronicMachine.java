package sw.electronicShop.electronic;

import sw.electronicShop.power.IBattery;
import sw.electronicShop.power.ICable;

public abstract class ElectronicMachine {

	public static boolean power_state;
	
	ICable cable;
	IBattery bettery;
	
	public ElectronicMachine(ICable cable){
		this.cable = cable;
	}
	public ElectronicMachine(IBattery bettery){
		this.bettery = bettery;
	}
	public ElectronicMachine(ICable cable, IBattery bettery){
		this.cable = cable;
		this.bettery = bettery;
	}
	
}
