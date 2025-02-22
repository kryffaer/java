package sem_1.Task22;

public class Main {
    public static void main(String[] args) {
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        // Добавляем
        dictionary.put("Alice", 25);
        dictionary.put("Bob", 30);
        // Выводим
        System.out.println("Alice: " + dictionary.get("Alice"));
        System.out.println("Bob: " + dictionary.get("Bob"));
        // Удаляем
        dictionary.remove("Alice");
        System.out.println("Алиса удалена: " + dictionary.get("Alice"));
    }
}
