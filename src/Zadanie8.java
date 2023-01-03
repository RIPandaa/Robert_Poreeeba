import java.util.Scanner;
    public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj długość pokoju nr1: ");
        double d1 = klawiatura.nextDouble();
        System.out.println("Podaj szerokość pokoju nr1: ");
        double s1 = klawiatura.nextDouble();
        System.out.println("Podaj długość pokoju nr2: ");
        double d2 = klawiatura.nextDouble();
        System.out.println("Podaj szerokość pokoju nr2: ");
        double s2 = klawiatura.nextDouble();
        System.out.println("Podaj długość pokoju nr3: ");
        double d3 = klawiatura.nextDouble();
        System.out.println("Podaj szerokość pokoju nr3: ");
        double s3 = klawiatura.nextDouble();
        System.out.println("Podaj długość pokoju nr4: ");
        double d4 = klawiatura.nextDouble();
        System.out.println("Podaj szerokość pokoju nr4: ");
        double s4 = klawiatura.nextDouble();

        double p1 = d1 * s1;
        double p2 = d2 * s2;
        double p3 = d3 * s3;
        double p4 = d4 * s4;
        int ludzie = 4;
        double calkowita = p1+p2+p3+p4;
        double dostepnosc = calkowita/ludzie;

        System.out.println("Powierzchnia pomieszczenia nr1 wynosi: "+p1+"m^2");
        System.out.println("Powierzchnia pomieszczenia 2 wynosi: "+p2+"m^2");
        System.out.println("Powierzchnia pomieszczenia 3 wynosi: "+p3+"m^2");
        System.out.println("Powierzchnia pomieszczenia 4 wynosi: "+p4+"m^2");
        System.out.println("Powierzchnia całkowita wynosi: "+calkowita+"m^2");
        System.out.println("Na jedna osobe przypada "+dostepnosc+"m^2");}
}