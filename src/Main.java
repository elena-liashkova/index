public class Main {
    public static void main(String[] args) {
        double bodyMass = 87.5;
        double height = 178.5;
        BmiService service = new BmiService();

        double index = service.calculate(bodyMass, height);
        System.out.println(index);
    }
}