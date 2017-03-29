package client;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import commons.packet.RequestPacket;
import commons.packet.ResponsePacket;

public class ClientMain01 {

	public static final int MENU_LOGIN = 1;
	public static final int MENU_JOIN = 2;
	public static final int MENU_EXIT = 3;
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1) 서버에 접속
		Socket socket = new Socket("192.168.1.2", 8080);
		
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		//1) 입력을 받기 위한 스캐너 생성
		Scanner scan = new Scanner(System.in);
		int menu = -1;		//-1로 메뉴 초기화
		
		while(menu != MENU_EXIT)
		{
			System.out.println("-----------------------------------");
			System.out.println("\t1)로그인\t\t2)회원가입\t\t3)종료");
			System.out.println("-----------------------------------");
			
			System.out.print(" >> ");
			menu = scan.nextInt();
			scan.nextLine();	//nextInt()로 인한 버퍼 비워주기
			
			switch(menu){
			case MENU_LOGIN:
				//1) 로그인 패킷을 서버에 전송
				dos.writeInt(RequestPacket.REQ_LOGIN);
				
				System.out.print("ID >> ");
				String id = scan.nextLine();
				
				System.out.print("PW >> ");
				String pw = scan.nextLine();
				
				//2) 실 데이터를 보내야 한다.
				//아이디 전송
				dos.writeUTF(id);
				dos.writeUTF(pw);
				
				//서버로 부터 입력한 값에 대한 응답 받기
				int login_rsp = dis.readInt();
				
				//서버로 부터 받은 응답을 분석(로그인 실패,성공 여부)
				switch(login_rsp){
				case ResponsePacket.RSP_LOGIN_Y:
					System.out.println("로그인 성공");
					break;
				case ResponsePacket.RSP_LOGIN_N:
					System.out.println("로그인 실패");
					continue;
				}
				
				break;
			case MENU_JOIN:
				//1) 회원가입 패킷을 서버에 전송
				dos.writeInt(RequestPacket.REQ_JOIN);
				
				//2) 실 데이터 전송
				System.out.println("================");
				System.out.print(" id >> ");
				String joinid = scan.nextLine();
				
				System.out.print(" pw >> ");
				String joinpw = scan.nextLine();
				
				System.out.print(" name >> ");
				String joinname = scan.nextLine();
				
				System.out.print(" email >> ");
				String joinemail = scan.nextLine();
				System.out.println("================");
				
				dos.writeUTF(joinid);
				dos.writeUTF(joinpw);
				dos.writeUTF(joinname);
				dos.writeUTF(joinemail);
				
				int joinResult = dis.readInt();
				switch(joinResult){
				case ResponsePacket.RSP_JOIN_Y:
					System.out.println("회원 가입 성공");
					break;
				case ResponsePacket.RSP_JOIN_N:
					System.out.println("회원 가입 실패");
					break;
				}
				
				break;
			case MENU_EXIT:
				dis.close();
				dos.close();
				socket.close();
				continue;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
