import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class ProgAppsProjectCurrency {
	public static void main(String [] args) throws java.io.IOException {
		Scanner kbd = new Scanner(System.in);

		while(true){
			System.out.println("Currency Converter Menu");
			System.out.println("1. US Dollar to Philippine Peso and Vice Versa");
			System.out.println("2. Euro to Philippine Peso and Vice Versa");
			System.out.println("3. British Pound Sterling to Philippine Peso and Vice Versa");
			System.out.println("4. Quit");
			System.out.println("Please Enter Your Choice <1/2/3/4>:");
			int choice = kbd.nextInt();

			switch(choice) {
			case 1:
					doDp();
					break;
			case 2:
					doEp();
					break;

			case 3:
					doPp();
					break;

			case 4:
				 	System.exit(0);
					break;
			default:
					System.out.println("Invalid choice");
					break;
				}
			}
		}

		public static void doDp() throws IOException {
			double toDllr, toDllr1, toPeso, toPeso1;

			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the amount to be converted to Dollars:");
			toDllr = Double.parseDouble(d.readLine());
			System.out.println("Enter the amount to be converted to PH Peso:");
			toPeso = Double.parseDouble(d.readLine());

			toDllr1 = toDllr * 0.0229;
			toPeso1 = toPeso * 43.6224;

			System.out.println(toDllr +" PHP is equal to "+ toDllr1 +" USD ");
			System.out.println(toPeso +" USD is equal to " + toPeso1 +" PHP ");
		}

		public static void doEp() throws IOException {
			double toEuro, toEuro1, toPeso, toPeso1;

			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the amount to be converted to Euros:");
			toEuro = Double.parseDouble(d.readLine());
			System.out.println("Enter the amount to be converted to PH Peso:");
			toPeso = Double.parseDouble(d.readLine());

			toEuro1 = toEuro * 0.017;
			toPeso1 = toPeso * 58.9392;

			System.out.println(toEuro +" PHP is equal to "+ toEuro1 +" EUR ");
			System.out.println(toPeso +" EUR is equal to " + toPeso1 +" PHP ");
		}

		public static void doPp() throws IOException {
			double toGbp, toGbp1, toPeso, toPeso1;

			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the amount to be converted to British Pound:");
			toGbp = Double.parseDouble(d.readLine());
			System.out.println("Enter the amount to be converted to PH Peso:");
			toPeso = Double.parseDouble(d.readLine());

			toGbp1 = toGbp * 0.0142;
			toPeso1 = toPeso * 70.2207;

			System.out.println(toGbp +" PHP is equal to "+ toGbp1 +" GBP ");
			System.out.println(toPeso +" GBP is equal to " + toPeso1 +" PHP ");
		}
}