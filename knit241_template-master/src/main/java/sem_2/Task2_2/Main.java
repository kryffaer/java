package sem_2.Task2_2;

// Базовый интерфейс
interface Coffee {
    double getCost(); // Цена

    int getCalories(); // Калорийность

    String getDescription();  // Название
}

// Конкретная реализация (базовый объект)
class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 2.5; // Базовая цена
    }

    public int getCalories() {
        return 5; // Базовая калорийность
    }

    @Override
    public String getDescription() {
        return "Эспрессо";
    }
}

// Абстрактный класс-декоратор
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Оборачиваемый объект
    protected String size;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public int getCalories() {
        return coffee.getCalories();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}

class SizeDecorator extends CoffeeDecorator {
    public SizeDecorator(Coffee coffee, String size) {
        super(coffee);
        this.size = size;
    }

    @Override
    public double getCost() {
        switch (size) {
            case "small":
                return super.getCost() + 0.3;
            case "medium":
                return super.getCost() + 0.5;
            case "large":
                return super.getCost() + 0.7;
        }
        return super.getCost();
    }

    @Override
    public int getCalories() {
        switch (size) {
            case "small":
                return super.getCalories() + 10;
            case "medium":
                return super.getCalories() + 20;
            case "large":
                return super.getCalories() + 30;
        }
        return super.getCalories();
    }


    @Override
    public String getDescription() {
        switch (size) {
            case "small":
                return "SMALL " + coffee.getDescription();
            case "medium":
                return "MEDIUM " + coffee.getDescription();
            case "large":
                return "LARGE " + coffee.getDescription();
        }
        return coffee.getDescription();
    }
}

// Конкретные декораторы (добавки)
class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", молоко";
    }
}

class Caramel extends CoffeeDecorator {
    public Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 60;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", карамель";
    }
}

class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 80;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", шоколад";
    }
}

// Демонстрация использования
public class Main {
    public static void main(String[] args) {
        // Базовый кофе
        Coffee coffee = new Espresso();
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем размер (medium)
        coffee = new SizeDecorator(coffee, "medium");
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем молоко
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем карамель
        coffee = new Caramel(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем шоколад
        coffee = new Chocolate(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");
    }
}