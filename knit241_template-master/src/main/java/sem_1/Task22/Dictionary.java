package sem_1.Task22;

import java.util.ArrayList;
import java.util.List;

// Создайте класс Dictionary<K, V>, который будет работать как словарь (ключ-значение).
public class Dictionary<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final List<Entry<K, V>> entries;

    public Dictionary() {
        entries = new ArrayList<>();
    }

    // Метод для добавления элемента
    public void put(K key, V value) {
        for (Entry<K, V> entry : entries) {
            if (entry.key.equals(key)) {
                entry.value = value; // Обновляем значение (ключ существует)
                return;
            }
        }
        entries.add(new Entry<>(key, value)); // Добавляем новую пару (ключ существует)
    }

    // Метод для удаления элемента
    public void remove(K key) {
        entries.removeIf(entry -> entry.key.equals(key));
    }

    // Метод для получения элемента
    public V get(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.key.equals(key)) {
                return entry.value; // Возвращаем значение (ключ найден)
            }
        }
        return null; // null (ключ не найден)
    }
}