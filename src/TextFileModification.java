import javax.swing.*;
import java.io.*;

public class TextFileModification {
    static void modifyFile(String string) {

        try
        {
            File file = new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\settings.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "", oldtext = "";
            while((line = reader.readLine()) != null)
            {
                oldtext += line + "\r\n";
            }
            reader.close();
            // replace a word in a file
            String newtext = oldtext.replaceAll("lasthost.*", string);

            //To replace a line in a file
            //String newtext = oldtext.replaceAll("This is test string 20000", "blah blah blah");

            FileWriter writer = new FileWriter(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\settings.txt");
            writer.write(newtext);writer.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }



    }
}