public class Zadanie6 {

    public static void main(String[] args) {

        int p1 = 3*4;
        int p2 = 3*4;
        int p3 = 2*3;
        int p4 = 2*2;
        int ludzie = 4;
        double calkowita = p1+p2+p3+p4;
        double dostepnosc = calkowita/ludzie;

        System.out.println("Powierzchnia pomieszczenia 1 wynosi: "+p1+"m^2");
        System.out.println("Powierzchnia pomieszczenia 2 wynosi: "+p2+"m^2");
        System.out.println("Powierzchnia pomieszczenia 3 wynosi: "+p3+"m^2");
        System.out.println("Powierzchnia pomieszczenia 4 wynosi: "+p4+"m^2");
        System.out.println("Powierzchnia całkowita wynosi: "+calkowita+"m^2");
        System.out.println("Na jedna osobe przypada "+dostepnosc+"m^2");
    }

}
