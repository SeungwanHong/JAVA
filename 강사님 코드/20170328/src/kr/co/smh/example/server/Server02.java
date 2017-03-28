package kr.co.smh.example.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import kr.co.smh.example.server.threads.ServerThread02;

public class Server02 {

	public static final int PORT = 8080;
	
	public static void main(String[] args) throws IOException{
		ServerSocket sSock = new ServerSocket(PORT);
		while(true)
		{
			try
			{
				System.out.println("Client Wait...");
				Socket clientSocket = sSock.accept();
				
				ServerThread02 clientThread = new ServerThread02(clientSocket);
				clientThread.start();
				
//				InputStream in = clientSocket.getInputStream();
//				DataInputStream dis = new DataInputStream(in);
				
//				String client_nick_name = dis.readUTF();
//				System.out.println("[" + client_nick_name+"] 님 접속");
				
//				dis.close();
//				clientSocket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
