package process;

import java.io.*;
public class MyPipe {

	public static PipedInputStream in = new PipedInputStream();
	public static PipedOutputStream out = new PipedOutputStream();
	
	static {
		try {
			out.connect(in);
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	String name;
	public MyPipe(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyPipeOut("Sender "));
		Thread t2 = new Thread(new MyPipeIn("Receiver "));
		t1.start();
		t2.start();
	}

}
class MyPipeIn extends MyPipe implements Runnable{
	public MyPipeIn(String name) {
		super(name);
	}
	public void run() {
		int i;
		try {
			while((i = MyPipe.in.read()) < 100) {
				System.out.println(" "+super.name +" da nhan" + i);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class MyPipeOut extends MyPipe implements Runnable{
	
	public MyPipeOut(String name) {
		super(name);
	}
	public void run() {
		int i=0;
		while(true) {
		try {
			i++;
			//super.out.write(i);
			MyPipe.out.write(i);
			System.out.println(super.name + "da gui" + i);
			if(i>=100) break;
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
	}
}