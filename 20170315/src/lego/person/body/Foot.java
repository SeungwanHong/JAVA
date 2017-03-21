package lego.person.body;

import lego.person.item.Sneakers;
import lego.person.wear.IBodyWear;
import lego.person.wear.IFootWear;
import lego.person.wear.IWear;

public class Foot {

	private IWear wear;
	
	public Foot(IFootWear wear){
		this.wear = wear;
	}
	public void printWear(){
		wear.itemInfo();
	}
}
