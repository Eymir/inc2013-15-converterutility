import java.util.*;
public class ProgAppsProjectTemperature{
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);

		while(true){
			System.out.println("Temperature Converter Menu");
			System.out.println("1.Celsius to Fahreinheit");
			System.out.println("2.Fahreinheit to Celsius");
			System.out.println("3.Fahreinheit to Kelvin");
			System.out.println("4.Kelvin to Fahreinheit");
		    System.out.println("5.Kelvin to Celsius");
		    System.out.println("6.Celsius to Kelvin");
			System.out.println("7.Quit");
			System.out.println("Please Enter Your Choice <1/2/3/4/5/6/7>:");
			int choice = kbd.nextInt();

			switch(choice){
			case 1:
					doCtF();
					break;
			case 2:
					doFtC();
					break;

			case 3:
					doFtK();
					break;

			case 4:
					doKtF();
					break;

			case 5:
					doKtC();
					break;

			case 6:
					doCtK();
					break;

			case 7:
				 	System.exit(0);
					break;
			default:
					System.out.println("invalid choice");
					break;
				}
			}
		}
		public static void doCtF(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("please enter your temperature in celsius");
		double celsius = kbd.nextDouble();
		double fahrenheit = 1.8 * celsius + 32;
		System.out.println(celsius + " degrees celsius =" + fahrenheit + " degrees fahrenheit");


		}
		public static void doFtC(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("please enter your temperature in fahrenheit");
		double fahrenheit = kbd.nextDouble();
		double celsius = 5.0/9.0 * fahrenheit - 32;
		System.out.println(fahrenheit + " degrees fahrenheit =" + celsius + " degrees celsius");

		}

		public static void doFtK(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("please enter your temperature in fahrenheit");
		double fahrenheit = kbd.nextDouble();
		double celsius = (5.0/9.0 * fahrenheit - 32) + 273;
		System.out.println(fahrenheit + " degrees fahrenheit =" + celsius + " kelvin");

		}

		public static void doKtF(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("please enter your temperature in kelvin");
		double fahrenheit = kbd.nextDouble();
		double celsius = (5.0/9.0 * fahrenheit - 32) - 273;
		System.out.println(fahrenheit + " kelvin =" + celsius + " degrees celsius");

		}

		public static void doKtC(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("please enter your temperature in kelvin");
		double kelvin = kbd.nextDouble();
		double celsius = kelvin + 273;
		System.out.println(kelvin + " degrees fahrenheit =" + celsius + " kelvin");

		}

		public static void doCtK(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("please enter your temperature in celsius");
		double fahrenheit = kbd.nextDouble();
		double celsius = fahrenheit + 273;
		System.out.println(fahrenheit + " degrees fahrenheit =" + celsius + " kelvin");

		}



	}