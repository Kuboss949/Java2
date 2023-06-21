import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Trigonometry {
    private double s;
    private double t;

    public Trigonometry(double s, double t) {
        this.s = s;
        this.t = t;
    }

    public double calculateSinSum(){
        return sin(s)*cos(t)+sin(t)*cos(s);
    }

    public double calculateCosSum(){
        return cos(s)*cos(t)-sin(t)*sin(s);
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Trigonometry{" +
                "s=" + s +
                ", t=" + t +
                '}';
    }
}
