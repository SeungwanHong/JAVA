package machine.electronicMachine.impl;

import machine.ElectronicMachine;
import machine.electronicMachine.ITelephone;

public class HomeTelephone extends ElectronicMachine implements ITelephone{

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
		System.out.println("����ȭ��");
		this.sendMessage();
		this.call();
		this.portability();
		this.useEstimate();
	}

}
