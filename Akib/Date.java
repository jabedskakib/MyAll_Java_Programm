
public class Date {
	
	int dd;
	int mm;
	int yy;
	
	int months[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};

	String dayName[] = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
	
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
		if(yy%4==0&&yy%100!=0||yy%400==0) {
			months[2]=29;
		}
	}
	
	public int noOfDay() {
		
		int days=dd;
		int y=yy-1;
		
		 days=days+y*365;
		 days=days+y/4-y/100+y/400;
		 
		 for(int i=1;i<mm;i++)
		 {
			 days=days+months[i];
		 }
		
		return days;
	}
	
	public String getDayName()
	{
		return dayName[noOfDay()%7];
	}
	
	@Override
	public String toString() {
		
		
		return dd+"/"+mm+"/"+yy;
	}
}






















