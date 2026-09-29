import java.util.Arrays;

public class K_largestNo {

	public static void main(String[] args) {
		int[] arr= {10,5,20,15,30};
		int k=2;
		
		Arrays.sort(arr);
		
		int result=arr[arr.length-k];
		
		System.out.println("K-largest element: "+result);
		
	}

}
