package work2;
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden bir yıl değerine göre yılın artık yıl olup olmadığını
	test eden isLeapYear isimli metodu yazınız ve test ediniz
----------------------------------------------------------------------------------------------------------------------*/

//400'ün katı olan yıllar artık yıllardır.
//Bunun dışında 4'ün katı olan yıllar içerisinde yalnız 100'ün katı olmayan yıllar artık yıllardır.


public class LeapYear {
    static void isLeapYear(int yil) {

/*
1.yöntem
        if (yil % 400 == 0)
            if (yil % 4 == 0)
                if (yil % 100 == 0)
                    System.out.println("artık yıl");
                else
                    System.out.println("artık yıl değildir");
            else
                System.out.println("artık yıl değil");
        else
        System.out.println("artık yıl değil");
*/
// 2. yöntem
        if(yil%4==0 && yil%100!=0 || yil%400==0)

                System.out.println("artık yıldır");

        else
            System.out.println("artık yıl değildir.");

    }

    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("sayi:");
        int yil = Integer.parseInt(kb.nextLine());
        LeapYear.isLeapYear(yil);
    }
}