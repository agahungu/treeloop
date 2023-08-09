package oopjava;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("value of i and j :"+i+" "+j);
			}
			System.out.println("********************");
		}
		
		int z = 0;
		for (int x = 1; x <= 5; x++) {
			z++;
			for (int y = 1; y <= z; y++) {
				System.out.print("@");
			}
			System.out.println("");
		}
	}

}
