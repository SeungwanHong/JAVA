import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Scanner;

public class main06 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//1)byte [] 스트림은	InputStream, OutputStream

		//1)바이트 형태의 파일 불러오기
		//=> InputStream 사용

		File file = new File("common.jpg");
		InputStream in = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(in);

		//직접 버퍼를 만들어야한다.
		byte [] buffer = new byte[1024];
		//BufferedInputStream을 이용하여 버퍼에 담긴 데이터의 수

		int readCount = -1;

		while((readCount = bis.read(buffer)) != -1){
			System.out.println("읽은수 : "+ readCount);

		}

		bis.close();
	}

}
