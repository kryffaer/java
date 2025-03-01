package sem_2.Task2_5;

// 2.5 Задача «Ресторан: Повар и Официант»
// В ресторане работает один повар и один официант.
// Повар готовит блюда и ставит их на поднос (максимум 3 блюда).
// Официант берет готовые блюда и подает их клиентам.
// Повар не может готовить больше 3 блюд (ждет wait()).
// Официант ждет, если поднос пуст (wait()).
// При каждой передаче блюда используется notify().

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Cook cook = new Cook(restaurant);
        Waiter waiter = new Waiter(restaurant);

        cook.start();
        waiter.start();
    }
}

