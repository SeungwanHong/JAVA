package lego.person.item;

import lego.person.wear.IFootWear;

public class Sneakers extends Item implements IFootWear{
 
//	public Sneakers(String color, String size, String maker){
//		super(color,size,maker);
//	}
//	public Sneakers(){
//		super("�Ķ���", "����Ű", new FootWear());
//	}
	public Sneakers(){
		super("�Ķ��� ", "����Ű");
	}

	 @Override
		public void itemInfo() {
		 System.out.println("---�Ź� ����---");
			super.itemInfo();
		}
}
