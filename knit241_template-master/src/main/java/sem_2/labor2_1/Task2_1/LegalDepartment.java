package sem_2.labor2_1.Task2_1;

public class LegalDepartment extends Approver {
    @Override
    protected boolean canApprove(Problem amount) {
        return amount.getIndex() < 1000;
    }

    @Override
    protected void approve(Problem amount) {
        System.out.println("Юридический отдел готов ответить на ваш вопрос: " + amount.getText());
    }
}
