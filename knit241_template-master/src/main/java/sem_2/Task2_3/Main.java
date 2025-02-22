package sem_2.Task2_3;

// Создайте интерфейс Transport с методом getSpecifications(), который возвращает характеристики транспортного средства.
interface Transport {
    String getSpecifications();
}

// Создайте классы BusinessCar, FamilyVan и Motorbike, реализующие Transport.
class BusinessCar implements Transport {
    @Override
    public String getSpecifications() {
        return "Комфортный салон, кожаные сиденья";
    }
}

class FamilyVan implements Transport {
    @Override
    public String getSpecifications() {
        return "Поддерживает перевозку 6+ пассажиров";
    }
}

class Motorbike implements Transport {
    @Override
    public String getSpecifications() {
        return "Предназначен для быстрой доставки";
    }
}

// Создайте класс TransportFactory с методом createTransport(), который:
// принимает параметр типа поездки и возвращает соответствующий объект.
// Добавьте обработку исключений, если передан неизвестный тип транспорта.
class TransportFactory {
    public static Transport createTransport(String tripType) throws IllegalArgumentException {
        switch (tripType) {
            case "business":
                return new BusinessCar();
            case "family":
                return new FamilyVan();
            case "delivery":
                return new Motorbike();
            default:
                throw new IllegalArgumentException("Неизвестный тип транспорта");
        }
    }
}

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
