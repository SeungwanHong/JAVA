package machine.electronicMachine.impl;

import machine.ElectronicMachine;
import machine.electronicMachine.IComputer;

public class NoteBook extends ElectronicMachine implements IComputer{

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
		System.out.println("노트북은");
		this.internet();
		this.sendMail();
		this.portability();
		this.useEstimate();
	}

}
