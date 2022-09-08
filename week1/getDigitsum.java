package firstweek.statement;
/*
Odev1
        Sınıf Çalışması: Parametresi ile aldığı int türden 3 basamaklı bir sayının basamakları toplamını döngü
        kullanmadan döndüren getDigitsSum metodunu yazınız. Metot sayının basamak sayısı kontrolünü yapmayacaktır
*/

import java.util.Scanner;

public class getDigitsum{



    public static void main(String[] args) {
        int total = 0;


        Scanner s = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(s.nextLine());
        int temp = val; //gerçek sayımı bir değişkende tutuyorum.

        total = val / 100;



        val = val / 10;
        val = val % 10;


        temp = temp % 10;

        total += temp;
        total+=val;
        System.out.println(total);

    }


}
