package sem_2.labor2_2.Task2_9;

// 2.9 Задача «Конвейер сборки деталей»
// На заводе работают три типа рабочих, каждый из которых выполняет свою часть работы в конвейерном режиме:
// Штамповщик – вырезает заготовку (создает объект детали).
// Сборщик – собирает из заготовки готовую деталь.
// Оператор контроля качества – проверяет деталь и отправляет на склад.
// Каждый рабочий – отдельный поток, и они должны работать последовательно, используя общую очередь для передачи деталей.
// Требования к решению:
// Использовать потоки (Thread или ExecutorService).
// Использовать синхронизацию (wait(), notify(), BlockingQueue).
// Реализовать конвейерную передачу данных между потоками.

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
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
