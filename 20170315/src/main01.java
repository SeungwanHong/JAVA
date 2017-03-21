import machine.electronicMachine.impl.*;
/*
 
 */
public class main01 {
	public static void main(String[] args) {
		
		DeskTop d = new DeskTop();
		NoteBook n = new NoteBook();
		SmartPhone s = new SmartPhone();
		HomeTelephone h = new HomeTelephone();
		
		d.printAllInfo();
		n.printAllInfo();
		s.printAllInfo();
		h.printAllInfo();
		
		
	}
}
