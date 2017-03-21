package lego.person.item;

import lego.person.wear.IFootWear;

public class Sneakers extends Item implements IFootWear{
 
//	public Sneakers(String color, String size, String maker){
//		super(color,size,maker);
//	}
//	public Sneakers(){
//		super("파란색", "나이키", new FootWear());
//	}
	public Sneakers(){
		super("파란색 ", "나이키");
	}

	 @Override
		public void itemInfo() {
		 System.out.println("---신발 착용---");
			super.itemInfo();
		}
}
