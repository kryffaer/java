package sem_2.labor2_3.Task2_10;

public class Main {
    public static void main(String[] args) {
        int numRunners = 5;
        if (args.length > 0) {
            numRunners = Integer.parseInt(args[0]);
        }
        Task2_10 task2_10 = new Task2_10();
        task2_10.execute(numRunners);
    }
}

