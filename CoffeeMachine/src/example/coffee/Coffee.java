package example.coffee;

public abstract class Coffee {

	protected int espresso;
	protected String liquid_kind;
	protected int liquid_ml;
	protected int sugar;
	protected int syrup;
	
	public Coffee(int espresso,  String liquid_kind,  int liquid_ml, int sugar, int syrup){
		this.espresso = espresso;
		this.liquid_kind = liquid_kind;
		this.liquid_ml = liquid_ml;
		this.sugar = sugar;
		this.syrup = syrup;
	}
	
	public abstract void makeWay();
	
	
}
