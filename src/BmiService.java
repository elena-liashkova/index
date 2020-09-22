public class BmiService {
    public double calculate(double bodyMass, double height) {
        double index;
        index = bodyMass / square(height/100);
        return index;
    }

    private double square (double a) {
        return a * a;
    }
}


