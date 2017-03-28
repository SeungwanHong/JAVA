import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main06 {

	public static void main(String[] args) throws IOException{
		//byte [] 스트림은 InputStream, OutputStream
		//1) 바이트형태의 파일 불러오기
		// => InputStream 사용
		
		File file = new File("movie_image.jpg");
		InputStream in = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(in);
		
		//직접 버퍼를 만들어야 한다.
		byte [] buffer = new byte[1024];	//1kb 짜리 바가지를 만들어 냄
		
		//BufferedInputStream을 이용하여 버퍼에 담긴 데이터의 수
		// ex) 바가지에 쌀이 몇개나 담겼는지?
		int readCount = -1;
		
		while((readCount = bis.read(buffer)) != -1){
			System.out.println("읽은 수 : " + readCount);
			
			
		}
		
		bis.close();
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
