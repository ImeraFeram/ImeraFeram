import java.util.Scanner;

public class İkiVe4unKatlari {

	public static void main(String[] args) {
		int n;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Sayi gir:");
			n = scan.nextInt();
			if(n%2 ==0 && n%4 == 0)	{
				total += n;
			}
			
		}while( n>0);
		
		System.out.print("Toplam: "+total);


}
}
