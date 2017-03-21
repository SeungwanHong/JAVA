package example_class;
//상속을 하기위한 키워드
//extends
public class Derived extends Base{
	
	public void goo(){
		num = 100;
		System.out.println("B.goo()");
		System.out.println("부모의 맴벼변수 num" + num);
	}

}
