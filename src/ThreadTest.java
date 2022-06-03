
public class ThreadTest {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		
		SuperBike sb = new SuperBike();
		sb.start();
		
		Car car = new Car();
		car.start();
		
		Truck truck = new Truck();
		truck.start();
	}
}

class Bike extends Thread{
	public void run() {
		for(int i=0;i<1000000000;i++) {
			System.out.println("Bike is running..."+i);
		}
	}
}

class SuperBike extends Thread{
	public void run() {
		for(int i=0;i<1000000000;i++) {
			System.out.println("SuperBike is running..."+i);
		}
	}
}

class Car extends Thread{
	public void run() {
		for(int i=0;i<1000000000;i++) {
			System.out.println("Car is running..."+i);
		}
	}
}

class Truck extends Thread{
	public void run() {
		for(int i=0;i<1000000000;i++) {
			System.out.println("Truck is running..."+i);
		}
	}
}
