import java.io.IOException;

public class Thread_download_game extends Thread{

    public static boolean is_loading = false;

    public static String link;
    public static String folder_name;


    public Thread_download_game(String link,String folder_name) {
        this.link = link;
        this.folder_name = folder_name;


    }

    @Override
    public void run() {

        is_loading = true;
        System.out.println("is loading");




        try {
            Utility.download(link,folder_name);
        } catch (IOException e) {
            System.out.println("error loading");
            throw new RuntimeException(e);
        } finally {
            System.out.println("finished - is loading false");
            is_loading = false;

        }





    }
}
