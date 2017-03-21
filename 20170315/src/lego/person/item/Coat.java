package lego.person.item;

import lego.person.wear.IBodyWear;

public class Coat extends Item implements IBodyWear{

	   public Coat() {
	      super("베이지색 투버튼 코트 ", "톰보이");
	      // TODO Auto-generated constructor stub
	   }

	   @Override
	   public void itemInfo() {
	      // TODO Auto-generated method stub
	      System.out.println("---코트 착용---");
	      super.itemInfo();
	   }

	}
