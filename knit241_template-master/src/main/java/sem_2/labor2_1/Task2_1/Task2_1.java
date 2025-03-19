package sem_2.labor2_1.Task2_1;

import sem_2.TaskDescription;

@TaskDescription(name = "Задача 2.1 Chain of Responsibility (Цепочка обязанностей)", description =
        "Реализуйте систему обработки жалоб клиентов в банке:\n" +
        "1. Жалоба сначала поступает в колл-центр.\n" +
        "2. Если проблема сложная, запрос передается менеджеру.\n" +
        "3. Если даже менеджер не может решить проблему, запрос уходит в юридический отдел.\n" +
        "4. Каждый уровень обработки либо решает проблему, либо передает ее дальше. (не менее 4х уровней поддержки)\n" +
        "5. Представить проблему в виде объекта, с описанием, уровнем сложности.")

public class Task2_1 {
    public void execute() {
        Approver junior = new JuniorManager();
        Approver senior = new SeniorManager();
        Approver legalDepartment = new LegalDepartment();
        Approver director = new Director();

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
