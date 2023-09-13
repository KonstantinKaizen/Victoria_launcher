import javax.swing.*;
import java.io.*;

public class TextFileModification {
    static void modifyFile(String string,String path) {

        try
        {
            File file = new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + path);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "", oldtext = "";
            while((line = reader.readLine()) != null)
            {
                oldtext += line + "\r\n";
            }
            reader.close();

            String newtext = oldtext.replaceAll("lasthost.*", string);

            FileWriter writer = new FileWriter(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + path);
            writer.write(newtext);
            writer.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }



    }
}