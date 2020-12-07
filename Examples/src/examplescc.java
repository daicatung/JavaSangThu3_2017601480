/**
 * <i> Các lớp đối tượng </i>
 * @author Vu Viet Tung
 *
 */
class examplescc {

	public static int getRandomIntValue(int max_value) {
		/**
		 * phương thức tạo giá trị ngẫu nhiên chặn trên bởi max_value
		 */
		return (int)(Math.random()*max_value);
	}
	public static boolean isprime(int n) {
		/**
		 * phương thức kiểm tra n có phải số nguyên tố hay không
		 * đúng trả về true sai trả về false
		 */
		boolean flag = true;
		if(n<2) flag=false;
		else {
			for(int v=2; v<=(int)Math.sqrt(n); v++) {
				if(n%v==0) { 
					flag=false;
					break;
				}
			}
		}
		return flag;
	}
	public static int  getUCLN(int a, int b) {
		/**
		 * phương thức trả về ước chung lớn nhất của hai số a và b
		 * 
		 */
		if(a == 0 || b == 0) return a+b;
			
			while(a!=b) {
				if(a>b) a-=b;
				else b-=a;
			}
		
		return a;
	}
	public static int  getUCLN(int a, int b, int c) {
		/**
		 * phương thức tính ước chung lớn nhất của 3 số a, b, c
		 */
		return examplescc.getUCLN(examplescc.getUCLN(a, b),c);
	}
	public static void getQuard(int a, int b, int c) {
		/**
		 * phương thức giải phương trình bậc 2
		 */
		if(a==0 && b!=0) System.out.print("Nghiệm của PT là:"+(-c/b));
		else {
			double delta = b*b-4*a*c;
			if(delta < 0) {
				double d = Math.abs(delta);
				double r = -b/(2.0*a);
				double v = (Math.sqrt(d))/(2.0*a);
				System.out.print("PT có 2 nghiệm phân Phức \n");
				System.out.print((r)+" -j " +v);
				System.out.print("\n");
				System.out.print((r)+" +j " +v);
			}
			else if(delta > 0) {
				double x1 = (-b+Math.sqrt(delta)/(2*a));
				double x2 = (-b-Math.sqrt(delta)/(2*a));
				System.out.print("PT có 2 nghiệm phân biệt \n");
				System.out.printf("%1.2f\n", x1);
				
				System.out.printf("%1.2f\n", x2);
			}
			else if(delta == 0) {
				double x = (-b)/(2*a);
				System.out.printf("%1.2f\n", x);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int a = examplescc.getRandomIntValue(10);
		int b = examplescc.getRandomIntValue(10);
		int c = examplescc.getRandomIntValue(10);
		boolean check = examplescc.isprime(a);
		
		System.out.print("UCLN của "+b+ "  " +c+" là " +examplescc.getUCLN(c, b)+"\n");
		if(check) 
			System.out.print(a + " là số nguyên tố\n");
		else 
			System.out.print(a + " không là số nguyên tố\n");
		
		examplescc.getQuard(a, b, c);
		
	}

}
