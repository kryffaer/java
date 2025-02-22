package sem_1.Task18;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        // Получение значений
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        // Изменение значений
        pair.setFirst("New Age");
        System.out.println(pair.getFirst());
        pair.setSecond(35);
        System.out.println(pair.getSecond());
    }
}

