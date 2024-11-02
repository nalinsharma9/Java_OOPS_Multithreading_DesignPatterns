package MultiThreading.ExecutorService;

import java.util.List;
import java.util.concurrent.*;

class CallableTask implements Callable<String> {
    private String name;
    public CallableTask(String name) {
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return "Hello " + name;
    }
}


public class MultipleCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(1);            //Only one thread will be created meaning approx 9 seconds time
        ExecutorService executorService = Executors.newFixedThreadPool(3);     //Three threads will be created meaning approx 3 seconds time
//        Callable<String> callableTask1 = () -> {
//            Thread.sleep(3000);
//            return "Hello CallableTask1";
//        };

        List<CallableTask> tasks = List.of(new CallableTask("Task1"), new CallableTask("Task2"), new CallableTask("Task3"));
        System.out.println("Main started");

        //InvokeAll will start the execution of all the callable tasks. It acts as a blocker and will wait until all the tasks are completed
        List<Future<String>> invokeAll =  executorService.invokeAll(tasks);

        for(Future<String> future: invokeAll) {
            System.out.println(future.get());
        }

        System.out.println("Main Completed");
        executorService.shutdown();
    }
}
