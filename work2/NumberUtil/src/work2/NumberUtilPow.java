package work2;

//ODEV 3
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden a ve b değerleri için a'nın b-inci kuvvetini döndüren
	pow isimli metodu yazınız.
	Açıklamalar:
	- Math sınıfının pow metodu kullanılmayacaktır
	- Metot b nin negatif değerleri için 1 değerini döndürecektir
	- Metot NumberUtil sınıfı içerisinde yazılacaktır
----------------------------------------------------------------------------------------------------------------------*/


public class NumberUtilPow {

    static int pow(int t, int k) {
        int sonuc = 1;
        while (k != 0) {
            if (k < 0) {
                return 1;
            }
            sonuc = sonuc * t;
            k--;

        }
        return sonuc;
    }

    public static void main(String args[]) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("sayi:");
        int taban = Integer.parseInt(kb.nextLine());

        System.out.println("sayi2:");
        int kuvvet = Integer.parseInt(kb.nextLine());
        System.out.println(NumberUtilPow.pow(taban, kuvvet));
    }
}
