package org.knit.Task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task10 {

    private static final int max_attempts = 6;
    private static final List<String> words = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        loadWords();
        String playAgain;
        do {
            startGame(scanner);
            System.out.println("Хотите сыграть еще раз? (да/нет)");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("да"));

        System.out.println("Спасибо за игру");
        scanner.close();
    }

    private static void loadWords() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("org/knit/Task7/dictionary.txt"));
        while (fileScanner.hasNextLine()) {
            String word = fileScanner.nextLine();
            words.add(word);
        }
        fileScanner.close();
    }

    private static void startGame(Scanner scanner) {
        String wordToGuess = selectRandomWord();
        List<Character> currentGuess = new ArrayList<>(Collections.nCopies(wordToGuess.length(), '_'));
        Set<Character> guessedLetters = new HashSet<>();
        int remainingAttempts = max_attempts;

        System.out.println("Загаданное слово: " + displayCurrentGuess(currentGuess));

        while (remainingAttempts > 0 && currentGuess.contains('_')) {
            System.out.print("Введите букву: ");
            char guessedLetter = scanner.nextLine().toLowerCase().charAt(0);

            if (guessedLetters.contains(guessedLetter)) {
                System.out.println("Вы уже вводили эту букву. Попробуйте снова");
                continue;
            }

            guessedLetters.add(guessedLetter);

            // замена пропуска на букву
            if (wordToGuess.indexOf(guessedLetter) >= 0) {
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guessedLetter) {
                        currentGuess.set(i, guessedLetter);
                    }
                }
                System.out.println("Загаданное слово: " + displayCurrentGuess(currentGuess));
            } else {
                remainingAttempts--;
                System.out.println("Неверно, осталось попыток: " + remainingAttempts);
            }
        }

        if (!currentGuess.contains('_')) {
            System.out.println("Вы угадали слово: " + wordToGuess);
        } else {
            System.out.println("Игра окончена, загаданное слово: " + wordToGuess);
        }
    }

    private static String selectRandomWord() {
        Random random = new Random();
        int index = random.nextInt(words.size());
        return words.get(index);
    }

    private static String displayCurrentGuess(List<Character> currentGuess) {
        StringBuilder displayString = new StringBuilder();
        for (Character c : currentGuess) {
            displayString.append(c).append(" ");
        }
        return displayString.toString();
    }
}
