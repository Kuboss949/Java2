public class Main {
    public static void main(String[] args) {

        Investment i1 = new Investment(1000, 6.7);
        Investment i2 = new Investment(10000, 7.2);
        Investment i3 = new Investment(1000, 10.2);
        System.out.println("Zwrot: " + i1.calculateFV(10));
        System.out.println("Zwrot: " + i2.calculateFV(24));
        System.out.println("Zwrot: " + i3.calculateFV(36));
        System.out.println("---------------------------------------");
        Gravity g1 = new Gravity(5.98e24, 78);
        Gravity g2 = new Gravity(5.98e24, 13);
        System.out.println("Grawitacja dzialajaca na mnie: " + g1.calculateForce(6.371e6));
        System.out.println("Grawitacja dzialajaca na mojego psa: " + g2.calculateForce(6.371e6));
        System.out.println("---------------------------------------");
        Trigonometry t1 = new Trigonometry(90, 90);
        System.out.println("Cos sum: " + t1.calculateCosSum() + "\nSin sum:" + t1.calculateSinSum());
        System.out.println("---------------------------------------");
        QuadraticFormula q1 = new QuadraticFormula(1, -1, 0);
        System.out.println("x1 = " + q1.calculateRoot1() + "\nx2 = "+ q1.calculateRoot2());
    }
}