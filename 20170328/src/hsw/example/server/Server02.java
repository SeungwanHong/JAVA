package hsw.example.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import hsw.example.server.thread.ServerThread02;

public class Server02 {

	static final int PORT = 8080;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
			ServerSocket sSocket = new ServerSocket(PORT);
			
			System.out.println("Client wait....");
			Socket clientSocket = sSocket.accept();
			//쓰레드 처리
			ServerThread02 clientThread = new ServerThread02(clientSocket);
			clientThread.start();
			
			//쓰레드 처리 이전
//			InputStream in = clientSocket.getInputStream();
//			DataInputStream dis = new DataInputStream(in);
//			
//			String client_nick_name = dis.readUTF();
//			System.out.println("["+client_nick_name+"]님 접속");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
