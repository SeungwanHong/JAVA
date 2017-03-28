package kr.co.smh.example.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import kr.co.smh.example.server.threads.ServerThread03;

public class Server03 {

	public static final int PORT = 8080;

	public static void main(String[] args) throws IOException {
		ServerSocket sSock = new ServerSocket(PORT);
		// String(닉네임+IP) 한테 DataOutputStream을 이용하여 데이터를 보내겠다.
		Map<String, DataOutputStream> mClientMap = new HashMap<>();

		// 각각 클라이언트들이 접속 할 때마다 발생되는 쓰레드에서 처리되는 자료구조임
		// 때문에 동기화가 필요하다

		// 일반 Map을 동기화 된 Map으로 변경함
		Collections.synchronizedMap(mClientMap);

		while (true) {
			try {
				System.out.println("Client Wait...");
				Socket clientSocket = sSock.accept();

				ServerThread03 clientThread = new ServerThread03(clientSocket, mClientMap);
				clientThread.start();

			} catch (IOException e) {
				e.printStackTrace();
				sSock.close();
			}
		}
	}

}
