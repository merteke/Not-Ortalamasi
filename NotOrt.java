import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


public class NotOrt {
    public static void main(String[] args){

        //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        //degiskenleri girelim

        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner fonksiyonu tanimlayalim

        Scanner not = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz:");
        mat=not.nextInt();

        System.out.println("Fizik notunu giriniz:");
        fizik=not.nextInt();

        System.out.println("Kimya notunu giriniz:");
        kimya=not.nextInt();

        System.out.println("Turkce notunu giriniz:");
        turkce=not.nextInt();

        System.out.println("Tarih notunu giriniz:");
        tarih=not.nextInt();

        System.out.println("Muzik notunu giriniz:");
        muzik=not.nextInt();
        

        double ortalama;
        ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("Butun derslerin notlarinin ortalamasi="+ortalama);


        if (ortalama>=60){
            System.out.println("Ogrenci Sinifi Gecti, Tebrikler!");
        

        }
        else{
            System.out.println("Ogrenci Sinifta kaldi, Seneye gorusuruz ;)");
        }
        



    }

}
