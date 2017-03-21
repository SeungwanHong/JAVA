package lego.person.item;

import lego.person.wear.IBodyWear;
import lego.person.wear.IHeadWear;

public class Hat extends Item implements IHeadWear{

	public Hat() {
	      super("검은색 ", "톰보이");
	      // TODO Auto-generated constructor stub
	   }

	   @Override
	   public void itemInfo() {
	      // TODO Auto-generated method stub
	      System.out.println("---모자 착용---");
	      super.itemInfo();
	   }
}
