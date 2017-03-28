package kr.co.smh.example.server.threads;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread02 extends Thread {

	private Socket clientSocket;
	private DataInputStream dis;
	private DataOutputStream dos;

	public ServerThread02(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	@Override
	public void run() {
		try {
			// 접속한 클라이언트가 보내는 메세지를 받아내는 작업
			dis = new DataInputStream(clientSocket.getInputStream());
			String client_nick_name = dis.readUTF();
			System.out.println(clientSocket + "[" + client_nick_name + "] 님 접속");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				clientSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
