package sem_1.Task1.Task9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task9 {
    private static List<String> words;

    public static void main(String[] args) {
        // Загружаем слова из файла
        words = getWords("org/knit/Task7/dictionary.txt");
        playGame();
    }

    // Возвращает список слов из файла
    public static List<String> getWords(String path) {
        List<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                words.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
        return words;
    }

    private static void playGame() {
        Scanner Scanner = new Scanner(System.in);
        Random random = new Random();

        int totalWords = 0; // количество слов всего было
        int correctWords = 0; // количество правильных слов
        long totalChars = 0; // количество введенных символов, скорость символов в секунду

        long endTime = System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(1);
        System.out.println("Минута для ввода слов началась");

        while (System.currentTimeMillis() < endTime) {
            // получаем случайное слово
            String randomWord = words.get(random.nextInt(words.size()));
            totalWords++;
            System.out.println("Введите слово: " + randomWord);

            // пользовательский ввод
            String userInput = Scanner.nextLine();
            totalChars += userInput.length();

            if (userInput.equals(randomWord)) {
                correctWords++;
            }
        }

        // Итоги
        System.out.println("\nВремя вышло");
        System.out.println("Всего слов: " + totalWords);
        System.out.println("Правильных слов: " + correctWords);

        if (totalWords > 0) {
            double speed = (double) totalChars / (System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(1) - endTime) * 1000;
            System.out.printf("Скорость ввода: %.2f символов в секунду\n", speed);
        } else {
            System.out.println("Не было введено ни одного слова");
        }
        Scanner.close();
    }
}
