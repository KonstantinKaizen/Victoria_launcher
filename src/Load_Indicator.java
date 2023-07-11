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

    public static int debug_percent = 0;

    public static int debug_percent_count;

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

        BigInteger how_much_persent_loaded = new BigInteger("0");




        try {
            if(Thread_download_game.is_loading) {


                how_much_persent_loaded = new BigInteger(String.valueOf(Files.size(Paths.get(zip_location)))).divide(BigInteger.valueOf((file_size / 100)));
                System.out.println(Files.size(Paths.get(zip_location))+" "+(file_size / 100)+" "+how_much_persent_loaded);
            } else {

                if(Files.exists(Paths.get(folder_location))) {

                    how_much_persent_loaded = new BigInteger(String.valueOf(Utility.folderSize(new File(folder_location)))).divide(BigInteger.valueOf((file_size / 100)));
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        g.drawImage(Graphic.Loading_Screen,0,0,this);

        g.setColor(Color.GREEN);
        if(how_much_persent_loaded.intValue()>100){
            g.drawImage(Graphic.Loading_Progressbar,19,53,this);

        } else {
            g.drawImage(Graphic.Loading_Progressbar,19,53, (int) (how_much_persent_loaded.intValue() * 2.5),36,this);

        }
        try {

            if(Thread_download_game.is_loading) {
                g.drawImage(Graphic.Quote_Downloading,0,0,this);

            } else {
                g.drawImage(Graphic.Quote_Unzipping,0,0,this);

            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        /*




        if(debug_percent == how_much_persent_loaded.intValue()) {
            debug_percent_count++;
            System.out.println(debug_percent_count);

        } else {
            debug_percent_count = 0;
        }

        debug_percent = how_much_persent_loaded.intValue();

        if(debug_percent_count>200){

            Main.load_frame.dispose();
            Main.frame.enable(true);
            Utility.alert("Ошибка загрузки","Download error");
        }

         */ // ошибка загрузки





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
