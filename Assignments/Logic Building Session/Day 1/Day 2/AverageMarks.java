class AverageMarks{
      public static void main(String args[]){
            int Maths=80;
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


}



}