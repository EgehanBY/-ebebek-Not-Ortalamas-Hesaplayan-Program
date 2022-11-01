import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int mat, fizik, kimya,turkce,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu girin : ");
        fizik=input.nextInt();

        System.out.print("Türkçe notunuzu girin :");
        turkce= input.nextInt();

        System.out.print("Kimya notunuzu girin : ");
        kimya   =   input.nextInt();

        System.out.print("Tarih notunuzu girin : ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu girin : ");
        muzik=input.nextInt();

double  ort;
ort= (mat+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("Not ortalamanız: " + ort);
        System.out.println(ort >= 60 ? "Geçti" : "Kaldı");
    }
}