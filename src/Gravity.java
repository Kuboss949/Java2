public class Gravity {
    private double m1;
    private double m2;
    private final double G = 6.67e-11;

    public Gravity(double m1, double m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public double calculateForce(double distance){
        return G*m1*m2/(distance*distance);
    }

    public double getM1() {
        return m1;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getG() {
        return G;
    }

    @Override
    public String toString() {
        return "Gravity{" +
                "m1=" + m1 +
                ", m2=" + m2 +
                ", G=" + G +
                '}';
    }
}
