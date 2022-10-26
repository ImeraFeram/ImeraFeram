import java.util.Scanner;

public class usAlma {
	
	static int power(int taban , int us) {
	
		if(taban == 1)
			return 1;
		else if(us == 0)
			return 1;
		else
			return taban*power(taban,us-1);
		
			
		}
		
		
		
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban gir: ");
		int taban = scan.nextInt();
		System.out.print("Us gir: ");
		int us = scan.nextInt();
		System.out.println("Sonuc= " +  power(taban,us)); 
	}
}
