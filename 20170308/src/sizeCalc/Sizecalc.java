package sizeCalc;

public class Sizecalc {
	private String gender;
	private double weight;
	private double height;
	private String size;
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	

	
	private double measure(){
		double result =0;
		if(this.gender == "남자"){
			result = (this.weight+this.height -10)/2;
		}else if(this.gender == "여자"){
			result = (this.weight+this.height -20)/2;;
		}
		return result;
	}
	private void seperate(){
		double result =this.measure();
		if(result<=100){
			this.size = "S";
		}else if(100<result && result<=110) {
			this.size = "M";
		}
		else{
			this.size = "L";				
		}
	}
	public void printSize(){
		this.seperate();
		System.out.println(this.size);
	}
	
}
