import java.awt.SystemColor;
import java.util.Scanner;

public class GelismisHesapMakinesi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		String menu = "1-Toplama,2-Cikarma,3-Carpma,4-Bolme,5-Us alma,6-Mod alma,7-Dikdortgen alani ve cevresi ,0 - cikis yap";
		
		while(true) {
		System.out.println(menu);
		System.out.print("Islem sec: " );
		select = scan.nextInt();
		if(select==0) {
			System.out.println("Gule Gule!");
			break;
		}
		
		System.out.println("1.sayi: " );
		int a = scan.nextInt();
		System.out.println("2.sayi: " );
		int b = scan.nextInt();
		switch(select) {
		case 1:
			sum(a, b); 
			break;
		case 2: 
			minus(a, b);
			break;
		case 3: 
			times(a, b);
			break;
		case 4:
			divided(a, b);
			break;
		case 5:
		power(a,b);
		break;
		case 6:
			System.out.println(mod(a, b));
			break;
		case 7:
			calc(a, b);
			break;
			default:
				System.out.println("Gecersiz islem!");
				break;
		}
		}
	}
	static int sum(int a,int b) {
		int result = a+b;
		System.out.println(result);
		return result;
	}
	
	static int minus(int a, int b) {
		int result = a-b;
		System.out.println(result);
		return result;
	}
	static int times(int a, int b) {
		int result = a*b;
		System.out.println(result);
		return result;
	}
	static int divided(int a,int b) {
		int result = a/b;
		if( b != 0) {
		System.out.println(result);
		return result;}
		else {
			System.out.println("2. sayi 0 dan farkli olmali!");
			return 0; 
		}
	}
	static int power(int a,int b) {
		int result = 1;
		for (int i = 1; i <= b ; i++) {
			result*=a;
		}
		System.out.println(result);
		return result;
	}
	static int mod(int a,int b) {
		return a%b;
		
	}
	static void calc(int a, int b) {
		System.out.println("Cevresi: " + 2*(a+b));
		System.out.println("Alani: " + a*b );
	}

}
