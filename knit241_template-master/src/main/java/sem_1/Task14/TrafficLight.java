package sem_1.Task14;

enum TrafficLight {
    RED,
    YELLOW,
    GREEN;

    public TrafficLight getNextLight() {
        switch (this) {
            case RED:
                return GREEN;
            case YELLOW:
                return RED;
            case GREEN:
                return YELLOW;
            default:
                throw new IllegalArgumentException("Неизвестный сигнал светофора: " + this);
        }
    }
}
