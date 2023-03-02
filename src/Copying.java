import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Copying {



    public static void copying(String bat_path,String s_src,String s_dest,String s_file_map){

        Main.frame.disable();

        Desktop desktop = Desktop.getDesktop();
        File file_map = new File(s_file_map);
        File file_vic_2 = new File("Victoria 2");







        if(file_vic_2.isDirectory()) {
            try {

                if (file_map.isDirectory()) {
                    desktop.open(new File(bat_path));
                    System.exit(0);
                } else {
                    System.out.println("MAP NOT EXIST");
                    desktop.open(new File(bat_path));




                    File src = new File(s_src);
                    File dest = new File(s_dest);


                    while(!file_map.isDirectory()){
                        Thread.sleep(1000);
                        System.out.println("WAITING FOR DIRECTORY");

                    }
                    //Thread.sleep(0);

                    Utility.copyFile(src,dest);
                    System.out.println("COPYING COMPLETE");
                    System.exit(0);




                }


            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        } else JOptionPane.showMessageDialog(Main.frame,"ОШИБКА - Установите игру");






    }
}
