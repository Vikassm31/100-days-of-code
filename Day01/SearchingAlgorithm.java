public class Search {

	public static void main(String[] args) {
		binarySearch();
		linearSearch();
	}
	public static void binarySearch() {
		int a[]= {1,3,4,9,12,14,19,24,25,27,31,37};
		int key=24;
		int index=-1;
		int l=0,r=a.length-1;
		while(l<=r) {
			int mid=(r+l)/2;
			if(key==a[mid]) {
				index=mid;
				break;
			}else if(key<=a[mid]) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		System.out.println(index);
	}
	
	public static void linearSearch() {
		int a[]= {1,23,2,5,3,21,8,11,41,9,10};
		int key=8;
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				index=i;
				break;
			}
		}
		System.out.println(index);
		
	}
}
