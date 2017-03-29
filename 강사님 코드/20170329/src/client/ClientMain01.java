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
		//1) ������ ����
		Socket socket = new Socket("192.168.1.2", 8080);
		
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		//1) �Է��� �ޱ� ���� ��ĳ�� ����
		Scanner scan = new Scanner(System.in);
		int menu = -1;		//-1�� �޴� �ʱ�ȭ
		
		while(menu != MENU_EXIT)
		{
			System.out.println("-----------------------------------");
			System.out.println("\t1)�α���\t\t2)ȸ������\t\t3)����");
			System.out.println("-----------------------------------");
			
			System.out.print(" >> ");
			menu = scan.nextInt();
			scan.nextLine();	//nextInt()�� ���� ���� ����ֱ�
			
			switch(menu){
			case MENU_LOGIN:
				//1) �α��� ��Ŷ�� ������ ����
				dos.writeInt(RequestPacket.REQ_LOGIN);
				
				System.out.print("ID >> ");
				String id = scan.nextLine();
				
				System.out.print("PW >> ");
				String pw = scan.nextLine();
				
				//2) �� �����͸� ������ �Ѵ�.
				//���̵� ����
				dos.writeUTF(id);
				dos.writeUTF(pw);
				
				//������ ���� �Է��� ���� ���� ���� �ޱ�
				int login_rsp = dis.readInt();
				
				//������ ���� ���� ������ �м�(�α��� ����,���� ����)
				switch(login_rsp){
				case ResponsePacket.RSP_LOGIN_Y:
					System.out.println("�α��� ����");
					break;
				case ResponsePacket.RSP_LOGIN_N:
					System.out.println("�α��� ����");
					continue;
				}
				
				break;
			case MENU_JOIN:
				//1) ȸ������ ��Ŷ�� ������ ����
				dos.writeInt(RequestPacket.REQ_JOIN);
				
				//2) �� ������ ����
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
					System.out.println("ȸ�� ���� ����");
					break;
				case ResponsePacket.RSP_JOIN_N:
					System.out.println("ȸ�� ���� ����");
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
		
		System.out.println("���α׷� ����");
	}
}
