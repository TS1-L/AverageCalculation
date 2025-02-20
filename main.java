import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, tarih;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        float ortalama = (float) (matematik + fizik + turkce + kimya + muzik + tarih) /6;

        System.out.println("The average is: " + ortalama);

        if (ortalama >= 60) {
            System.out.println("Passed The Class");
        }
        else {
            System.out.println("Failed");
        }

    }
}
