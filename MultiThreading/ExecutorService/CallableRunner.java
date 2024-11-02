package MultiThreading.ExecutorService;

import java.util.concurrent.*;

//class CallableTask implements Callable<String> {
//    @Override
//    public String call() throws Exception {
//        Thread.sleep(1000);
//        return "Hello Callable1";
//    }
//}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //use Lamda to create pass the definition of callable task
        Callable<String> callableTask1 = () -> {
            Thread.sleep(3000);
            return "Hello CallableTask1";
        };
        System.out.println("Main started");

        //This will start the execution of callable task
        Future<String> promise1 = executorService.submit(callableTask1);
        System.out.println("CallableTask1 started execution");

        //This will block the main thread until the promise1 is resolved because we have used Future.get() method
        String message = promise1.get();

        System.out.println("Promise1 resolved");
        System.out.println(message);

        System.out.println("Main Completed");
        executorService.shutdown();
    }
}
