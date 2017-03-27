import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class main02 {
	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		
		//
		if(file.exists()){
			//무엇을						목적지
			Reader in = new FileReader(file);
			//1) reader에서는 한글자 한글자씩 읽어 온다.
			int readData = 0;			//EOF: -1 => End Of File
			while((readData = in.read()) != -1){
				System.out.print((char)readData);
			}
			System.out.println();
			in.close();
		}else{
			System.out.println("파일이 없습니다.");
		}
		System.out.println("프로그램 종료");
	}
}