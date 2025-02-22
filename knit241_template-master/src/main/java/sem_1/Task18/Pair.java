package sem_1.Task18;

// Создайте универсальный класс Pair, который будет хранить две связанные сущности
public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
    // Напишите методы для получения значений
    public F getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }

    // Напишите методы для изменения значений
    public void setFirst(F first) {
        this.first = first;
    }
    public void setSecond(S second) {
        this.second = second;
    }
}
