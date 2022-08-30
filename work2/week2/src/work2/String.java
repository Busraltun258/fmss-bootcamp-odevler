package work2;

public class String {
    //ODEV 12
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden quit girilene kadar alınan yazıların arasında - karakteri olacak şekilde
	birleştirilmiş bir String oluşturan programı yazınız.
	Örnek:
	ankara, istanbul, izmir girilirse
	ankara-istanbul-izmir
----------------------------------------------------------------------------------------------------------------------*/
    public static void main(String[] args)
        {
            java.lang.String str1 = "PHP Exercises and ";
            java.lang.String str2 = "Python Exercises";

            System.out.println("String 1: " + str1);
            System.out.println("String 2: " + str2);


            // Concatenate the two strings together.
            java.lang.String str3 = str1.concat(str2);

            // Display the new String.
            System.out.println("The concatenated string: " + str3);
        }
    }


