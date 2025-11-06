// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int x = Integer.parseInt(args[0]);
		double sum = 0;
		for (int i = 0; i < x; i++){
			double y = 2.0 * i + 1.0;
			if(i % 2 == 0){
				sum = sum +(1.0 / y);
			}else{
				sum = sum -(1.0 / y);
			}

		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:    " + 4.0 * sum);
	}
}
