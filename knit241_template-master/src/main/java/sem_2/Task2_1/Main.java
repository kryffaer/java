package sem_2.Task2_1;

// Класс обработчика
abstract class Approver {
    protected Approver nextApprover; // Следующий обработчик в цепочке

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    // Обработка запроса
    public void processRequest(Problem amount) {
        if (canApprove(amount)) {
            approve(amount);
        } else if (nextApprover != null) {
            nextApprover.processRequest(amount); // Передача запроса дальше
        } else {
            System.out.println("Вопроc '" + amount.getText() + "' отклонен: слишком сложно.");
        }
    }

    protected abstract boolean canApprove(Problem amount); // Проверка лимита
    protected abstract void approve(Problem amount); // Логика одобрения
}

class JuniorManager extends Approver {
    @Override
    protected boolean canApprove(Problem amount) {
        return amount.getIndex() < 100;
    }

    @Override
    protected void approve(Problem amount) {
        System.out.println("Младший менеджер готов ответить на ваш вопрос: " + amount.getText());
    }
}

class SeniorManager extends Approver {
    @Override
    protected boolean canApprove(Problem amount) {
        return amount.getIndex() < 500;
    }

    @Override
    protected void approve(Problem amount) {
        System.out.println("Старший менеджер готов ответить на ваш вопрос: " + amount.getText());
    }
}

class LegalDepartment extends Approver {
    @Override
    protected boolean canApprove(Problem amount) {
        return amount.getIndex() < 1000;
    }

    @Override
    protected void approve(Problem amount) {
        System.out.println("Юридический отдел готов ответить на ваш вопрос: " + amount.getText());
    }
}

class Director extends Approver {
    @Override
    protected boolean canApprove(Problem amount) {
        return amount.getIndex() < 2000;
    }

    @Override
    protected void approve(Problem amount) {
        System.out.println("Директор готов ответить на ваш вопрос: " + amount.getText());
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем обработчиков
        Approver junior = new JuniorManager();
        Approver senior = new SeniorManager();
        Approver legalDepartment = new LegalDepartment();
        Approver director = new Director();

        // Устанавливаем цепочку: junior -> senior -> legalDepartment -> director
        junior.setNextApprover(senior);
        senior.setNextApprover(legalDepartment);
        legalDepartment.setNextApprover(director);

        Problem problem0 = new Problem("В какое время работает банк?", 33);
        Problem problem1 = new Problem("Предоставляются ли кредитные карты?", 358);
        Problem problem2 = new Problem("Где оставить отзыв о работе банка?", 940);
        Problem problem3 = new Problem("Не могу войти в личный кабинет на сайте.", 1502);
        Problem problem4 = new Problem("Почему моя плейстейшн не летает?", 2000);

        junior.processRequest(problem0);
        junior.processRequest(problem1);
        junior.processRequest(problem2);
        junior.processRequest(problem3);
        junior.processRequest(problem4);
    }
}
