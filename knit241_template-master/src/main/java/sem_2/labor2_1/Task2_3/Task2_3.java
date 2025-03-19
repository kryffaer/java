package sem_2.labor2_1.Task2_3;

import sem_2.TaskDescription;

@TaskDescription(name = "2.3 Factory (Фабрика)", description =
        "Реализуйте фабрику по созданию различных видов транспортных средств в системе каршеринга.\n" +
                "1. Создайте интерфейс Transport с методом getSpecifications(), который возвращает характеристики транспортного средства.\n" +
                "2. Создайте классы BusinessCar, FamilyVan и Motorbike, реализующие Transport.\n" +
                "BusinessCar должен иметь комфортный салон и кожаные сиденья.\n" +
                "FamilyVan должен поддерживать перевозку 6+ пассажиров.\n" +
                "Motorbike предназначен для быстрой доставки.\n" +
                "3. Создайте класс TransportFactory, который:\n" +
                "Принимает параметр типа поездки (\"business\", \"family\", \"delivery\").\n" +
                "Возвращает соответствующий объект (BusinessCar, FamilyVan, Motorbike).\n" +
                "4. Добавьте обработку исключений, если передан неизвестный тип транспорта.\n" +
                "5. Вызов TransportFactory.createTransport(\"business\") должен возвращать объект BusinessCar.")

public class Task2_3 {
    public void execute() {
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
