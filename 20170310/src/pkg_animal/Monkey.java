package pkg_animal;

public class Monkey extends Omnivo{
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("¿ø¼şÀÌ°¡ ¹äÀ» ÂÁÂÁ ¸Ô´Â´Ù.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("¶Ú´Ù.");
	}
	
	public void climmingTree(){
		System.out.println("³ª¹« Å¸±â");
	}

}
