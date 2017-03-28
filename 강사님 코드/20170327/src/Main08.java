import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main08 {

	public static void main(String[] args) throws IOException {
		
		//DataInput/OutputStream
		// 자바의 기본자료형의 입출력을 손쉽게 해준다.
		
		File dataFile = new File("dataFile.txt");
		if(!dataFile.exists()){
			dataFile.createNewFile();
		}
		
		FileOutputStream out = new FileOutputStream(dataFile);
		//자바의 기본자료형을 출력 하기 위해 DataOutputStream 생성
		DataOutputStream dos = new DataOutputStream(out);
		
		dos.writeInt(100);
		dos.writeLong(1000L);
		dos.writeDouble(10.123);
		dos.writeUTF("문자열~");
		
		dos.close();
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
