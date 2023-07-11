import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public  class Main   {




    //public static String dlc_link = "https://www.googleapis.com/drive/v3/files/1mCQ9demPZx_0KkonOsgmWdVsybd1AAwK?alt=media&key=AIzaSyAbEeSvujd4zevMVTqOzGaYV_siZXU6f6A";


    //public static String dlc_link = "https://drive.google.com/u/0/uc?id=1UBPNe-H3QR0OMCS-7ZKhNm-i0xi4l-L3&export=download";

    //public static String dlc_link = "https://drive.google.com/u/0/uc?id=1mCQ9demPZx_0KkonOsgmWdVsybd1AAwK&export=download";

    //public static String dlc_link = "https://drive.google.com/uc?id=1mCQ9demPZx_0KkonOsgmWdVsybd1AAwK&export=download&confirm=t";


    //public static String dlc_link = "http://46.8.29.39/index.php/s/azz3xbxbNWQocKJ/download";

    public static String dlc_link = "http://194.147.148.18/index.php/s/DLC/download/DLC.zip";

    public static String victoria_3_link = "http://194.147.148.18/index.php/s/Victoria3/download/Victoria3.zip";

    public static String victoria_3_nvmb = "http://194.147.148.18/index.php/s/NVBM/download/NVBM.zip";




    public static String victoria_2_link = "http://194.147.148.18/index.php/s/Victoria2/download/000.zip";
    public static String victoria_2_1_mod = "http://194.147.148.18/index.php/s/001/download/001.zip";
    public static String victoria_2_2_mod = "http://194.147.148.18/index.php/s/002/download/002.zip";

    public static String victoria_2_3_mod = "http://194.147.148.18/index.php/s/003/download/003.zip";











    public static String config = "https://docs.google.com/spreadsheets/d/1tdFMNP53oHA6vOApnJ3VBW93EBACGj9jIFVoq-JYuTA/export?format=csv";

    public static String version_on_server = "1";


    public static int version = 1;

    public static String version_url = "https://drive.google.com/u/0/uc?id=1PudDy3G76z64qRBhfCVuf4SDZpqBttuC&export=download";

    public static boolean the_choice_is_made = false;
    public static int width = 516-8;
    public static int height = 783;
    public static JFrame frame;
    public static JFrame load_frame;


    public Main(){


        frame = new JFrame();
        frame.setTitle("launcher 2/3 "+"11.07.2023|12:00");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null);
        frame.add(new Launcher());
        frame.setVisible(true);
        frame.setResizable(false);


        try {
            String s = Utility.readFile(Files.newInputStream(new File("launcher\\lang.txt").toPath()));

            if(s.equals("rus")) {
                System.out.println("rus");
                Graphic.change_lang = true;
            }
            if(s.equals("eng")) {
                System.out.println("eng");
                Graphic.change_lang = false;
                Graphic.change_lang_to_eng();
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Language.sync_language("Victoria 2\\localisation\\");
        Language.sync_language("Victoria 2\\mod\\DoDDF\\localisation\\");
        Language.sync_language("Victoria 2\\mod\\STAHL_MOD\\localisation\\");



    }
    public Main(String link,String zip ,String folder){



        load_frame = new JFrame("");
        load_frame.setLocationByPlatform(true);
        //load_frame.setAlwaysOnTop(true);

        //load_frame.setUndecorated(true);


        load_frame.add(new Load_Indicator(Utility.getUrlSize(link),zip,folder));
        load_frame.setResizable(false);
        load_frame.setSize(290+17, 96+40);
        load_frame.setLocationRelativeTo(null);
        load_frame.setVisible(true);
        load_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });



        try {
            version = Integer.parseInt((Utility.readFile(Files.newInputStream(new File("launcher\\Resourse\\version.txt").toPath()))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            Utility.download(version_url,"version.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            //Utility.readFromInputStream(new FileInputStream(new File("1.txt")));
             version_on_server = (Utility.readFile(Files.newInputStream(new File("version.txt").toPath())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Files.delete(Paths.get("version.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        if(Integer.parseInt(version_on_server) > version) {

            Desktop desktop = Desktop.getDesktop();

            try {
                desktop.open(new File("launcher\\Resourse\\L_23.bat"));
                desktop.open(new File("launcher\\Resourse\\L23C.bat"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            System.exit(0);
        }
        System.out.println("version okey");

    }














}