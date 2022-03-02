package week4.day2;

public class Learnstatic {

	int a=10;
	static int b=20;
	
	static{
		System.out.println("static block diractly access");
	}
	
	Learnstatic(){
		System.out.println("DEFAULT CONSTRUCOR");
	}
	public void print() {
		System.out.println("PRINT METHOD");
	}
	public static void scan() {
		System.out.println("SCAN METHOD");
	}
	public void main() {
		System.out.println("OVER LOADDED MAIN METHOD");
	}
	public static void main(String[] args) {
		Learnstatic lenstatic=new Learnstatic();
		System.out.println(lenstatic.a);
		System.out.println(b);
        lenstatic.print();	
        scan();	
	}
}
