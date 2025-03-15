package sem_2.labor2_2.Task2_8;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TrafficLight {
    private boolean isGreen;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public TrafficLight() {
        this.isGreen = true;
    }

    public void changeColor() {
        lock.lock();
        try {
            isGreen = !isGreen;
            if (isGreen) {
                condition.signalAll(); // Если зеленый, сигнализируем всем машинам
            }
        } finally {
            lock.unlock();
        }
    }

    public void waitForGreen() throws InterruptedException {
        lock.lock();
        try {
            while (!isGreen) {
                condition.await(); // Ждем, пока свет не станет зеленым
            }
        } finally {
            lock.unlock();
        }
    }

    public boolean isGreenLight() {
        return isGreen;
    }
}
