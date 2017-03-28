package kr.co.smh.example.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client01 {

	public static void main(String[] args) {
		//1) 서버에 접속
		Socket socket = null;
		
		try{
			//socket = new Socket("아이피", 포트);
			//2) 서버의 아이피와 포트를 이용하여 접속
			socket = new Socket("192.168.1.2", 8080);
			System.out.println("접속 성공!");
			
			//서버로부터 데이터를 읽기 위한 InputStream 가져오기
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String helloMsg = dis.readUTF();
			System.out.println(helloMsg);
			
			
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			dos.writeUTF("Hello");
			
			dis.close();
			dos.close();
			
			
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}

