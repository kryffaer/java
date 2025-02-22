package sem_1.Task16;

enum Suit {
    SPADE("Пики"),
    HEART("Черви"),
    DIAMOND("Бубны"),
    CLUB("Трефы");

    private final String russianName;

    Suit(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}