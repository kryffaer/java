package sem_1.Task16;

public class Main {
    public static void main(String[] args) {
        // Создание колоды
        Card[] deck = new Card[52];
        int index = 0;

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck[index++] = new Card(suit, rank);
            }
        }
        // Вывод колоды
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
