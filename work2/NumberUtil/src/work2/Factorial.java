package work2;

/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının faktoriyelini döndüren factorial isimli
    metodu yazınız ve test ediniz.
    Açıklamalar:
    - Metot negatif sayılar için -1 değerini döndürecektir
    - Faktoriyel tanımı:
        0!= 1
        1!=1
        2!=1*2
        ...
        n!=1 * 2 * ...* (n - 1) * n
    - Sınır taşması gözardı edilecektir
----------------------------------------------------------------------------------------------------------------------*/
public class Factorial {
    static void factorial(int sayi) {
        int sonuc = 1;
        if (sayi >= 0) {
            for (int i = 1; i <= sayi; i++) {
                sonuc = i * sonuc;
            }
            System.out.println(sayi + " sayısının faktöriyeli:" + sonuc);
        } else {
            System.out.println(-1);
        }

    }

    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("sayi:");
        int sayi = Integer.parseInt(kb.nextLine());
        Factorial.factorial(sayi);
    }


}
