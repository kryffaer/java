package sem_2.labor2_2.Task2_8;

class TrafficLightThread implements Runnable {
    private final TrafficLight trafficLight;

    public TrafficLightThread(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void run() {
        try {
            while (true) {
                trafficLight.changeColor();
                System.out.println("Светофор переключился на " + (trafficLight.isGreenLight() ? "зеленый" : "красный") + " свет.");
                Thread.sleep(5000); // Ждем 5 секунд
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

