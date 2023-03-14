import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerimizi oluşturalım.
        int a, b;
        double c;
        //Kullanıcıdan verilerimizi alalım.
        Scanner girdi=new Scanner (System.in);
        System.out.print("1.Kenarı Giriniz:");
        a=girdi.nextInt();
        System.out.print("2.Kenarı Giriniz:");
        b=girdi.nextInt();
        System.out.print("3.Kenarı Giriniz:");
        c=girdi.nextDouble();

        double cevre = a+b+c;
        double alan= cevre/2*(cevre/2-a)*(cevre/2-b)*(cevre/2-c);
        alan=Math.sqrt(alan);

        System.out.println("Üçgenin Çevresi:"+cevre);
        System.out.println("Üçgenin Alanı:"+alan);



    }
}