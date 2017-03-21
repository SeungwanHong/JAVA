package lego.person.body;

import lego.person.wear.IWear;

public class LegoPerson {
	
	private Head head;
	private Body body;
	private Foot foot;
	
	public LegoPerson(Head head, Body body, Foot foot){
		this.head = head;
		this.body = body;
		this.foot = foot;
	}
	
	public void allPrint(){
		head.printWear();
		body.printWear();
		foot.printWear();
	}

}