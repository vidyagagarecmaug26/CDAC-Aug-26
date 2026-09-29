
public class SumTarget {
	
	static boolean twoSum(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					return true;
				}
			}
		}
		return false;
	} 

	public static void main(String[] args) {
		int[] arr= {9,7,11,15};
		int target=18;
		
		System.out.println(twoSum(arr,target));
	}

}
