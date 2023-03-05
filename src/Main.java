public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kilograms = 84;
        double meters = 1.85;
        int index = (int) service.calculate(kilograms, meters);
        System.out.println(index);
    }
}