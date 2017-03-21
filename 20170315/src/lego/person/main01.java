package lego.person;

import lego.person.body.Body;
import lego.person.body.Foot;
import lego.person.body.Head;
import lego.person.body.LegoPerson;
import lego.person.item.Coat;
import lego.person.item.Hat;
import lego.person.item.Sneakers;

public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Head head = new Head(new Hat());
		Body body = new Body(new Coat());
		Foot foot = new Foot(new Sneakers());
		
		LegoPerson lp1 = new LegoPerson(head, body, foot);
		lp1.allPrint();
		
	}

}
