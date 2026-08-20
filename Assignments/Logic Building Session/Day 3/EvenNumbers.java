public class EvenNumbers{
	void printEvenNumbers(int num){
		while(num<=50){
			if(num%2==0){
				System.out.println(num);
			}
			
			num++;
		}
	}
	public static void main(String[] args){
		int num=1;	
		EvenNumbers obj= new EvenNumbers();
		obj.printEvenNumbers(num);

		
	}
	
}