import java.util.Scanner;
class LondonForecastWeather 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int userchoice;
	do
		{
		allMenuList();
		userchoice=sc.nextInt();
		switch(userchoice)
		{

		case 1:
			   londonWeather();
		       break;

		case 2:
			londonWindSpeed();
		      break;

		case 3:
			   londonPressure();
		       break;
		case 0: 

			 System.out.println(" you will be exit....now");
		      break;

		default:
			  System.out.println("your choice is invalid please choose  a valid option");
		}
	}
       while(userchoice!=0);
        sc.close();

	}	

	public static void allMenuList()
		{
		System.out.println("please choice any given number from below to Know about London Weather Forecast");

		System.out.println("1-for weather forecast of London");

		System.out.println("2-for wind speed of London");

      System.out.println("3-for pressure forecast of London");

     System.out.println("0-for exit into the Program");
		}
		public static  void londonWeather()
		{
			System.out.println("the london wheather is cloudy i.e 21/15c");
		}

		public static void londonWindSpeed()
		{
           System.out.println("the london wind speed is very slow i.e 9km/h");
		}

		public static void londonPressure()
		{
			System.out.println("The pressure is Average i.e 25.5pa");

		}

}



