import java.util.Scanner;

public class DortVe5inKuvvetleri {

	public static void main(String[] args) {
		int n;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi gir: ");
		int eKadar = scan.nextInt();
		
		for (int i = 1; i <= eKadar; i*=4) {
			
			System.out.println("4un kuuveti: " +i);

		}
		for (int j = 1; j <= eKadar; j*=5) {
			
			System.out.println("5in kuuveti: " + j);
		}
		
}
	}
