import java.util.Scanner;

public class hesapMakinesi {

	public static void main(String[] args) {
    int a,b;    
    
    
    Scanner input = new Scanner(System.in);
    System.out.print("1. sayiyi gir: ");
     a = input.nextInt();
    System.out.print("2. sayiyi gir: ");
     b= input.nextInt();
    
    int toplama = a + b;
    int cikarma = a - b;
    int bolme = a/b;
    int carpma = a*b;
    
    System.out.println("1= toplama,2=cikarma,3 =bolme,4= carpma islemlerinden birini yanindaki rakami yazarak seciniz!");
    int islem = input.nextInt();
    
    if(islem == 1) {
    	System.out.println("Toplam= "+toplama);
    }
    else if(islem == 2) {
    	System.out.println("Fark: " +cikarma);
    }
    else if( islem == 3) {
    	System.out.println("Bolum: " +bolme);
    }
    else if(islem ==4)  {
    	System.out.println("carpim: "+carpma);
    }
    else {
    	System.out.println("Belirli aral�kta se�im yap�n�z!");
    	
    	
    }
    
		
		
		
		
	}

}
