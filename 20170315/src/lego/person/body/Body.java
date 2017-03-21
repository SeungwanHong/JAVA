package lego.person.body;

import lego.person.wear.IBodyWear;
import lego.person.wear.IWear;

public class Body {

	private IWear wear;
	
	public Body(IBodyWear wear){
		this.wear = wear;
	}
	public void printWear(){
		wear.itemInfo();
	}
}
