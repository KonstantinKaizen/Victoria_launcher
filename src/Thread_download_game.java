import java.io.IOException;

public class Thread_download_game extends Thread{

    public static boolean is_loading = false;



    @Override
    public void run() {

        is_loading = true;
        System.out.println("is loading");




        try {
            Utility.download(Main.dlc_link,"dlc.zip");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            is_loading = false;
            System.out.println("finished");
        }

        is_loading = false;
        System.out.println("finished");


    }
}
