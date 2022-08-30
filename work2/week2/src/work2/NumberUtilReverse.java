package work2;
//ODEV 2
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren getReverse isimli metodu
	yazınız ve test ediniz. Örneğin -123 sayısı için metot -321 sayısını döndürecektir
	123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
----------------------------------------------------------------------------------------------------------------------*/

public class NumberUtilReverse {
    static int getReverse(int sayi) {
        int sonuc = 0;
        for (; sayi != 0; sayi /= 10) {
            int say = sayi % 10;
            sonuc = sonuc * 10 + say;


        }
        return sonuc;
    }


    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("sayi:");
        int sayi = Integer.parseInt(kb.nextLine());
        System.out.println(getReverse(sayi));
    }

}

