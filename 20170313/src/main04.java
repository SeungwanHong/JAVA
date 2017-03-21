import example_class2.*;

public class main04 {

	public static void main(String[] args) {
		
		//upacsting
		//자식 is a 부모가 성립된다.(문법x, 논리o)
		Shape s = new Circle(10);		//원을 만들고 이걸 도형이라고 부른다.
		s.makeArea();
		
		System.out.println(s);				//원을 도형으로 부르겠다. 도형을 객체로 불러서
												//객체의 정보를 출력해라 -> 원에 대한 정보를 출력해라.
												//println(Object x)
		
		//downcasting
		//부모 is a 자식(문법 x, 논리x) -> 컴파일 애러
		/*
		Circle c = new Shape();			//추상 클래스가 아니더라도 논리적으로 알맞지 않기 때문에 컴파일 오류
												//도형은 원이다(말이 안맞아)
		//하지만 도형이 애초에 원이라고 만들어져 있엇다면 논리적으로 맞다
		//이 도형은 원이다.
		*/
		Circle c = (Circle)s;					//이 도형은 원이다.
		Shape sc = (Shape)s;				//이 도형은 사각형이다.(논리o, 문법o)
												//하지만 애초에 도형이 원으로 만들어져 있기 때문에
												//컴파일에서는 애러가 안나지만, 실행시 에러가 난다.
												//ClassCastException(형 반환 예외)
		
	}
}
