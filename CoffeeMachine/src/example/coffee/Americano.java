package example.coffee;

public class Americano extends Coffee{

	public Americano(int espresso, String liquid_kind, int liquid_ml, int sugar, int syrup) {
		super(espresso, liquid_kind, liquid_ml, sugar, syrup);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeWay() {
		// TODO Auto-generated method stub
		System.out.print(this.toString());
		System.out.println(" 로 만든다.");
	}

	@Override
	public String toString() {
		return "Americano [espresso=" + espresso + ", liquid_kind=" + liquid_kind + ", liquid_ml=" + liquid_ml
				+ ", sugar=" + sugar + ", syrup=" + syrup + "]";
	}
	

}
