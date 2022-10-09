import java.util.Scanner;

public class loginIslemi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String kullanici,parola;
		System.out.print("Kullanici adi gir: ");
		kullanici = input.nextLine();
		System.out.println("Parola gir: ");
		parola = input.nextLine();
		
		if ( kullanici.equals("ahmet")&& parola.equals("123")) {
			System.out.println("Giriş yapildi!");
			
		}
		else {
			System.out.println("Kullanici adi veya parola yanliş!");
		}
		
		
		
	}

}
