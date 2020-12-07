package process;
//import java.io.*;
public class Mythread extends Thread{
	String msg="";
	public Mythread(String name, String msg) {
		super(name);
		this.msg = msg;
	}
	@SuppressWarnings("static-access")
	public void run() {
		int timesleep = (int)(Math.random()*5000);
		try {
			System.out.println(super.getName() + "---->" + this.msg + " timesleep:" + timesleep);
			this.sleep(timesleep);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Thread a1 = new Mythread("a1", "b1");
		Thread a2 = new Mythread("a2", "b2");
		Thread a3 = new Mythread("a3", "b3");
		Thread a4 = new Mythread("a4", "b4");
		a1.start();
		a2.start();
		a3.start();
		a4.start();
	}
}
