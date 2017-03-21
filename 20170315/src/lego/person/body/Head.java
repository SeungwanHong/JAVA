package lego.person.body;


import lego.person.wear.IHeadWear;
import lego.person.wear.IWear;

public class Head {

	private IWear wear;
	
	public Head(IHeadWear wear){
		this.wear = wear;
	}
	public void printWear(){
		wear.itemInfo();
	}
}
