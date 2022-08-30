package work2;
//ODEV 1
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren getDigitsCount isimli
	metodu NumberUtil isimli bir sınıfın içerisinde yazınız ve klavyeden alınan değerlerle çağırarak test ediniz

	123 -> 12 -> 1 -> 0
----------------------------------------------------------------------------------------------------------------------*/

public class NumberUtil {
    static int getDigitsCount(int sayi) {
        int sayac = 0;

        while (sayi != 0) {

            sayi = sayi / 10;
            sayac++;
        }
        return sayac;
    }

    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("sayi:");
        int sayi = Integer.parseInt(kb.nextLine());
        System.out.println(getDigitsCount(sayi));
    }
}
