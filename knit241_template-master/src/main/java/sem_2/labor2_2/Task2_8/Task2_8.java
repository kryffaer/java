package sem_2.labor2_2.Task2_8;

import sem_2.TaskDescription;

@TaskDescription(name = "2.8 Задача «Перекресток: светофор и машины»", description =
        "На перекрестке светофор управляет движением:\n" +
                "Красный свет – машины стоят (wait()).\n" +
                "Зеленый свет – машины едут (notifyAll()).\n" +
                "Светофор переключается каждые 5 секунд.\n" +
                "Поток Светофор изменяет цвет и отправляет notifyAll().\n" +
                "Потоки Машина ждут wait(), если красный свет.")

public class Task2_8 {
    public void execute() {
        TrafficLight trafficLight = new TrafficLight();

        Thread trafficLightThread = new Thread(new TrafficLightThread(trafficLight));
        trafficLightThread.start();

        for (int i = 0; i < 3; i++) {
            Thread carThread = new Thread(new Car(trafficLight, "Машина " + (i + 1)));
            carThread.start();
        }
    }
}

