package MuiltiThreading;

class Bus extends Thread{
	int available = 5;
	int passenger;
	Bus(int a){
		passenger = a;
	}
	
	public synchronized void run(){
		String name = Thread.currentThread().getName();
		if(available >= passenger) {
			System.out.println("Seats are booked.");
			available -= passenger;
		}else {
			System.out.println(name+" NO Ticket");
		}
		
	}
	
}

public class Bus_WithSir  {

	public static void main(String[] args) {
		Bus op = new Bus(2);
		
		Thread t1 = new Thread(op);
		Thread t2 = new Thread(op);
		Thread t3 = new Thread(op);
		
		t1.setName("ABC");
		t2.setName("PQR");
		t3.setName("XYZ");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
