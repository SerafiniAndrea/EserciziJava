package quartaLezione;

public class Main {
	
	public static void main(String[] args) {
		
		int[] interi = new int[3];
		interi[0] = 3;
		interi[1] = 5;
		interi[2] = 8;
		System.out.println(interi[0]);
		System.out.println(interi[1]);
		System.out.println(interi[2]);
		
		interi[0] = 768;
		interi[1] = 213;
		interi[2] = 57;
		System.out.println(interi[0]);
		System.out.println(interi[1]);
		System.out.println(interi[2]);
		
		int[] integers = {23, 87, 6};
		System.out.println(integers.length);
		System.out.println(integers[integers.length-1]);
		
		for(int integer : integers) {
			System.out.println(integer);
		}
	}

}
