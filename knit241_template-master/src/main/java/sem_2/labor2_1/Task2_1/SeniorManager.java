package sem_2.labor2_1.Task2_1;

public class SeniorManager extends Approver {
    @Override
    protected boolean canApprove(Problem amount) {
        return amount.getIndex() < 500;
    }

    @Override
    protected void approve(Problem amount) {
        System.out.println("Старший менеджер готов ответить на ваш вопрос: " + amount.getText());
    }
}
