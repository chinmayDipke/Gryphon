package MuiltiThreading;

class PrintClass{
	
	public void print(int n) {
		for(int i = 1; i<= 10;i++) {
			System.out.println(i*n);
		}
	}
}
class FiveClass extends Thread{
	
	PrintClass F;
	FiveClass(PrintClass op){
		F=op;
	}
	public void run() {
		F.print(5);
	}
	
}

class SevenClass extends Thread{
	PrintClass S;
	SevenClass(PrintClass op){
		S=op;
	}
	public void run() {
		S.print(7);
	}
	
}

public class TablesThread {
	
	public static void main(String[] args) {
		
		PrintClass op = new PrintClass();
		SevenClass t1 = new SevenClass(op);
		FiveClass t2 = new FiveClass(op);
		
		
		t1.start();
		t2.start();
		
		
		
	}

}
