package sem_2.labor2_1.Task2_1;

public class JuniorManager extends Approver {
    @Override
    protected boolean canApprove(Problem amount) {
        return amount.getIndex() < 100;
    }

    @Override
    protected void approve(Problem amount) {
        System.out.println("Младший менеджер готов ответить на ваш вопрос: " + amount.getText());
    }
}
