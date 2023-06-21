import static java.lang.Math.pow;

public class Investment {
    private double initialValue;
    private double interestRate;        // in %

    public Investment(double initialValue, double interestRate) {
        this.initialValue = initialValue;
        this.interestRate = interestRate;
    }

    public double calculateFV(int monthCount){
        return initialValue*pow(1+interestRate/100, monthCount);
    }


    public double getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(double initialValue) {
        this.initialValue = initialValue;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public String toString() {
        return "Investment{" +
                "initialValue=" + initialValue +
                ", interestRate=" + interestRate +
                '}';
    }
}
