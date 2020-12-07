

class quicksort {

	public static void quickSort(int left, int right, int a[]) {
		if(left<right) {
			int i = left;
			int j = right;
			int k = (left+right)/2;
			int t = a[k];
			while(i<=j) {
				while(a[i]<t) i++;
				while(a[j]>t) j--;
				if(i<=j) {
					int tg = a[i];
					a[i] = a[j];
					a[j] = tg;
					i++;
					j--;
				}
				
			}
			quicksort.quickSort(left, j, a);
			quicksort.quickSort(i, right, a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 4, 6, 6, 5, 4};
		quicksort.quickSort(0, 5, a);
		for(int i=0; i < 6; i++)
			System.out.print(a[i]);

	}

}
