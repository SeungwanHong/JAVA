package machine.electronicMachine.impl;

import machine.ElectronicMachine;
import machine.electronicMachine.IComputer;
import machine.electronicMachine.ITelephone;

public class SmartPhone extends ElectronicMachine implements IComputer,ITelephone{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("메세지를 보낸다.");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 할 수 있다.");
	}

	@Override
	public void internet() {
		// TODO Auto-generated method stub
		System.out.println("인터넷을 사용할 수 있다.");
	}

	@Override
	public void sendMail() {
		// TODO Auto-generated method stub
		System.out.println("메일을 보내고 받을 수있다.");
	}

	@Override
	public void portability() {
		// TODO Auto-generated method stub
		System.out.println("휴대성이 있다.");
	}

	@Override
	public void useEstimate() {
		// TODO Auto-generated method stub
		System.out.println("배터리를 사용한다.");
	}

	@Override
	public void printAllInfo() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰은");
		this.sendMessage();
		this.call();
		this.internet();
		this.sendMail();
		this.portability();
		this.useEstimate();
	}

	

}
