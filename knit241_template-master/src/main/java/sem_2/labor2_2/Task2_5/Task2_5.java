package sem_2.labor2_2.Task2_5;

import sem_2.TaskDescription;

@TaskDescription(name = "2.5 Задача «Ресторан: Повар и Официант»", description =
        "В ресторане работает один повар и один официант.\n" +
                "Повар готовит блюда и ставит их на поднос (максимум 3 блюда).\n" +
                "Официант берет готовые блюда и подает их клиентам.\n" +
                "Повар не может готовить больше 3 блюд (ждет wait()).\n" +
                "Официант ждет, если поднос пуст (wait()).\n" +
                "При каждой передаче блюда используется notify().")

public class Task2_5 {
    public void execute() {
        Restaurant restaurant = new Restaurant();
        Cook cook = new Cook(restaurant);
        Waiter waiter = new Waiter(restaurant);

        cook.start();
        waiter.start();
    }
}
