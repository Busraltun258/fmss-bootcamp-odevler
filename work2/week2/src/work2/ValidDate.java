package work2;

//ODEV7
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin geçerli bir
	tarih olup olmadığını test eden isValidDate isimli metodu yazınız ve test ediniz
----------------------------------------------------------------------------------------------------------------------*/

public class ValidDate {
    static void isValidDte(int g,int a, int y){
        if(g<31 && g>0)
            if(a<12 && a>0)
               if (y<2022 && y>0)
                   System.out.println(g+"/"+a+"/"+y+"tarihi geçerlidir");
               else
                   System.out.println("geçersiz tarih");
             else
               System.out.println("geçersiz tarih");
       else
            System.out.println("geçersiz tarih");
    }
    public static void main(String[] args){
        java.util.Scanner kb=new java.util.Scanner(System.in);
        System.out.println("Bir gün giriniz::");
        int gün=Integer.parseInt(kb.nextLine());
        System.out.println("Sayı türünden bir ay giriniz::");
        int ay=Integer.parseInt(kb.nextLine());
        System.out.println("Bir yıl giriniz::");
        int yil=Integer.parseInt(kb.nextLine());


        isValidDte(gün,ay,yil);
    }
}
