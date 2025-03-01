package sem_2.Task2_3;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Характеристики бизнес-автомобиля: ");
            System.out.println(TransportFactory.createTransport("business").getSpecifications());

            System.out.println("\nХарактеристики семейного минивэна: ");
            System.out.println(TransportFactory.createTransport("family").getSpecifications());

            System.out.println("\nХарактеристики мотоцикла: ");
            System.out.println(TransportFactory.createTransport("delivery").getSpecifications());
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
