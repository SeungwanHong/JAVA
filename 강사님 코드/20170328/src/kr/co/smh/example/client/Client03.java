package kr.co.smh.example.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import kr.co.smh.example.client.threads.ClientThread03;
import kr.co.smh.example.server.Server02;

public class Client03 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner scan = new Scanner(System.in);
		Socket socket = new Socket("192.168.1.2", Server02.PORT);
		System.out.println("[접속 성공]");
		System.out.print("닉네임 입력 >> ");
		String nickname = scan.nextLine();
		
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(nickname);
		
		
		//서버로 부터 데이터를 받아내기 위한 쓰레드 시작
		ClientThread03 clientThread = new ClientThread03(socket.getInputStream());
		clientThread.start();
		
		String msg = "";
		
		while(!msg.toLowerCase().equals("exit")){
			System.out.print(" >> ");
			msg = scan.nextLine();
			
			//공백문자를 보내면 아무것도 가지 않도록
			if(!msg.trim().equals(""))
				dos.writeUTF(msg);
		}
		
		
		
		dos.close();
		socket.close();
		scan.close();
	}
	
}
