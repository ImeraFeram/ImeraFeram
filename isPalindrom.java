import java.util.Scanner;

public class isPalindrom {

	public static void main(String[] args) {
	
		System.out.println(isPolindrom(12211));
		}
		static boolean isPolindrom(int input) {
			int tmp,tersSayi = 0,kalan;
			tmp = input;
			while(tmp!=0) {
				kalan = tmp%10;
				tersSayi = tersSayi * 10 +kalan;
				tmp /= 10;
			}
			if(input==tersSayi) {
				return true;
			}
			else
				return false;
	
}
		}
	
