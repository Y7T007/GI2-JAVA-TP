package yassir.wahid.exercice3;

public class RatioTest {

    public static void main(String[] args) {

        Ratio r1 = new Ratio();
        Ratio r2 = new Ratio();
        Ratio r3 = new Ratio();

        r1.setNumera(2);
        r1.setDenomi(3);

        r2.setNumera(4);
        r2.setDenomi(5);

        Ratio prod = r1.produit(r2);
        System.out.println("Product of r1 and r2: " + prod.toString());

        Ratio sum = r1.addition(r2);
        System.out.println("Sum of r1 and r2: " + sum.toString());

        boolean isEqual = r1.egale(r2);
        System.out.println("Are r1 and r2 equal? " + isEqual);

        boolean isGreater = r1.plusGrand(r2);
        System.out.println("Is r1 greater than r2? " + isGreater);

        System.out.println("r1: " + r1.toString());
        System.out.println("r2: " + r2.toString());
        System.out.println("r3: " + r3.toString());

    }
}