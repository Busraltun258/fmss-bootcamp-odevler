package firstweek.statement;
//Odev2
//Sınıf Çalışması: Katsayıları klavyeden girilen ikinci dereceden bir denklemin köklerini bulup ekrana
//basan programı yazınız
// a b ve c ax^2+bx+c

import java.util.Map;
import java.util.Scanner;

public class getEquation {
    public static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        System.out.print("1.kat sayıyı giriniz:");
        int a = Integer.parseInt(s.nextLine());

        Scanner s1 = new Scanner(System.in);
        System.out.print("2.kat sayıyı giriniz:");
        int b = Integer.parseInt(s.nextLine());

        Scanner s2 = new Scanner(System.in);
        System.out.print("3.kat sayıyı giriniz:");
        int c= Integer.parseInt(s.nextLine());

        double kok1;
        double kok2;
        int hesap=b*b; //b kare
        hesap=hesap-(4*a*c);
        System.out.println(hesap);

        if(hesap<0){
            System.out.println("denklemin kökleri yoktur");

        }
        else if(hesap==0){
             kok2=kok1=-b/2*a;
            System.out.println("Denklem koku:" + kok1);
        }
        else{
            kok1=(-b+ Math.sqrt(hesap))/2*a;
            kok2=(-b- Math.sqrt(hesap))/2*a;
            System.out.println("1.kök" + kok1);
            System.out.println("2.kök" + kok2);

        }
    }

}