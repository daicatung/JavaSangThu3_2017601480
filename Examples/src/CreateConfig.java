
class CreateConfig {
	 public static void view_config(int a[], int n) {
		 for(int i=1; i <= n; i++)
			 System.out.print(a[i] + " ");
		 System.out.print("\n");
	 }
	 public static void next_config(int a[], int n, int i) {
		 a[i]=1;
		 i++;
		 while(i<=n) {
			 a[i]=0;
			 i++;
		 }
	 }
	 public static void config(int a[], int n) {
		 int i=1;
		 for(i=1; i<=n; i++)
			 a[i]=0;		 
		 do {
			 CreateConfig.view_config(a, n);
			 i=n;
			 while(i>0 && a[i] == 1) i--;
				 if(i>0) CreateConfig.next_config(a, n, i);
		 }while(i>0);
	 }
	public static void main(String[] args) {
		int a[];
		a = new int[5];
		CreateConfig.config(a, 5);
		
	}

}
