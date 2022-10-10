import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Yil giriniz: ");
		int yil = scan.nextInt();
		
		if(yil%4 ==0|| yil%400==0) {
			System.out.println("Artik yil: " + yil);
			
		}else
			System.out.println("Artik yil degil: " + yil);
		
		

	}

}
