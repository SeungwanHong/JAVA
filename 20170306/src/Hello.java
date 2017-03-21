/**
2017/03/06 
*Hello java 출력 class 파일 생성*
*
file -> New -> project -> java Projecr -> Project Name 입력<편의상 날짜> -> finish
Package Explore src folder -> new -> class -> name 입력 <Hello> -> public static... 채크
코드 한 줄이 끝났을 때 ';'(세미콜론) 입력 <- 코드가 끝났다. 코드 아래 에러가 났다면 제일 처음 생각해 볼것
"런 아이콘" 클릭시 실행과 컴파일을 동시에 하겠다.
Sysout 내가 소괄호에 작성한 내용을 콘솔에 출력을 하겠다.(ln 줄 이행까지 같이) 
println에서 ln을 뺏을땐 줄 이행이 안된다.
주석 이코드가 어떤 코든지 설명 해놓는 부분
주석은 컴파일러가 번역 하지 않는다.
주석의 종류는 3가지
"//"  = 한줄짜리 주석 간단한 설명
**/
/* 여러줄 주석 복잡하거나 장황한 설명을 적어 놓을 때 사용*/
/**
 * 주석이 없어도 알아볼 수 있는 코드가 배스트(읽기 좋은 코드)
 * 주석은 생활화 
 * /
/**
 * @author bit
 *
 */
public class Hello {

	/**
	 * @param args
	 */
	//프로그램의 시작과 끝
	// =>	main이 시작되면 프로그램이 시작
	//		main이 끝나면 프로그램이 끝
	
	//{} => 코드 블럭
	//코드가 작성되는 구간 중괄호가 시작되면 코드의 시작, 중괄호가 닫히면 코드의 끝
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * @param 
		 * hello java 출력
		 */
		//System.out.println(<내용>) => 괄호 안에 있는 내용을 콘솔에 출력
		//코드가 종료되면 세미콜론(;)을 붙여서 코드가 끝났음을 알려준다.
		System.out.println("Hello Java !");
		System.out.println("Bye Java !");
		System.out.print("줄이행태스트");
		System.out.println(10);
	}

}
