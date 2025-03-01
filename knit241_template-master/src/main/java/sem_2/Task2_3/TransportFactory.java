package sem_2.Task2_3;

public class TransportFactory {
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
