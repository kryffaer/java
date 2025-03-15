package sem_2.labor2_1.Task2_2;

public abstract class CoffeeDecorator implements Coffee {
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
