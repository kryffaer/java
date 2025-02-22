package sem_1.Task15;

enum Season {
    WINTER("Холодно", "Зима", "Новый год"),
    SPRING("Тепло", "Весна", "Пасха"),
    SUMMER("Жарко", "Лето", "День Независимости"),
    AUTUMN("Прохладно", "Осень","Хэллоуин");

    private final String temperature;
    private final String season;
    private final String holiday;

    Season(String temperature, String season, String holiday) {
        this.temperature = temperature;
        this.season = season;
        this.holiday = holiday;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getSeason() {
        return season;
    }

    public String getHoliday() {
        return holiday;
    }
}