package sem_2.labor2_1.Task2_1;

public class Director extends Approver {
    @Override
    protected boolean canApprove(Problem amount) {
        return amount.getIndex() < 2000;
    }

    @Override
    protected void approve(Problem amount) {
        System.out.println("Директор готов ответить на ваш вопрос: " + amount.getText());
    }
}
