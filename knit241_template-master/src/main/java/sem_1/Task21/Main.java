package sem_1.Task21;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> filtered = Task21.filter(words, s -> s.startsWith("b"));
        System.out.println(filtered);
    }
}