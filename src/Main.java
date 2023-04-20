import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public  class Main   {

    public static String version_on_server = "1";


    public static int version = 1;

    public static String version_url = "https://drive.google.com/u/0/uc?id=1PudDy3G76z64qRBhfCVuf4SDZpqBttuC&export=download";

    public static boolean the_choice_is_made = false;
    public static int width = 516;
    public static int height = 839;
    public static JFrame frame;


    public Main(){


        frame = new JFrame();
        frame.setTitle("launcher 2/3 "+"19.04.2023v2");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null);
        frame.add(new Launcher());
        frame.setVisible(true);
        frame.setResizable(false);




        System.out.println("123");

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