package sem_2.labor2_2.Task2_9;

import sem_2.TaskDescription;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@TaskDescription(name = "2.9 Задача «Конвейер сборки деталей»", description =
        "На заводе работают три типа рабочих, каждый из которых выполняет свою часть работы в конвейерном режиме:\n" +
                "Штамповщик – вырезает заготовку (создает объект детали).\n" +
                "Сборщик – собирает из заготовки готовую деталь.\n" +
                "Оператор контроля качества – проверяет деталь и отправляет на склад.\n" +
                "Каждый рабочий – отдельный поток, и они должны работать последовательно, используя общую очередь для передачи деталей.\n" +
                "Требования к решению:\n" +
                "Использовать потоки (Thread или ExecutorService).\n" +
                "Использовать синхронизацию (wait(), notify(), BlockingQueue).\n" +
                "Реализовать конвейерную передачу данных между потоками.")

public class Task2_9 {
    public void execute() {
        BlockingQueue<Detail> queueToAssembler = new LinkedBlockingQueue<>();
        BlockingQueue<Detail> queueToQualityControl = new LinkedBlockingQueue<>();

        StampingWorker stampingWorker = new StampingWorker(queueToAssembler);
        Assembler assembler = new Assembler(queueToAssembler, queueToQualityControl);
        QualityControlOperator qualityControlOperator = new QualityControlOperator(queueToQualityControl);

        stampingWorker.start();
        assembler.start();
        qualityControlOperator.start();
    }
}

