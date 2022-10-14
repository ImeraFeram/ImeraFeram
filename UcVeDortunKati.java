import java.util.Scanner;

public class UcVeDortunKati {

	public static void main(String[] args) {
	
		 
	       Scanner inp = new Scanner(System.in);
	       System.out.println("Enter Number: ");
	       int numb = inp.nextInt();
	       
	       for (int i = 0; i < numb; i++) {
			if(numb%3 == 0 && numb%4 == 0) {
				System.out.println("3 ve 4un kati");
			}
			else
				System.out.println("3 ve 4un kati degil");
	    	   break;
		}
	       
}
	}

