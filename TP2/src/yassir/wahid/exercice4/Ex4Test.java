package yassir.wahid.exercice4;

public class Ex4Test {

    public static void main(String[] args) {

        // Test default constructor
        Ex4 ex1 = new Ex4();
        System.out.println("ex1: " + ex1.getHeures() + "h " + ex1.getMinutes() + "m " + ex1.getSeconds() + "s");

        // Test parameterized constructor
        Ex4 ex2 = new Ex4(2, 30, 45);
        System.out.println("ex2: " + ex2.getHeures() + "h " + ex2.getMinutes() + "m " + ex2.getSeconds() + "s");

        // Test float constructor
		Ex4 ex3 = new Ex4((float) 3.75);
        System.out.println("ex3: " + ex3.getHeures() + "h " + ex3.getMinutes() + "m " + ex3.getSeconds() + "s");

        // Test getters and setters
        Ex4 ex4 = new Ex4();
        ex4.setHeures(1);
        ex4.setMinutes(15);
        ex4.setSeconds(30);
        System.out.println("ex4: " + ex4.getHeures() + "h " + ex4.getMinutes() + "m " + ex4.getSeconds() + "s");

        // Test getDec method
        Ex4 ex5 = new Ex4(1, 30, 0);
        float dec = ex5.getDec();
        System.out.println("ex5 decimal value: " + dec);

    }
}