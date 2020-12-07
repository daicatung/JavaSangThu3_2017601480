package test1;

//import process.MyArrrays;

public class examples1 {
	// tao ra mang 2 chieu
	public static int[][] generateArray(int rows, int cols) {	
		int[][] arrInt = new int[rows][cols];
		for(int i=0; i < rows; i++)
			for(int j=0; j < cols; j++)
				arrInt[i][j] = (int)(Math.random()*100);
		return arrInt;		
	}
	//xuat mang 2 chieu
	public static void printArray(int[][] arrInt) {
        for(int i=0; i < arrInt.length; i++) {
        	for(int j=0; j < arrInt[0].length; j++)
        		System.out.print(arrInt[i][j] + " ");
        	 System.out.print("\n");
        }
       
    }
	
	//bai1 
	//sap xep noi bot
	public static int[] sortedArray(int[] arrInt, boolean isINC) {
		//xac dinh huong sap xep
		byte oriented = (byte)(isINC ? 1:-1);
		//sap xep
		int temp;
		for(int i=0; i < arrInt.length - 1; i++) {
			for(int j=i+1; j < arrInt.length; j++) {
				if(arrInt[i]*oriented > arrInt[j]*oriented) {
					temp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j]  = temp;
				}
			}
		}
		return arrInt;
	}
	
	public static void sort(int[][] arrInt, boolean isINC) {	
		for(int [] row: arrInt)
			examples1.sortedArray(row, isINC);
	}
	
	//Bai2
	public static int[] fill(int[][] arrInt) {
		int[] brrInt = new int[arrInt.length * arrInt[0].length];
		
		int sum=0, temp1 = 0;
		for(int i=0; i < arrInt.length; i++)
			for(int j=0; j < arrInt[0].length; j++)
				sum+=arrInt[i][j];
		float TB = sum/(arrInt.length * arrInt[0].length);
		for(int i=0; i < arrInt.length; i++)
			for(int j=0; j < arrInt[0].length; j++)
				if(arrInt[i][j] > TB)
					brrInt[temp1++] = arrInt[i][j];
		
		return brrInt;
	}
	//Bai3
	public static void fillArray(int[][] arrInt, int m) {
		for(int i=1; i < arrInt.length; i++)
			for(int j=0; j < arrInt[0].length; j++) {
				
			}
		
	}
	//Bai4
	public static void swaprow(int[][] arrInt, int row1, int row2) {
		
		if((row1>=0 && row1<arrInt.length)&&(row2>=0 && row2<arrInt.length))
		      for(int j=0;j<arrInt[0].length;j++) {
		    	  int temp = arrInt[row1][j];
		    	  arrInt[row1][j] = arrInt[row2][j];
		    	  arrInt[row2][j] = temp;
		      }
	}
	
	public static int[][] sortedArray2(int[][] arrInt, boolean isINC) {
		//xac dinh huong sap xep
		byte oriented = (byte)(isINC ? 1:-1);
		//sap xep
		for(int i=0; i < arrInt.length - 1; i++) {
			for(int j=i+1; j < arrInt.length; j++) {
				if(arrInt[i][0]*oriented > arrInt[j][0]*oriented) {
					
					examples1.swaprow(arrInt, i, j);
				}
			}
		}
		return arrInt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("mang vua sinh ngau nhien là: \n");
		int[][] arrInt = new int[5][6];
		arrInt = examples1.generateArray(5, 6);
		examples1.printArray(arrInt);
		
		System.out.println("--------");
		//examples1.sort(arrInt, true);
		//examples1.printArray(arrInt);
		
		//System.out.println("\n-----------------------");
		//int[] brrInt;
		//brrInt = examples1.fill(arrInt);
		//examples1.printArray(brrInt);
		System.out.print("mang sau khi duoc sap theo thu tu la: \n");
		arrInt = examples1.sortedArray2(arrInt, true);
		examples1.printArray(arrInt);
	}

}
