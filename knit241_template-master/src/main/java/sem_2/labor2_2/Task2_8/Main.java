package sem_2.labor2_2.Task2_8;

// 2.8 Задача «Перекресток: светофор и машины»
// На перекрестке светофор управляет движением:
// Красный свет – машины стоят (wait()).
// Зеленый свет – машины едут (notifyAll()).
// Светофор переключается каждые 5 секунд.
// Поток "Светофор" изменяет цвет и отправляет notifyAll().
// Потоки "Машина" ждут wait(), если красный свет.

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        Thread trafficLightThread = new Thread(new TrafficLightThread(trafficLight));
        trafficLightThread.start();

        for (int i = 0; i < 3; i++) {
            Thread carThread = new Thread(new Car(trafficLight, "Машина " + (i + 1)));
            carThread.start();
        }
    }
}


