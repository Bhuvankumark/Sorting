package sjb.Timecomplexity;

public class Binary {
	public static void main(String[] args) {
		Binarysearch b = new Binarysearch();
		int[] ar = {10,22,33,445,55};
		int element= 445;
		int index = b.binarySearch(ar, element);
		if(index!=-1) {
			System.out.println("element found in index :" + index);
			}else {
				System.out.println("element not found : ");
		}
	}

}
