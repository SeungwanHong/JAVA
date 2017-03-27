import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class main08 {
	public static void main(String[] args) throws IOException {
		//DataInput/OutputStream
		//자바의 기본 자료형의 입출력을 손쉽게 해준다.
		
		File datafile = new File("test2.txt");
		if(datafile.exists()){
			datafile.createNewFile();
		}
		FileOutputStream out = new FileOutputStream(datafile);
		DataOutputStream dos = new DataOutputStream(out);
		
		dos.writeInt(100);
		dos.writeLong(1000L);
		dos.writeDouble(123.12);
		dos.writeUTF("test 끝");
		
		dos.close();
		System.out.println("프로그램 종료!!");
	}
}
