package machine.electronicMachine.impl;

import machine.ElectronicMachine;
import machine.electronicMachine.IComputer;
import machine.electronicMachine.ITelephone;

public class SmartPhone extends ElectronicMachine implements IComputer,ITelephone{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("�޼����� ������.");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �� �� �ִ�.");
	}

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
		System.out.println("�޴뼺�� �ִ�.");
	}

	@Override
	public void useEstimate() {
		// TODO Auto-generated method stub
		System.out.println("���͸��� ����Ѵ�.");
	}

	@Override
	public void printAllInfo() {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ����");
		this.sendMessage();
		this.call();
		this.internet();
		this.sendMail();
		this.portability();
		this.useEstimate();
	}

	

}
