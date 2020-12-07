package process;

import java.util.ArrayList;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class MyStrings {

	public static int countChar(String str, char ch, boolean isIgnoreCase) {
		// neu co bo qua kieu chu
		if (isIgnoreCase) {
			str = str.toLowerCase();
			ch = Character.toLowerCase(ch);
		}
		int count = 0;

		// thuc hien dem
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ch)
				count++;
		}
		return count;
	}

	public static int countWord(String str) {
		// chuan hoa
		str = MyStrings.formatString(str);

		// dem so tu
		int count = MyStrings.countChar(str, ' ', false) + 1;
		return count;
	}

	public static String formatString(String str) {
		// danh sach cac ky tu dac biet trong chuoi
		char[] chs = { '`', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '<', '>', ',', '.',
				'?', '/', '{', '}', '[', ']', '\\', '|' };

		// loai bo cac ky tu dac biet khoi chuoi
		for (char ch : chs) {
			str = str.replace(ch, ' ');
		}

		// loai bo cac dau cach thua
		str = str.trim();
		while (str.indexOf("  ") != -1) {
			str = str.replace("  ", " ");
		}
		return str;
	}

	
	// vd ve viet phuong thuc nop kiem tra
	
	public static String getWords(String str, byte nwords) {
		str = MyStrings.formatString(str);
		int words = MyStrings.countWord(str);
		int count = 0;
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
			
			if(count == nwords) {
				str = str.substring(0, i);
				break;
			}
			
		}
		if(nwords < words)
			str = str + '.' + '.' + '.' ; 
		return str;
	}
	
	public static ArrayList<String> statucsticWord(String str, String split_ch){
		// Lay ra mang cac tu 
		String[] words_tmp = str.split(split_ch);
		
		// Duyet mang lay ra cac tu khac nhau
				
		ArrayList<String> words = new ArrayList<>(100);
		for(String word:words_tmp) {			
			word = word.trim();// Cat bo khoang trong
			if(!word.equalsIgnoreCase("") && word.contains(word)) {
				words.add(word);
			}
		}
		// Ket Qua thong ke
		
		ArrayList<String> result = new ArrayList<>(words.size());
		int count = 0;
		for(String w:words) {	
			for(String w2:words_tmp) {
				if(w.equalsIgnoreCase(w2.trim()))
					count++;
			}

				result.add(w + " So Luong Tu " + count);
				count = 0;
		}
		return result;
	}	
	
	public static void main(String[] args) {
		//int count;
		String str = "Cong Hoa Xa Hoi Chu Nghia Viet Nam";
		// char ch = 'e';
		// count = MyStrings.countChar(str, ch, true);
		// System.out.print("co tat ca "+ count + " ky tu e ");
		System.out.print("chuoi ban dau nhap vao:\n" +str+ "\nchuoi sau khi cat: \n");
		//count = MyStrings.countWord(str);
		//System.out.print("co tat ca " + count + " tu trong chuoi tren \n");
		String aa = MyStrings.getWords(str, (byte)1);
		System.out.print(aa + "\n");
		String str2 = "abc#abc#agh#cmd#cmd";
		System.out.print(MyStrings.statucsticWord(str2, "#"));
		
	}
}
