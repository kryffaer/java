package sem_2.labor2_2.Task2_6;

import sem_2.TaskDescription;

@TaskDescription(name = "2.6 Задача «Железнодорожный переезд»", description =
        "Есть автомобили и поезд.\n" +
                "Если поезд приближается, машины останавливаются и ждут.\n" +
                "После того, как поезд проедет, машины продолжают движение.\n" +
                "Поток \"Поезд\" останавливает автомобили (wait()).\n" +
                "Поток \"Поезд\" сообщает о завершении (notifyAll()).\n" +
                "Машины ждут, если поезд едет, и продолжают движение после notifyAll().")

public class Task2_6 {
    public void execute() {
        RailwayCrossing railwayCrossing = new RailwayCrossing();
        Train train = new Train(railwayCrossing);

        for (int i = 0; i < 3; i++) {
            Car car = new Car(railwayCrossing, "Машина " + (i + 1));
            car.start();
        }
        train.start();
    }
}

