package lego.person.item;

import lego.person.wear.IWear;

public class Item implements IWear{
	
	private String color;
	private String maker;
	//private IWear wear;
	
	public Item(String color, String maker){
		this.color  = color;
		this.maker = maker;
	}

	@Override
	public void itemInfo() {
		// TODO Auto-generated method stub
		System.out.println(color + maker);
	}


	

}
