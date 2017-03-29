package server.thread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.SQLException;

import commons.packet.RequestPacket;
import commons.packet.ResponsePacket;
import server.dao.UserDao;

public class ServerThread extends Thread {

	// 접속한 클라이언트의 소켓
	private Socket clientSocket;
	private UserDao dao = new UserDao();

	private DataInputStream dis;
	private DataOutputStream dos;

	private String userid;

	// 쓰레드 생성시 접속한 클라이언트로부터 데이터를 받거나, 접속한 클라이언트에게 데이터를 전송 하기
	// 위해 클라이언트 소켓을 생성자의 매개변수로 받는다.
	public ServerThread(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}

	@Override
	public void run() {
		try {
			dis = new DataInputStream(clientSocket.getInputStream());
			dos = new DataOutputStream(clientSocket.getOutputStream());

			int req_packet = 0;
			// 클라이언트가 종료 패킷을 보내지 않으면 반복(계속 패킷과 패킷에 대한
			// 요청 처리를 하겠다)
			while (req_packet != RequestPacket.REQ_EXIT) {

				// 1) 서버는 클라이언트가 보내는 패킷을 받는다.
				req_packet = dis.readInt();
				// 2) 서버는 클라이언트가 보낸 패킷을 분석
				switch (req_packet) {
				case RequestPacket.REQ_LOGIN:

					// 3) 클라이언트가 전송하는 실 데이터를 받아낸다.
					String id = dis.readUTF();
					String pw = dis.readUTF();

					System.out.println(id + "가 로그인 시도");

					boolean isLogin = dao.login(id, pw);

					// isLogin : true => 로그인 성공
					if (isLogin) {
						dos.writeInt(ResponsePacket.RSP_LOGIN_Y);
						userid = id;
						// isLogin : false => 로그인 실패
					} else
						dos.writeInt(ResponsePacket.RSP_LOGIN_N);
					break;
				case RequestPacket.REQ_JOIN:
					// 1) 사용자가 입력한 정보를 받아오기
					String joinid = dis.readUTF();
					String joinpw = dis.readUTF();
					String joinname = dis.readUTF();
					String joinemail = dis.readUTF();

					int result = dao.joinUser(joinid, joinpw, joinname, joinemail);

					if (result == 1) {
						System.out.println(joinid + " 회원 가입 성공");
						dos.writeInt(ResponsePacket.RSP_JOIN_Y);
					} else {
						System.out.println(joinid + " 회원 가입 실패");
						dos.writeInt(ResponsePacket.RSP_JOIN_N);
					}
					break;
				}
			}
		} catch (IOException e) {

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				dos.close();
				clientSocket.close();
			} catch (IOException e) {

			}
		}
	}

}
