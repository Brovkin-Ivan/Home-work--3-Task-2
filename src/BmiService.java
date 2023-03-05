public class BmiService {
    public int calculate(double kilograms, double meters) {
        double calculate = (kilograms / Math.pow(meters, 2));
        return (int) calculate;
    }
}
