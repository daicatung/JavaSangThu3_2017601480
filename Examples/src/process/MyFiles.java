package process;
import java.io.*;
import java.util.Date;

public class MyFiles {
	
	public static void textOutputFile() throws IOException{
		FileWriter OutFileWriter = new FileWriter("ABC.txt");
		PrintWriter out = new PrintWriter(OutFileWriter);
		out.println(12345);
		out.println("HELLO WORLD");
		out.println(199.6789);
		out.println(false);
		
		out.close();
	}
	public static void textInputFile() throws IOException{
		FileReader InFileReader = new FileReader("ABC.txt");
		BufferedReader in = new BufferedReader(InFileReader);
		String tmpStr;
		int anInt;
		double aDouble;
		//boolean aBoolean;
		
		tmpStr = in.readLine();
		//anInt = (new Integer(tmpStr)).intValue();
		anInt = Integer.parseInt(tmpStr);
		System.out.println(anInt);
		
		tmpStr = in.readLine();
		System.out.println(tmpStr);
		
		tmpStr = in.readLine();
		
		
		//aDouble = (new Double(tmpStr)).doubleValue();
		aDouble = Integer.parseInt(tmpStr);
		//Double.parseDouble(tmpStr);
		System.out.println(aDouble);
		
		in.close();
	}

	public static void binaryOutPutFile() throws Exception{	
		FileOutputStream outfile  = new FileOutputStream("abc.bin");
		DataOutputStream out = new DataOutputStream(outfile);
		out.writeInt(2); // so luong ban ghi tro gi�p doc
		for(int i=0; i<2; i++) {
			out.writeInt(123+i);
			out.writeUTF("HELLO WORLD");
			out.writeDouble(123.45+i);
			out.writeBoolean(false);
		}
		out.close();
	}
	
	public static void binaryInPutFile() throws Exception{
		FileInputStream inFile  = new FileInputStream("abc.bin");
		DataInputStream in  = new DataInputStream(inFile);
		
		int resCount;
		String aStr;
		int anInt;
		double aDouble;
		boolean aBoolean;
		
		resCount = in.readInt();
		for(int i=0; i<resCount; i++) {
			
			anInt = in.readInt();
			System.out.println(anInt);
			
			aStr = in.readUTF();
			System.out.println(aStr);
			
			aDouble = in.readDouble();
			System.out.println(aDouble);
			
			aBoolean = in.readBoolean();
			System.out.println(aBoolean);
		}
		
		in.close();
	}
	public static void viewFileDetail() {
		File file = new File("ABC.txt");
		if(file.exists()) {
			System.out.println("Path is: " + file.getAbsolutePath());
			System.out.println("Its size is: " + file.length());
			Date dataModified = new Date(file.lastModified());
			System.out.println("Last Update is: " + dataModified);
		}else {
			System.out.println("The file dose not exit");
		}
	}
	
	public static void viewFolderInfo() {
		File dir = new File(".");
		if(dir.isDirectory()) {
			String[] subFiles = dir.list();
			for(int i=0; i<subFiles.length; i++) {
				if(new File(subFiles[i]).isDirectory()) {
					System.out.println(subFiles[i] + " <DIR> ");
				}else {
					System.out.println(subFiles[i]);
				}
			}
		}else {
			System.out.println("Not a directory");
		}
	}
	public static void main(String[] args) {
//		try {
//			MyFiles.textOutputFile();
//			MyFiles.textInputFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			//cho phep dau du lieu o trong file abc.bin
//			System.out.print("\nnhap in file voi kieu binary\n");
//			MyFiles.binaryOutPutFile();
//			MyFiles.binaryInPutFile();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		MyFiles.viewFileDetail();
		MyFiles.viewFolderInfo();
		// Neu in ra duoi dir thi no la thu muc
	}

}
