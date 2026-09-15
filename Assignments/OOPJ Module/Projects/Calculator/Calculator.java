
public class Calculator {
	int num1;
	int num2;
	
	Calculator(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public int add() {
		return num1+num2;
	}
	public int sub() {
		return num1-num2;
	}
	public int mul() {
		return num1*num2;
	}
	public int div() {
		if(num2==0) {
			System.out.println("Error: Division by zero is not allowed!");
			return 0;
		}
		else {
			return num1/num2;
		}
		
	}
	public int mod() {
		return num1%num2;
	}
}
