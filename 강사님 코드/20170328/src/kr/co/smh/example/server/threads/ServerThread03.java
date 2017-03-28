package kr.co.smh.example.server.threads;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ServerThread03 extends Thread {

	private Socket clientSocket;
	private DataInputStream dis;
	private DataOutputStream dos;
	
	private Map<String, DataOutputStream> mClientMap;
	
	private String clientKey = "";
	private String nickName = "";
	
	public ServerThread03(Socket clientSocket, 
										 Map<String, DataOutputStream> mClientMap) {
		this.clientSocket = clientSocket;
		
		//클라이언트가 접속 할 때마다 map에 등록 시킬 것..
		this.mClientMap = mClientMap;
	}

	@Override
	public void run() {
		try {
			// 접속한 클라이언트가 보내는 메세지를 받아내는 작업
			dis = new DataInputStream(clientSocket.getInputStream());
			
			// 닉네임 받아오기
			nickName = dis.readUTF();
			
			//Map의 키값 설정(닉네임 + 아이피)
			clientKey = nickName + clientSocket.getInetAddress().toString();
			
			//접속한 클라이언트에게 데이터를 전송 하기 위한 DataOutputStream 생성
			dos = new DataOutputStream(clientSocket.getOutputStream());
			
			//접속한 클라이언트들에 대한 정보가 들어있는 Map에 추가
			mClientMap.put(clientKey, dos);
			
			System.out.println(clientSocket + "[" + nickName + "] 님 접속");
			
			//클라이언트가 보내는 채팅 메세지를 받아와야 한다.
			// 클라이언트가 exit을 입력하면 방 나가기(채팅 종료)
			
			String msg = "";
			
			while(!msg.toLowerCase().equals("exit")){
				//클라이언트가 메세지를 보내면 받는다.
				msg = dis.readUTF();
				System.out.println("["+nickName+"] " + msg);
				//받아낸 메세지를 접속한 모든 사람에게 전송한다.
				sendBroadCast("["+nickName+"] " + msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//클라이언트가 채팅을 종료 할 경우 먼저 map에서 삭제
				mClientMap.remove(clientKey);
				//스트림과 소켓 닫아주기
				dos.close();
				dis.close();
				clientSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	//서버 입장에서 접속한 모든 사람에게 데이터를 전송한는 방식 : BroadCasting
	private void sendBroadCast(String msg){
		
		//맵의 키 집합인 keySet 가져오기
		Set<String> keyset = mClientMap.keySet();
		
		//KeySet을 순환 할 수 있는 이터레이터 가져오기
		Iterator<String> keyIter = keyset.iterator();
		
		//이터레이터를 이용하여 키값을 이용해 HashMap에 저장된 클라이언트의 DataOutputStream을
		//이용하여 데이터 전송
		while(keyIter.hasNext()){
			
			String key = keyIter.next();
			DataOutputStream tempDos = mClientMap.get(key);
			try
			{
				tempDos.writeUTF(msg);
			}catch(IOException e){
				//메세지를 보내다가 에러가 나게 되면 해당하는 사람을 삭제
				System.out.println(key+"에게 메세지를 보내던 중 에러 발생");
				mClientMap.remove(key);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
