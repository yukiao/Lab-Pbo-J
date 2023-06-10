import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class No1{
    private static final int dataSources = 4;
    private static final int threadPools = 3;
    private static int successLoadData = 0;
    private static int failedLoadData = 0;
    private static boolean isFinish = false;

    public static void main(String[] args) {
        System.out.printf("Start Load %d data", dataSources);
        ExecutorService executor = Executors.newFixedThreadPool(threadPools);

        for(int i = 0; i <= threadPools; i++){
            executor.execute(new Runnable() {

                @Override
                public void run() {
                    int executionTime = TaskTimeHelper.getRandomNumber();
                    try {
                        Thread.sleep(1000*executionTime);
                        if(executionTime > 4){
                            System.out.println("Request Timeout");
                            failedLoadData++;
                        } else{
                            successLoadData++;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(successLoadData + failedLoadData == dataSources){
                        isFinish = true;
                    }
                }
                
            });
        }
        executor.shutdown();

        int loadingTime = 1;
        while (true){
            if(isFinish){
                System.out.println("Task Finish");
                System.out.println("Time Execution "+ (loadingTime-1));
                if(successLoadData == dataSources){
                    System.out.println("All data succesfully loaded");
                    break;
                } else{
                    System.out.println("Data Failed to load" + failedLoadData);
                    break;
                }

            } else{
                System.out.println("Loading..."+ "(" + loadingTime+"s" +")");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } 
                loadingTime++;
            }

        }
        
    }
}