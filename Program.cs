using System;

namespace C_SharpPatikaOdev1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //ciftSayilar();
            kelimeVeharfSayisi();
            // reverseText();
        }
        static void reverseText()
        {


            Console.WriteLine("Bir sayi giriniz: ");
            int sayi = Convert.ToInt32(Console.ReadLine());
            string[] kelimeler = new string[sayi];
            for (int i = 0; i < sayi; i++)
            {
                Console.WriteLine(i + 1 + ". kelimeyi giriniz: ");
                kelimeler[i] = Console.ReadLine();
            }
            Array.Reverse(kelimeler);
            
        }
        static void kelimeVeharfSayisi()    
        {
            int harfSayac = 0;
            int kelimeSayac = 0;
            Console.WriteLine("Bir cumle giriniz: ");
            string cumle = Console.ReadLine();
            
            string[] kelimeler = cumle.Split(' ');
            foreach (string kelime in kelimeler)
            {
                kelimeSayac++;

            }
            Console.WriteLine("Kelime sayisi = " + kelimeSayac);
            foreach (char harf in cumle)
            {
                if(harf != ' ')
                harfSayac++;
               
            }
            Console.Write(harfSayac + " tane harf var");


        }
        static void ciftSayilar()
        {
            Console.WriteLine("---------------Soru 1---------------");
            Console.Write("Kac sayi gireceksiniz: ");
            int eKadar = int.Parse(Console.ReadLine());
            int[] array = new int[eKadar];
            int sayi;
            for (int i = 0; i < eKadar; i++)
            {
                Console.WriteLine(i + 1 + ". sayiyi giriniiz: ");
                sayi = int.Parse(Console.ReadLine());
                array[i] = sayi;

            }
            foreach (var cift in array)
            {
                if (cift % 2 == 0)
                {
                    Console.WriteLine(cift + " Cift sayidir!");
                }
                else
                {
                    Console.WriteLine(cift + " Tek sayidir!");
                }
            }

        }
        static void bolunurMu()
        {
            Console.WriteLine("Birinci sayi giriniz:");
            int birinciSayi = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("İkinci sayi giriniz:");
            int ikinciSayi = Convert.ToInt32(Console.ReadLine());
            int[] sayilar = new int[birinciSayi];
            for (int i = 0; i < sayilar.Length; i++)
            {
                Console.WriteLine(i + ". sayiyi gir: ");


            }
            foreach (var sayi in sayilar)
            {


            }

        }

    }
}