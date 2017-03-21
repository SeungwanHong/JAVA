package machine.electronicMachine.impl;

import machine.ElectronicMachine;
import machine.electronicMachine.ITelephone;

public class HomeTelephone extends ElectronicMachine implements ITelephone{

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
	public void portability() {
		// TODO Auto-generated method stub
		System.out.println("휴대성이 없다.");
	}

	@Override
	public void useEstimate() {
		// TODO Auto-generated method stub
		System.out.println("콘센트를 사용한다.");
	}

	@Override
	public void printAllInfo() {
		// TODO Auto-generated method stub
		System.out.println("집전화는");
		this.sendMessage();
		this.call();
		this.portability();
		this.useEstimate();
	}

}
