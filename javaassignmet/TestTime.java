package javaassignmet;

class Time{
int hr,min,sec;

public Time(int hr, int min, int sec) {
	if(isValid(hr,min,sec))
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		System.out.println("this time:"+hr +min+ +sec);
	}
	else
	{
		System.out.println("invalid values for time hr and sec 00.00.00");
		hr=0;
		min=0;
		sec=0;
	}
}


public boolean isValid(int hr, int min, int sec) {
  
	// TODO Auto-generated method stub
	return(hr>=0 && hr<24)&&( min>=0 && min<60)&& (sec>=0 &&sec<60);
  }	

public  void display(){
  System.out.println(hr+ ":" +min+ ":" +sec);

}
}
	
public class TestTime {
public static void main(String[] args)
{
	Time time  = new Time(22,58,9);
	time.display();
}
}





