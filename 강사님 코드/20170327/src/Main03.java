import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main03 {

	public static void main(String[] args) throws IOException {
		
		//보조 스트림
		// => 주 스트림을 보조해주는 스트림
		// 주 스트림에는 없는 여러가지 기능들을 제공한다.
		// BufferedReader/InputStream
		// BufferedWriter/OutputStream
		
		File file = new File("bufferedTest1.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		
		//1) 주 스트림을 설정한다.
		FileWriter out = new FileWriter(file);
		//2) 보조 스트림을 만든다.  매개변수로 주스트림 객체가 들어간다.
		BufferedWriter bw = new BufferedWriter(out);
		
		//* 배열이라고 하는 것을 전부다 버퍼(Buffer)라고 한다.
		
		//5개 짜리 배열
		bw.write("Hello");//char[] 버퍼를 만든다. 해당 문자열의 갯수만큼의 char 형 배열을 만들고
									// 해당 데이터를 복사 한 후에 파일에 전송한다. \n또는 문자열이 끝난 것을 기준으로 한다.
									// BufferedWriter에서 자동으로 배열을 만들어 낸다.
		
		bw.write("World!!!"); // 8개 짜리 배열
		
		//보조 스트림을 닫으면 주 스트림은 자동으로 닫힌다.
		bw.close();
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
