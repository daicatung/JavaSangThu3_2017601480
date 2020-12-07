package process;
import java.io.*;
public class DataPutter extends Thread{
	OutputStream out;
	public DataPutter(OutputStream o) {
		this.out = o;
	}
	public void run() {
		try {
			for(char c='A'; c <= 'Z'; c++)
				this.out.write(c);
			this.out.close();
		}catch (IOException exc) {
			// TODO: handle exception
			return;
		}
	}
	public static void main(String[] args) {
		try {
			PipedOutputStream pout = new PipedOutputStream();
			PipedInputStream pin = new PipedInputStream(pout);
			new DataPutter(pout).start();
			new DataGetter(pin).start();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
class DataGetter extends Thread{
	InputStream in;
	public DataGetter(InputStream i) { 
		this.in=i;
	}
	public void run() {
		try {
			int c;
			while((c=this.in.read()) != -1)
				System.out.println((char) c);
			this.in.close();
		}catch (IOException exc) {
			// TODO: handle exception
			//e.printStackTrace();
			return;
		}
	}
}
