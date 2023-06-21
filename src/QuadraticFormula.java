import static java.lang.Math.sqrt;

public class QuadraticFormula {

    private double a;
    private double b;
    private double c;

    public QuadraticFormula(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateRoot1(){
        if(b*b-4*a*c<0 || a==0)
            return -1;
        return (-b+sqrt(b*b-4*a*c))/(2*a);
    }

    public double calculateRoot2(){
        if(b*b-4*a*c<0 || a==0)
            return -1;
        return (-b-sqrt(b*b-4*a*c))/(2*a);
    }

    public double getA() {

        return a;
    }

    public void setA(double a) {

        this.a = a;
    }

    public double getB() {

        return b;
    }

    public void setB(double b) {

        this.b = b;
    }

    public double getC() {

        return c;
    }

    public void setC(double c) {

        this.c = c;
    }

    @Override
    public String toString() {
        return "QuadraticFormula{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
