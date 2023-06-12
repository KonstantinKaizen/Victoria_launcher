public class Thread_close_game extends Thread{



    public  void run(){

        try {
            sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.exit(0);



    }
}


