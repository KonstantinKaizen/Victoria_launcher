import javax.swing.text.Document;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class CheckDateModification {




    public static void checkDateModification(){

        File file = new File("Victoria 2");
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);









    }
}
