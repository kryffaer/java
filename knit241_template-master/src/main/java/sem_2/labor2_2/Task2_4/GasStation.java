package sem_2.labor2_2.Task2_4;

class GasStation {
    private int availablePumps = 2; // Количество доступных колонок

    public synchronized void acquirePump() throws InterruptedException {
        while (availablePumps == 0) {
            System.out.println("Все колонки заняты, ждём");
            wait();
        }
        availablePumps--;
        System.out.println("Заняли колонку, заправляемся");
    }

    public synchronized void releasePump() {
        availablePumps++;
        System.out.println("Освободили колонку");
        notify();
    }
}
