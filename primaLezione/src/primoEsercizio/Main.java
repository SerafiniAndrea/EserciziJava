package primoEsercizio;

public class Main {

	public static void main(String[] args) {
		double x1 = 0, x2 = 0, a = 1, b = 1, c = 2, delta = 0;
		delta = b*b-4*a*c;
		if(delta > 0) {
			x1 = (-b+Math.sqrt(delta))/(2*a);
			x2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.print("x1: " + x1 + "\nx2: " + x2);
		} else if(delta == 0) {
			x1 = -b/(2*a);
			System.out.print("x1: " + x1);
		} else {
			delta = delta * -1;
			delta = Math.sqrt(delta);
			b = -b;
			System.out.println("x1: " + b/2 + "+" + delta/2 + "i");
			System.out.println("x2: " + b/2 + "-" + delta/2 + "i");
		}
	}

}
