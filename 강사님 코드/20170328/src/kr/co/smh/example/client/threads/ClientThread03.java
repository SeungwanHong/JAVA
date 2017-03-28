package kr.co.smh.example.client.threads;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClientThread03 extends Thread{

	//서버가 보내는 채팅 메세지를 받기 위한 InputStream
	private InputStream in;
	
	public ClientThread03(InputStream in){
		this.in= in;
	}
	@Override
	public void run() {
		DataInputStream dis  = null;
		
		try{
			dis = new DataInputStream(in);
			String msg ="";
			while(true)
			{
				msg = dis.readUTF();
				System.out.println(msg);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
