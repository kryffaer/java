package sem_2.labor2_2.Task2_6;

// 2.6 Задача «Железнодорожный переезд»
// Есть автомобили и поезд.
// Если поезд приближается, машины останавливаются и ждут.
// После того, как поезд проедет, машины продолжают движение.
// Поток "Поезд" останавливает автомобили (wait()).
// Поток "Поезд" сообщает о завершении (notifyAll()).
// Машины ждут, если поезд едет, и продолжают движение после notifyAll().

public class Main {
    public static void main(String[] args) {
        RailwayCrossing railwayCrossing = new RailwayCrossing();
        Train train = new Train(railwayCrossing);

        for (int i = 0; i < 3; i++) {
            Car car = new Car(railwayCrossing, "Машина " + (i + 1));
            car.start();
        }

        train.start();
    }
}

