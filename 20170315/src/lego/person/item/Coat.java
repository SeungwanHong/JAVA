package lego.person.item;

import lego.person.wear.IBodyWear;

public class Coat extends Item implements IBodyWear{

	   public Coat() {
	      super("�������� ����ư ��Ʈ ", "�躸��");
	      // TODO Auto-generated constructor stub
	   }

	   @Override
	   public void itemInfo() {
	      // TODO Auto-generated method stub
	      System.out.println("---��Ʈ ����---");
	      super.itemInfo();
	   }

	}
