import java.util.Scanner;

public class SwitchCase{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		String choice;
		do{
		System.out.println("Please select any Problem");
		System.out.println("Problem 1 Grade Evaluation System");
		System.out.println("Problem 2 Leap year check");
		System.out.println("Problem 3 Day of the week");
		System.out.println("Problem 4 Identify Default Values of Variables");
		System.out.println("Exit");
		System.out.println("Enter your choice :");


		choice=sc.nextLine();
		System.out.println("Your selected Problem is:" +choice);

		switch(choice){
			case "1" :
			case "Problem 1 Grade Evaluation System" :
			case "Problem 1 : Grade Evaluation System" : {	int Maths=80;
            								int Science=85;
            								int History=90;

            								int Avg_marks=(Maths+Science+History)/3;
            								System.out.println("Average Marks:"+Avg_marks);

            								if(Avg_marks>=90){
               									System.out.println("Grade: A");
           								}  
            								else if(Avg_marks>=70 && Avg_marks<=89){
               									System.out.println("Grade: B");
             								}
             								else if(Avg_marks>=50 && Avg_marks<=69){
              	 								System.out.println("Grade: C");
             								}
              								else if(Avg_marks>=30 && Avg_marks<=49){
               									System.out.println("Grade: D");
             								}
             								else{
               									System.out.println("Fail");
             								}
									break;
								}

			case "2" :
			case "Problem 2 Leap year check" :
			case "Problem 2 : Leap year check" :  {  int year=1900;
          
          							if(year%4==0 && year%100!=0 || year%400==0){
              								System.out.println(year+" is a leap year");
          							}
          							else{
              								System.out.println(year+" is not a leap year" );
             							}
								break;
							      }

			case "3" :
			case "Problem 3 Day of the week":
			case "Problem 3 : Day of the week": {	int day=3;
      
      								if(day==1){
         								System.out.println("The day is Monday");
      								}
      								else if(day==2){
         								System.out.println("The day is Tuesday");
      								}
      								else if(day==3){
         								System.out.println("The day is Wednesday");
      								}
      								else if(day==4){
         								System.out.println("The day is Thursday");
      								}
      								else if(day==5){
         								System.out.println("The day is Friday");
      								}
      								else if(day==6){
         								System.out.println("The day is Saturday");
      								}
      								else if(day==7){
         								System.out.println("The day is Sunday");
      								}
     								else{
         								System.out.println("Invalid day number");
      								}
								break;
							     }

			case "4" :
			case "Problem 4 Identify Default Values of Variables" :
			case "Problem 4 : Identify Default Values of Variables" :{	
										byte a=0;
              									short b=00;
              									int c=0000;
              									long d=000000L;
              									float e=0.00f;
              									double f=0.00000;
              									char g='c';
              									boolean h=true;

              									System.out.println("byte:"+a);
              									System.out.println("short:"+b);
              									System.out.println("int:"+c);
              									System.out.println("long:"+d);
              									System.out.println("float:"+e);
              									System.out.println("double:"+f);
              									System.out.println("char:"+g);
              									System.out.println("boolean:"+h);

										break;
									      }
			
			case "5" : System.out.println("Exit");
				 break;
			default : System.out.println("Invalid Choices");
			}
			
		}while(!choice.equals("5"));
	
	}

}