import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Load_Indicator extends JPanel implements ActionListener {

    public static long file_size;

    public static String zip_location;

    public static String folder_location;

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public Load_Indicator(long l,String zip_location,String folder_location){

        this.zip_location = zip_location;

        this.folder_location = folder_location;

        file_size = l;

        repaint();



        setBackground(Color.GRAY);
        Timer timer = new Timer(50,this);
        timer.start();

    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawImage(Graphic.DLCButton_Vic3,0,0,this);

        int how_much_persent_loaded;




        try {
            if(Thread_download_game.is_loading) {

                how_much_persent_loaded = (int) ((int) Files.size(Paths.get(zip_location)) / (file_size / 100));
            } else {

                how_much_persent_loaded = (int) ((int) Utility.folderSize(new File(folder_location)) / (file_size / 100));
            }

            System.out.println(how_much_persent_loaded);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.drawRect(4,4,300-8+10,52);
        g.setColor(Color.GREEN);
        g.drawRect(5,5, how_much_persent_loaded * 3,50);
        g.fillRect(5,5,how_much_persent_loaded * 3,50);


        g.setColor(Color.BLACK);
        g.setFont(new Font("Cambria", Font.BOLD, 16));
        try {

            if(Thread_download_game.is_loading) {


                //String b = String.valueOf(new BigInteger(String.valueOf(Files.size(Paths.get("dlc.zip")))).divide(new BigInteger("1000000")));

                g.drawString("Загрузка",100,75);

                g.drawString(how_much_persent_loaded +" %", 125, 100);
            } else {



                //g.drawString(String.valueOf(Utility.folderSize(new File("dlc"))/1000000), 125, 100);

                g.drawString("Разархивация",100,75);

            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }




/*
        try {
            String s = String.valueOf(Files.size(Paths.get("dlc.zip"))/1000000);
            g.drawString(s+" MB",100,50);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

 */


    }
}
