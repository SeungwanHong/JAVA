package kr.co.smh.example.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {

	public static void main(String[] args) {
		//1) 서버 구성을 위한 서버 소켓 생성
		ServerSocket sSock = null;
		Socket clientSocket = null;
		try
		{
			//2) 클라이언트의 접속을 받기 위한 포트 설정.(기본적으로 IP는 현재 컴퓨터의 ip가 설정된다)
			//							 포트번호 : 8080
			sSock = new ServerSocket(8080);

			//accept () : 클라이언트의 접속을 대기(block)
			// 클라이언트가 접속을 하게 되면 클라이언트와 통신을 할 수 있는 소켓을 생성해낸다.
			while(true)
			{
				try
				{
					System.out.println("클라이언트 대기중..");
					clientSocket = sSock.accept();
					System.out.println(clientSocket+"에서 접속 성공");
					
					//1)클라이언트가 들어옴 -> 클라이언트에게 메세지를 보내기
					// 클라이언트에게 메세지를 출력 하기 위해서 클라이언트와 연결된 소켓에서
					//OutputStream을 받아온다.
					OutputStream out = clientSocket.getOutputStream();
					DataOutputStream dos = new DataOutputStream(out);
					dos.writeUTF(clientSocket + "님 환영합니다");
					
					
					//2) 서버에서 클라이언트의 메세지를 받기 위해 InputStream 생성
					InputStream in = clientSocket.getInputStream();
					DataInputStream dis = new DataInputStream(in);
					String clientMsg = dis.readUTF();
					System.out.println( clientSocket.toString() + " : " + clientMsg);
					dis.close();
					dos.close();
				}catch(IOException e){
					
				}
				
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				clientSocket.close();
				sSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
