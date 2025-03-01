package sem_2.Task2_1;

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
