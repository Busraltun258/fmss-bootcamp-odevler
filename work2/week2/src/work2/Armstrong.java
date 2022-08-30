package work2;
//ODEV 4
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının Armstrong sayısı olup olmadığını test eden
	isArmstrong metodunu yazınız ve test ediniz.
	Açıklamalar:
	- Bir sayının her basamağının basamak sayıncı kuvvetleri toplamı sayının kendisine eşitse bu sayıya Armstrong
	sayısı denir
	153 -> 1 + 125 + 27 = 153
	- Sayı negatif ise false döndürebilirsiniz
----------------------------------------------------------------------------------------------------------------------*/

public class Armstrong {
    static void isArmastrong(int s) {
        int basnumber = 0;
        int tempnumber = s;                                                   //ana sayımız kaybolmasın diye tempnumber da tuttuk.

        int basvalue = 0;                                                     //basamak sayılarını ayırmak için tanımladık
        int result = 0;                                                       //sayının toplamını tutacak
        int baspow = 1;                                                       //sayının basamak değerince üstünü alır.
        while (tempnumber != 0) {                                             // sayının kaç basamaklı olduğu bulunuyor.
            tempnumber /= 10;
            basnumber++;

        }
        tempnumber = s;                                                        // tempnumberı tekrar kullanmak için orjnal sayımızı tekrar atadık
        while (tempnumber != 0) {

            basvalue = tempnumber % 10;                                       // ö:153 için 3 olur.
            for (int i = 1; i <= basnumber; i++) {                            // basamak sayısına kadar i çalışır
                baspow *= basvalue;                                           // baspow degişkenimiz le basvalue çarpılarak sayının kaçıncı kuvveti alınacağı bulunur.
            }
            result += baspow;                                                 // 153 için şu an 3
            baspow = 1;
            tempnumber /= 10;

        }
        if (result == s) {
            System.out.println(s + "sayısı amstogdur");
        } else {
            System.out.println(s + "sayısı amstog değil");
        }


    }

    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("sayi:");
        int sayi = Integer.parseInt(kb.nextLine());
        Armstrong.isArmastrong(sayi);


    }

}
