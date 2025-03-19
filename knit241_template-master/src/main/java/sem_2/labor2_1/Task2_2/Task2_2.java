package sem_2.labor2_1.Task2_2;

import sem_2.TaskDescription;

@TaskDescription(name = "Задача 2.2 Decorator (Декоратор)", description =
        "Реализуйте систему онлайн-заказов кофе.\n" +
                "1. У вас есть базовый класс Coffee, который имеет метод getCost() и getDescription().\n" +
                "2. Напишите декораторы для добавления различных ингредиентов (молоко, карамель, шоколад).\n" +
                "3. Каждый декоратор изменяет стоимость и описание кофе.\n" +
                "4. Расширьте решение, добавив калорийность и разные виды напитков")

public class Task2_2 {
    public void execute() {
        Coffee coffee = new Espresso();
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        coffee = new SizeDecorator(coffee, "medium");
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        coffee = new Caramel(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        coffee = new Chocolate(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");
    }
}