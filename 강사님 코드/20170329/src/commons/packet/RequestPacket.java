package commons.packet;

//Ŭ���̾�Ʈ�� �������� ������ ��û��Ŷ ����
public class RequestPacket {

	//���ڸ��� 1 : ȸ���� ���õ�?
	//�ι�°�� ~ : �� ���(�α������� ȸ����������, ����, Ż��~~)
	//����°       : �� ��ɿ��� �� �и��� ������ �ִ°�?(�ӽ� �ڸ���)
	
	// �� ��Ŷ ������ ��ġ�� �ȵȴ�
	// ������ ��Ŷ���� ������ ���� ������ �Ѵ�.
	
	public static final int REQ_LOGIN = 100;
	public static final int REQ_JOIN = 110;
	
	public static final int REQ_EXIT = -1;
	
	public static final int REQ_BOARD_LIST = 200;
	public static final int REQ_BOARD_MOD = 210;
	//....
	
}
