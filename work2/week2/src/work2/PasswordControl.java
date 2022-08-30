package work2;
//ODEV 10
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden bir kullanıcı adı ve şifre isteyen basit ATM uygulamasının bir parçasını aşağıdaki
	açıklamalara göre yazınız:
	Açıklamalar:
	- Kullanıcı adı ve şifre 3 kez denenebilecektir
	- 3 kez deneme sırasında doğru giriş yapılırsa "Giriş Başarılı", 3 kez deneme de yanlış olursa
	"Giriş Başarısız. Deneme hakkınız bitti" mesajı verilecektir.
	- Kullanıcı adı ve şifrenin doğruluğu program içerisinde belirlenen bir kullanıcı adı ve şifre ile yapılacacktır
----------------------------------------------------------------------------------------------------------------------*/


import java.util.*;

public class PasswordControl {



    public static void main(String[] args) {


        String myName="BUSRANUR";
        String password="1234";
        int sayac=0;

            Scanner s1 = new Scanner(System.in);

            System.out.println("kullanıcı adınızı girin ");
            String kad = s1.next();

            Scanner s2 = new Scanner(System.in);
            System.out.println("ŞİFRENİZİ GİRİN: ");
            String pas = s2.next();

            if (kad.equals(myName) && pas.equals(password)) {
                System.out.println("Giriş başarılı");
            } else{
                //GİRİŞ BAŞARISIZ İSE 3 HAK

                    for (int i = 0; i < 3; i++) {

                           sayac++;

                            if (sayac==3){
                                System.out.println("deneme hakkınız bitti");
                            }
                            else{

                                Scanner s12 = new Scanner(System.in);

                                System.out.println("kullanıcı adınızı girin ");
                                String kad1 = s1.nextLine();

                                Scanner s22= new Scanner(System.in);
                                System.out.println("ŞİFRENİZİ GİRİN: ");
                                String pas1 = s2.next();

                            }
                    }
        }

    }
}


