package org.knit.Task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DictionaryStatistic {
    private String[] words;
    private int dictionarySize; // Количество слов
    private int polindrom; // Количество слов палиндромов
    private int maxWordLength; // Максимальная длина слова
    private int minWordLength; // Минимальная длина слова
    private char[] alphabet; // Буквы
    private int[] frequency; // Частота букв

    public DictionaryStatistic(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.frequency = new int[alphabet.length];
    }

    // Метод для подсчета статистики
    public void Statistics() {
        dictionarySize = words.length;
        minWordLength = Integer.MAX_VALUE;
        maxWordLength = 0;
        polindrom = 0;

        for (String word : words) {
            int wordLength = word.length();
            // Нахождение минимальной длины слова
            if (wordLength < minWordLength) {
                minWordLength = wordLength;
            }
            // Нахождение максимальной длины слова
            if (wordLength > maxWordLength) {
                maxWordLength = wordLength;
            }
            // Подсчёт палиндромов
            if (word.contentEquals(new StringBuilder(word).reverse())){
                polindrom++;
            }
            // Подсчёт частоты букв
            for (char c : word.toCharArray()) { // перебираем буквы слова
                int index = getIndex(c);
                if (index != -1) {
                    frequency[index]++;
                }
            }
        }
    }

    // Метод для получения индекса буквы в алфавите
    private int getIndex(char c) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == c) {
                return i;
            }
        }
        return -1;
    }

    // Метод для получения случайного слова из словаря
    public String getRandomWord() {
        Random random = new Random();
        // nextInt - чтение целых чисел с ввода
        int randomIndex = random.nextInt(dictionarySize);
        return words[randomIndex];
    }

    // Метод для печати статистики по символам
    public void printSymbolsStat() {
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + " - " + frequency[i]);
        }
        System.out.println("Количество слов: " + dictionarySize);
        System.out.println("Количество палиндромов: " + polindrom);
        System.out.println("Максимальная длина слова: " + maxWordLength);
        System.out.println("Минимальная длина слова: " + minWordLength);
    }

    // Игра в слова
    public List<String> getWords(String string) {
        List<String> res = new ArrayList<>();
        char[] cString = string.toCharArray(); // получение массива символов

        for (String word : words) {
            if (canFormWord(word, cString)) {
                res.add(word);
            }
        }
        return res;
    }

    private boolean canFormWord(String word, char[] cString) {
        char[] copy = cString.clone();
        for (char c : word.toCharArray()) {
            int index = findIndex(copy, c);
            if (index == -1) {
                return false;
            }
            copy[index] = 0;
        }
        return true;
    }

    private int findIndex(char[] arr, char c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
