package kr.co.smh.example.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import kr.co.smh.example.server.Server02;

public class Client02 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		Socket socket = new Socket("192.168.1.2", Server02.PORT);
		System.out.println("[접속 성공]");
		System.out.print("닉네임 입력 >> ");
		String nickname = scan.nextLine();
		
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		dos.writeUTF(nickname);
		dos.close();
		socket.close();
		
	}
	
}
