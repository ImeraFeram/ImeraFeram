import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		double total;
		int kg;
		double armutF = 2.14;
		double elmaF = 3.67;
		double domatesF = 1.11;
		double muzF = 0.95;
		double paticanF = 5;
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Armut kac kilo: ");
		 kg = scan1.nextInt();
		double armut = kg*armutF;
			
		Scanner scan2 = new Scanner(System.in);
			System.out.println("Elma kac kilo: ");
			kg = scan2.nextInt();
			double elma = kg*elmaF;
		
			Scanner scan3 = new Scanner(System.in);
		System.out.println("Patlican kac kilo: ");
		 kg = scan3.nextInt();
		double patlican = kg*paticanF;
			
		Scanner scan4 = new Scanner(System.in);
			System.out.println("Muz kac kilo: ");
			 kg = scan4.nextInt();
			double muz = kg*muzF;
		
			Scanner scan5 = new Scanner(System.in);
		System.out.println("Armut kac kilo: ");
		 kg = scan5.nextInt();
		double domates = kg*domatesF;
		
		total = armut +elma + muz+ domates +patlican;
		System.out.println("total: " + total);

	}

}
