
public class Date {
	private int day;
	private int month;
	private int year;
	
	private int[] noofDays= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date() {
		setDate(1,1,2026);
	}
	
	public Date(int dd,int mm,int yy) {
		setDate(dd,mm,yy);
	}
	
	public void setDate(int dd,int mm,int yy) {
		if(yy<1950 || yy>3000)
			year=2026;
		else 
			year=yy;
		
		if(mm<1 || mm>12)
			month=1;
		else
			month=mm;
		
		isLeapYear();
		
		if(dd < 1 || dd > noofDays[month])
				day=1;
		else
			day = dd;	
	}

	public void addDays(int daysToAdd) {
		int totalDays=day+daysToAdd;
		while(totalDays > noofDays[month]) {
			totalDays -= noofDays[month];
			month++;
			if(month>12)
				year++;
			
			isLeapYear();
		}
		day=totalDays;
	}
	
	public boolean isLeapYear() {
		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			noofDays[2]=29;
		else	
			noofDays[2]=28;	
		return true;
	}
	public void addMonths(int monthsToAdd) {
		
		month += monthsToAdd;
		while(month > 12) {
			month -= 12;
			year++;
		}
			isLeapYear();
			
	}
	public void addYear(int yearsToAdd) {
		int months = yearsToAdd * 12;
		addMonths(months);
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void display() {
		System.out.println("Resulting Date: "+ day+ "/" +month+ "/" +year);
	}
}
	
	

