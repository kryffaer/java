package sem_1.Task15;

public class Main {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.printf("%s: %s, %s, типичный праздник - %s%n",
                    season.name(), season.getTemperature(), season.getSeason(), season.getHoliday());
        }
    }
}
