package hsw.example.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import hsw.example.client.thread.ClientThread03;

public class Client03 {
	static final String HOST = "192.168.1.132";
	static final int PORT = 8080;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket(HOST, PORT);
		
		System.out.println("[접속 성공]");
		System.out.print("닉네임 입력 : ");
		String nickname = sc.nextLine();
		
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(nickname);
		
		ClientThread03 clientThread = new ClientThread03(socket.getInputStream());
		clientThread.start();
		
		String msg = "";
		
		while(!msg.toLowerCase().equals("exit")){
			System.out.println(">>");
			msg = sc.nextLine();
			//공백문자가 아닐때만 매세지 전송
			if(!msg.trim().equals("")){
				dos.writeUTF(msg);
			}
		}
		
		dos.close();
		socket.close();
		
	}
}
