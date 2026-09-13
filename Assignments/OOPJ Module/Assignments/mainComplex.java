
public class mainComplex {

	public static void main(String[] args) {
		ComplexNumber[] complexArray= new ComplexNumber[5];
		
		System.out.println("Enter 5 times data");
		for(int t=0;t<5;t++) {
			complexArray[t]=new ComplexNumber();
			
			System.out.println((t+1)+" Enter first number");
			int num1= ConsoleInput.getInt();
			complexArray[t].setNumber1(num1);
			
			System.out.println((t+1)+" Enter second number");
			int num2= ConsoleInput.getInt();
			complexArray[t].setNumber2(num2);
		}
		System.out.println("Results");
		for(int t=0;t<5;t++) {
			int results= complexArray[t].computeComplexNumber();
			System.out.println("Result "+(t+1)+"(number 1 * number2)" + results);
		}
		

	}

}
