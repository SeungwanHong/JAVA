package machine.electronicMachine.impl;

import machine.ElectronicMachine;
import machine.electronicMachine.IComputer;

public class DeskTop extends ElectronicMachine implements IComputer{

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("���ͳ��� ����� �� �ִ�.");
	}

	@Override
	public void sendMail() {
		// TODO Auto-generated method stub
		System.out.println("������ ������ ���� ���ִ�.");
	}

	@Override
	public void portability() {
		// TODO Auto-generated method stub
		System.out.println("�޴뼺�� ����.");
	}

	@Override
	public void useEstimate() {
		// TODO Auto-generated method stub
		System.out.println("�ܼ�Ʈ�� ����Ѵ�.");
	}

	@Override
	public void printAllInfo() {
		// TODO Auto-generated method stub
		System.out.println("����ũž��");
		this.internet();
		this.sendMail();
		this.portability();
		this.useEstimate();
	}

}
