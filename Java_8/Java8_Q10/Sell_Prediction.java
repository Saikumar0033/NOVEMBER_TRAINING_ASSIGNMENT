package Java8_Q10;
import java.util.*;


/*. User can enter sell for 
any year and can ask for predication of sell for any given year. */
public class Sell_Prediction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Double> hm = new HashMap<>();
		Integer year = null;
		Double sell = null;
		double diff = 0;
		List<Double> list = new ArrayList<>();
		int lastyear = 0;
		System.out.println("please enter year and sell in crore");
		for (int i = 1; i < 4; i++) {
			System.out.println("Enter year");
			year = sc.nextInt();
			System.out.println("Enter sell");
			sell = sc.nextDouble();
			hm.put(year, sell);
			list.add(sell);
			if(lastyear<year) {
				lastyear = year;
			}
		}
		
		System.out.println(lastyear);
		
		//System.out.println(diff);
		System.out.println(list);
		
		double arr[]= new double[hm.size()] ;
		
		//this will return the double value which is of difference between all sell in years
		Predictor pre = (hashmap, d)->{
	       for(int i=0;i<hm.size()-1;i++) {
	    	   for(int j=i+1;j<hm.size();j++) {
	    		  // System.out.println(list.get(j)+"-"+list.get(i));
	    		   
	    		   d = d + (list.get(j)-list.get(i));
	    		  // System.out.println(d);
	    		   break;
	    		   
	    	   }
	    	   
	       }
		return d;
		};


		//calling the functional interface method and storing it in variable
		 double average = pre.prediction(hm, diff);
		 
		 //finding the average of the total differences
		 double diffavg = average/(hm.size()-1);
		 
		 System.out.println("Enter the year which you want to predict:");
		 int predictYear = sc.nextInt();
		 int yearDiff = predictYear - lastyear;
		 
		 //it will return the predicted sell of the given year
		 double predictedSell = (diffavg*yearDiff) + (hm.get(year));
		 
		 System.out.println("The predicted sell is : "+predictedSell);
	}
}


interface Predictor{
   abstract public double prediction(HashMap<Integer, Double> hashmap,double d);
}
