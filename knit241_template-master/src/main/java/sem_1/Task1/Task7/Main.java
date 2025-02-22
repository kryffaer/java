package sem_1.Task1.Task7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("org/knit/Task7/dictionary.txt"));
            List<String> wordList = new ArrayList<>();

            // Чтение слов из файла
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                wordList.add(word);
                }
            scanner.close();

            // Преобразование списка в массив
            String[] words = wordList.toArray(new String[0]);
            char[] alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();

            // DictionaryStatistic dictionaryStatistic = new DictionaryStatistic(words, alphabet);
            // dictionaryStatistic.Statistics();
            // dictionaryStatistic.printSymbolsStat();
            // System.out.println("Случайное слово: " + dictionaryStatistic.getRandomWord());

            // System.out.println(dictionaryStatistic.getWords("Библиотека"));
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}


