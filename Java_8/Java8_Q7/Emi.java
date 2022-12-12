package Java8_Q7;

/**/
public class Emi {
	private static double total_emis = 12;
	private static double amount = 200000;
	private static double rate_of_interest = 6;
	private static int time_duration = 20;
	private static double emi;

	public static void main(String[] args) {

		EMICalc emiCalc = () -> {
			emi = (amount * rate_of_interest * Math.pow(1 + rate_of_interest, time_duration))
					/ (Math.pow(1 + rate_of_interest, time_duration) - 1);

			return emi;
		};

		System.out.println(emiCalc.emiCalculator());

	}
}

interface EMICalc{
	 double emiCalculator();
}
