package lego.person.item;

import lego.person.wear.IBodyWear;
import lego.person.wear.IHeadWear;

public class Hat extends Item implements IHeadWear{

	public Hat() {
	      super("������ ", "�躸��");
	      // TODO Auto-generated constructor stub
	   }

	   @Override
	   public void itemInfo() {
	      // TODO Auto-generated method stub
	      System.out.println("---���� ����---");
	      super.itemInfo();
	   }
}
