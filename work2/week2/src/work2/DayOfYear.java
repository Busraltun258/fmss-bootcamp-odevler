package work2;
//ODEV8

/*----------------------------------------------------------------------------------------------------------------------
	Sınıf çalışması: Parametresi ile aldığı int türden gün, ay ve yıl bilgilerine ilişkin tarihin yılın kaçıncı
	günü olduğunu döndüren getDayOfYear isimli metodu yazınız ve test ediniz. Metot geçersiz bir tarih için
	-1 değerini döndürecektir
----------------------------------------------------------------------------------------------------------------------*/
// 30/08/2022
//
public class DayOfYear {


    static int DayOfYear(int g, int a, int y) {
        int i;
        int topLam = 0;

        for (i = 1; i < a; i++) {
            if (i <= 7) {
                if (i == 2) {
                    topLam = topLam + 28 + isValidDate(g,a,y);
                } else if (i % 2 == 0) {
                    topLam = topLam + 30;
                } else {
                    topLam = topLam + 31;
                }
            } else {
                if (i % 2 == 0) {
                    topLam = topLam + 31;
                } else {
                    topLam = topLam + 30;
                }
            }
        }
        topLam += g;
        System.out.println(topLam);
        return topLam;
    }

     static int isValidDate(int d, int m, int f) {
        if (f % 4 == 0 && f % 100 != 0 || f % 400 == 0)

            DayOfYear(d, m, f);
         else



         return d;
         return d;
     }




    public static void main(String[] args){
        java.util.Scanner kb=new java.util.Scanner(System.in);
        System.out.println("Bir gün giriniz::");
        int gün=Integer.parseInt(kb.nextLine());
        System.out.println("Sayı türünden bir ay giriniz::");
        int ay=Integer.parseInt(kb.nextLine());
        System.out.println("Bir yıl giriniz::");
        int yil=Integer.parseInt(kb.nextLine());


        isValidDate(gün,ay,yil);
    }
}

