import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Launcher extends JPanel implements ActionListener  {




    public static boolean vic_2_launcher_selected = false;
    public static boolean vic_3_launcher_selected = false;

    public static int x = 0;
    public static int y = 0;







    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    public Launcher(){  //конструктор
        setBackground(Color.GREEN);
        init_launcher();
        addMouseListener(new mouseListener());
        addMouseMotionListener(new MouseMotionListener() {


            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

                //System.out.println("x : "+e.getX()+"  y :"+e.getY());

                x = e.getX();
                y = e.getY();


                Graphic.back_active_1 = e.getY()<369;
                Graphic.back_active_2 = e.getY()>369;



                Graphic.play_button_b = e.getX() > 134 && e.getY() > 236 && e.getX() < 383 && e.getY() < 334;
                Graphic.install_button_b = e.getX() > 138 && e.getY() > 345 && e.getX() < 382 && e.getY() < 394;

                Graphic.base_mod_launch_button_b = e.getX() > 138 && e.getY() > 426 && e.getX() < 382 && e.getY() < 472;
                Graphic.doddf_mod_launch_button_b = e.getX() > 138 && e.getY() > 484 && e.getX() < 382 && e.getY() < 532;

                Graphic.download_button_1_b = e.getX() > 79 && e.getY() > 424 && e.getX() < 127 && e.getY() < 473;
                Graphic.advice_b_1 = e.getX() > 79 && e.getY() > 424 && e.getX() < 127 && e.getY() < 473;

                Graphic.download_button_2_b = e.getX() > 79 && e.getY() > 484 && e.getX() < 127 && e.getY() < 532;
                Graphic.advice_b_2 = e.getX() > 79 && e.getY() > 484 && e.getX() < 127 && e.getY() < 532;

                Graphic.clean_button_1_b = e.getX() > 393 && e.getY() > 345 && e.getX() < 440 && e.getY() < 394;
                Graphic.advice_b_4 = e.getX() > 393 && e.getY() > 345 && e.getX() < 440 && e.getY() < 394;

                Graphic.clean_button_2_b = e.getX() > 393 && e.getY() > 425 && e.getX() < 440 && e.getY() < 472;
                Graphic.advice_b_5 = e.getX() > 393 && e.getY() > 425 && e.getX() < 440 && e.getY() < 472;

                Graphic.clean_button_3_b = e.getX() > 393 && e.getY() > 484 && e.getX() < 440 && e.getY() < 530;
                Graphic.advice_b_6 = e.getX() > 393 && e.getY() > 484 && e.getX() < 440 && e.getY() < 530;

                Graphic.reset_button_b = e.getX() > 80 && e.getY() > 346 && e.getX() < 127 && e.getY() < 393;
                Graphic.advice_b_3 = e.getX() > 80 && e.getY() > 346 && e.getX() < 127 && e.getY() < 393;


                Graphic.discord_button_b = e.getX() > 125 && e.getY() > 611 && e.getX() < 373 && e.getY() < 699;

                Graphic.back = e.getX() > 34 && e.getY() > 623 && e.getX() < 94 && e.getY() < 676;

                Graphic.delete = e.getX() > 407 && e.getY() > 626 && e.getX() < 457 && e.getY() < 675;

                Graphic.ip_button = e.getX() > 74 && e.getY() > 280 && e.getX() < 129 && e.getY() < 329;
                Graphic.ip_button_left = e.getX() > 143 && e.getY() > 650 && e.getX() < 209 && e.getY() < 684 ;
                Graphic.ip_button_right = e.getX() > 323-5 && e.getY() > 650 && e.getX() < 383 && e.getY() < 684;


                Graphic.entry_1 = e.getX() > 144 && e.getY() > 183 && e.getX() < 382 && e.getY() < 252;
                Graphic.entry_2 = e.getX() > 144 && e.getY() > 260 && e.getX() < 382 && e.getY() < 330;
                Graphic.entry_3 = e.getX() > 144 && e.getY() > 337 && e.getX() < 382 && e.getY() < 407;
                Graphic.entry_4 = e.getX() > 144 && e.getY() > 414 && e.getX() < 382 && e.getY() < 484;
                Graphic.entry_5 = e.getX() > 144 && e.getY() > 494 && e.getX() < 382 && e.getY() < 560;
                Graphic.entry_6 = e.getX() > 144 && e.getY() > 568 && e.getX() < 382 && e.getY() < 639;

                Graphic.refresh_ip_button = e.getX() > 209 && e.getY() > 648 && e.getX() < 318 && e.getY() < 683;

                Graphic.DLCButton_Vic3_b = e.getX() > 375 && e.getY() > 283 && e.getX() < 435 && e.getY() < 335;






















            }
        });

    }
    public void init_launcher(){
        Timer timer = new Timer(50,this);
        timer.start();


    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            paintComponent.repaint_all(this,g);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }






    class mouseListener extends MouseAdapter implements MouseMotionListener {

        @Override
        public void mousePressed(MouseEvent e) {


            //super.mouseClicked(e);





            System.out.println(vic_2_launcher_selected);

            System.out.println("X : "+e.getX()+"   Y : "+e.getY());



            if(!paintComponent.multi_player && vic_2_launcher_selected && e.getX()>74 && e.getY()>280 && e.getX()<129 && e.getY() < 329) {


                //InetAddress address = InetAddress.getByName("8.8.8.9");



                layout_mp.page = 0;

                System.out.println("123");
                layout_mp.list_entity_mp.clear();


                try {
                    Utility.download(Main.config,"cfg.txt");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }



                paintComponent.multi_player = true;


                try {
                    File file = new File("cfg.txt");
                    //FileReader fr = new FileReader(file);
                    //BufferedReader reader = new BufferedReader(fr);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));

                    String line = reader.readLine();

                    while (line != null) {
                        Pattern pattern = Pattern.compile("^.+?(?=\\_)");
                        Pattern pattern1 = Pattern.compile("(_\\=?).*$");
                        Matcher matcher = pattern.matcher(line);
                        String name = null;
                        String ip = null;
                        

                        if (matcher.find())
                        {
                            name = matcher.group();
                        } else System.out.println("no");

                        matcher = pattern1.matcher(line);

                        if (matcher.find())
                        {
                            ip = matcher.group().substring(1,matcher.group().length());
                        } else System.out.println("no");




                        layout_mp.list_entity_mp.add(new entity_mp(name,ip));

                        line = reader.readLine();

                    }
                } catch (IOException x) {
                    x.printStackTrace();

            }


                for (entity_mp entity:layout_mp.list_entity_mp) {

                    System.out.println(entity.name+" "+entity.ip);

                }


                System.out.println(layout_mp.list_entity_mp.size()+"размер");


                int i = 0;

                for (entity_mp x:layout_mp.list_entity_mp) {

                    ping ping = new ping(i,x.ip);
                    ping.start();
                    i++;

                }








            } //MP IP



            if(paintComponent.multi_player && vic_2_launcher_selected && e.getX()>209 && e.getY()>648 && e.getX()<318 && e.getY() < 683) {

                System.out.println("REFRESH");



                layout_mp.page = 0;

                System.out.println("123");
                layout_mp.list_entity_mp.clear();


                try {
                    Utility.download(Main.config,"cfg.txt");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }



                paintComponent.multi_player = true;


                try {
                    File file = new File("cfg.txt");
                    //FileReader fr = new FileReader(file);
                    //BufferedReader reader = new BufferedReader(fr);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));

                    String line = reader.readLine();

                    while (line != null) {
                        Pattern pattern = Pattern.compile("^.+?(?=\\_)");
                        Pattern pattern1 = Pattern.compile("(_\\=?).*$");
                        Matcher matcher = pattern.matcher(line);
                        String name = null;
                        String ip = null;


                        if (matcher.find())
                        {
                            name = matcher.group();
                        } else System.out.println("no");

                        matcher = pattern1.matcher(line);

                        if (matcher.find())
                        {
                            ip = matcher.group().substring(1,matcher.group().length());
                        } else System.out.println("no");




                        layout_mp.list_entity_mp.add(new entity_mp(name,ip));

                        line = reader.readLine();

                    }
                } catch (IOException x) {
                    x.printStackTrace();

                }


                for (entity_mp entity:layout_mp.list_entity_mp) {

                    System.out.println(entity.name+" "+entity.ip);

                }


                System.out.println(layout_mp.list_entity_mp.size()+"размер");
                int i = 0;

                for (entity_mp x:layout_mp.list_entity_mp) {

                    ping ping = new ping(i,x.ip);
                    ping.start();
                    i++;

                }










            } //refresh


            if(vic_2_launcher_selected && e.getX()>323-5 && e.getY()>650 && e.getX()<383 && e.getY() < 684 && paintComponent.multi_player){

                if(layout_mp.list_entity_mp.size()>layout_mp.page+6) {

                    layout_mp.page = layout_mp.page + 6;
                    System.out.println("next");
                    System.out.println(layout_mp.page);




                }




            } // кнопка впереод MP

            if(vic_2_launcher_selected && e.getX()>143 && e.getY()>650 && e.getX()<209 && e.getY() < 684 && paintComponent.multi_player){


                if(layout_mp.page != 0) {

                    layout_mp.page = layout_mp.page - 6;
                    System.out.println("previous");



                }



            } // кнопка назад MP






            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>183 && e.getX()<382 && e.getY() < 252 && paintComponent.multi_player){


                if(layout_mp.list_entity_mp.size()>= 0+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(0 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(0 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(0 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt");
                    System.out.println("file modifed");
                    JOptionPane.showMessageDialog(Main.frame,"IP изменен");



                }


            }// кнопка лобби 1
            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>260 && e.getX()<382 && e.getY() < 330 && paintComponent.multi_player){


                if(layout_mp.list_entity_mp.size()>= 1+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(1 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(1 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(1 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt");
                    System.out.println("file modifed");
                    JOptionPane.showMessageDialog(Main.frame,"IP изменен");



                }
            }// кнопка лобби 2
            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>337 && e.getX()<382 && e.getY() < 407 && paintComponent.multi_player){

                if(layout_mp.list_entity_mp.size()>= 2+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(2 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(2 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(2 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt");
                    System.out.println("file modifed");
                    JOptionPane.showMessageDialog(Main.frame,"IP изменен");



                }
            }// кнопка лобби 3
            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>414 && e.getX()<382 && e.getY() < 484 && paintComponent.multi_player){

                if(layout_mp.list_entity_mp.size()>= 3+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(3 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(3 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(3 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt");
                    System.out.println("file modifed");
                    JOptionPane.showMessageDialog(Main.frame,"IP изменен");



                }
            }// кнопка лобби 4
            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>494 && e.getX()<382 && e.getY() < 560 && paintComponent.multi_player){

                if(layout_mp.list_entity_mp.size()>= 4+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(4 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(4 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(4 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt");
                    System.out.println("file modifed");
                    JOptionPane.showMessageDialog(Main.frame,"IP изменен");



                }
            }// кнопка лобби 5
            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>568 && e.getX()<382 && e.getY() < 639 && paintComponent.multi_player){

                if(layout_mp.list_entity_mp.size()>= 5+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(5 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(5 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(5 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt");

                    System.out.println("file modifed");
                    JOptionPane.showMessageDialog(Main.frame,"IP изменен");



                }
            }// кнопка лобби 6














            if(vic_2_launcher_selected && e.getX()>123 && e.getY()>611 && e.getX()<373 && e.getY() < 699 && !paintComponent.multi_player){










                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://discord.gg/HuVGesQT5e"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (URISyntaxException ex) {
                        throw new RuntimeException(ex);
                    }
                }





            } //  кнопка дискорда




            if(vic_2_launcher_selected && e.getX()>138 && e.getY()>235 && e.getX()<383 && e.getY() < 333 && !paintComponent.multi_player){



                File file = new File("Victoria 2/3.bat");
                if (!file.exists()) {
                    JOptionPane.showMessageDialog(Main.frame,"Скачайте игру");
                    return;
                }


                new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\gfx\\flags").mkdirs();
                try {
                    Utility.copyDirectory(new File("Victoria 2\\flags"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\gfx\\flags"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                Thread_close_game thread_close_game = new Thread_close_game();
                thread_close_game.start();



                //Copying.copying("Victoria 2/3.bat","Victoria 2/time",System.getProperty("user.home") + "/Documents/Paradox Interactive/Victoria II/map/cache/time",System.getProperty("user.home") + "/Documents/Paradox Interactive/Victoria II/map");
                Copying.copying("Victoria 2/3.bat","Victoria 2/time",new JFileChooser().getFileSystemView().getDefaultDirectory().toString() +  "\\Paradox Interactive\\Victoria II\\map\\cache\\time",new JFileChooser().getFileSystemView().getDefaultDirectory().toString() +  "\\Paradox Interactive\\Victoria II\\map");
                Main.frame.enable();
                System.out.println("запуск игры");










            } //  запуск игры 2 3

            if(vic_2_launcher_selected && e.getX()>137 && e.getY()>347 && e.getX()<383 && e.getY() < 390 && !paintComponent.multi_player){
                Desktop desktop = Desktop.getDesktop();


                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map"));

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\map"));

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\map"));



                try {
                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\settings.txt"));

                } catch (IOException ex) {

                    throw new RuntimeException(ex);
                }finally {
                    try {
                        Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } finally {
                        try {
                            Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt"));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } finally {

                            try {
                                System.out.println("start download");
                                desktop.open(new File("launcher\\Resourse\\Vic 2.bat"));
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }

                        }
                    }


                } // шестеренка













                /*  // модуль скачки и разархивации любого зип файла из гугл диска с API
                try {
                    Files.delete(Paths.get(System.getProperty("user.home")+"/Documents/Paradox Interactive/Victoria II/settings.txt"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                Download.deleteDirectory(new File(System.getProperty("user.home") + "/Documents/Paradox Interactive/Victoria II/gfx"));
                Download.deleteDirectory(new File(System.getProperty("user.home") + "/Documents/Paradox Interactive/Victoria II/logs"));
                Download.deleteDirectory(new File(System.getProperty("user.home") + "/Documents/Paradox Interactive/Victoria II/map"));

                System.out.println("method_install_game_started");


                String url4 = "https://www.googleapis.com/drive/v3/files/1nwHIEFjoTAqGQX7MGnVNHgtknkeu6Qvw?alt=media&key=AIzaSyCB73AF5G290NJnF4kl7Zpju6AynPSmKpc";
                String dest = "123.zip";

                try {
                    Download.downloadUsingNIO(url4,dest);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                System.out.println("starting_unarchive");
                Download.extractFolder(dest,"vic_2");
                System.out.println("ended_unarchive");

                try {
                    Files.delete(Paths.get(dest));
                    System.out.println("zip_deleted");

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                System.out.println("method_install_game_completed");

                 */ // модуль скачки и разархивации любого зип файла из гугл диска с API



            } //  установить игру

            if(vic_2_launcher_selected && e.getX()>138 && e.getY()>427 && e.getX()<383 && e.getY() < 473 && !paintComponent.multi_player){
                System.out.println("запуск мода базы");

                File file1 = new File("Victoria 2/1.bat");
                if (!file1.exists()) {

                    JOptionPane.showMessageDialog(Main.frame,"ОШИБКА - Переустановите мод или игру");
                    return;
                }

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2/mod/STAHL_MOD");
                if(!file.isDirectory()){

                    JOptionPane.showMessageDialog(Main.frame,"ОШИБКА - Установите мод");
                    return;
                }

                new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\gfx\\flags").mkdirs();
                try {
                    Utility.copyDirectory(new File("Victoria 2/mod/STAHL_MOD/flags"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\gfx\\flags"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                Thread_close_game thread_close_game = new Thread_close_game();
                thread_close_game.start();






                Copying.copying("Victoria 2/1.bat","Victoria 2/mod/STAHL_MOD/time",new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\map\\cache\\time",new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\map");
                Main.frame.enable();

            } //  запуск мода базы ------------------------------------------------------------------

            if(vic_2_launcher_selected && e.getX()>135 && e.getY()>486 && e.getX()<383 && e.getY() < 553 && !paintComponent.multi_player){
                System.out.println("запуск мода доддф");

                File file1 = new File("Victoria 2/2.bat");
                if (!file1.exists()) {

                    JOptionPane.showMessageDialog(Main.frame,"ОШИБКА - Переустановите мод или игру");
                    return;
                }

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2/mod/DoDDF");

                if(!file.isDirectory()){

                    JOptionPane.showMessageDialog(Main.frame,"ОШИБКА - Установите мод");
                    return;
                }


                new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\gfx\\flags").mkdirs();

                try {
                    Utility.copyDirectory(new File("Victoria 2\\mod\\DoDDF\\flags"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\gfx\\flags"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                Thread_close_game thread_close_game = new Thread_close_game();
                thread_close_game.start();


                Copying.copying("Victoria 2\\2.bat","Victoria 2/time",new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map",new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Documents\\Paradox Interactive\\Victoria II");
                Main.frame.enable();
                
            } //  запуск мода доддф -------------------------------------------------------------

            if(vic_2_launcher_selected && e.getX()>393 && e.getY()>346 && e.getX()<440 && e.getY() < 393 && !paintComponent.multi_player){
                    System.out.println("отчистить_кеш_игры_метла 1");

                    Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\gfx"));
                    Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\logs"));
                    Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map"));

                    JOptionPane.showMessageDialog(Main.frame,"Кеш очищен");

            } //  метла_1

            if(vic_2_launcher_selected && e.getX()>391 && e.getY()>425 && e.getX()<440 && e.getY() < 471 && !paintComponent.multi_player){
                System.out.println("отчисттиь мод базы");



                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\map"));



                JOptionPane.showMessageDialog(Main.frame,"Кеш очищен");
            } //  метла_2

            if(vic_2_launcher_selected && e.getX()>393 && e.getY()>486 && e.getX()<442 && e.getY() < 532 && !paintComponent.multi_player){
                System.out.println("отчитисть мод доддф");

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\map"));



                JOptionPane.showMessageDialog(Main.frame,"Кеш очищен");
            } //  метла_3

            if(vic_2_launcher_selected && e.getX()>79 && e.getY()>347 && e.getX()<129 && e.getY() < 394 && !paintComponent.multi_player){
                System.out.println("сброс_настроек_шестеренка");

                try {
                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\settings.txt"));

                } catch (IOException ex) {

                    throw new RuntimeException(ex);
                }finally {
                    try {
                        Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } finally {
                        try {
                            Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt"));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } finally {
                            JOptionPane.showMessageDialog(Main.frame,"Настройки сброшены");
                        }
                    }

                }

            } //  шестеренка

            if(vic_2_launcher_selected && e.getX()>80 && e.getY()>428 && e.getX()<128 && e.getY() < 474 && !paintComponent.multi_player){
                System.out.println("скачать мод базы");

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2");

                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\gfx"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\logs"));
               // Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map"));

                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\gfx"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\logs"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\map"));

                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\gfx"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\logs"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\map"));



                try {
                    //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\settings.txt"));

                } finally {
                    try {
                        //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt"));
                    } finally {
                        try {
                            //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt"));
                        } finally {

                        if(file.isDirectory()) {


                    try {
                        desktop.open(new File("launcher\\Resourse\\Base S.bat"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                } else JOptionPane.showMessageDialog(Main.frame,"ОШИБКА - Установите игру");



                        }
                    }

                } // шестеренка + запуск скачки мода









            } //  скачать мод базы

            if(vic_2_launcher_selected && e.getX()>79 && e.getY()>485 && e.getX()<128 && e.getY() < 532 && !paintComponent.multi_player){
                System.out.println("скачать мод доддф");

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2");

                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\gfx"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\logs"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map"));

                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\gfx"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\logs"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\map"));

                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\gfx"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\logs"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\map"));



                try {
                    //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\settings.txt"));


                } finally {
                    try {
                        //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt"));
                    } finally {
                        try {
                            //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt"));
                        } finally {

                            if(file.isDirectory()) {

                                try {
                                    desktop.open(new File("launcher\\Resourse\\dod.bat"));
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                }
                            } else JOptionPane.showMessageDialog(Main.frame,"ОШИБКА - Установите игру");

                        }
                    }

                } // шестеренка + установка мода додф






            } //  скачать мод доддф

            if(vic_2_launcher_selected && e.getX()>406 && e.getY()>627 && e.getX()<456 && e.getY() < 674 && !paintComponent.multi_player){

                Main.frame.disable();

                Utility.deleteDirectory(new File("Victoria 2"));

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map"));
                Main.frame.enable();

                JOptionPane.showMessageDialog(Main.frame,"Раздел удален");




            } // delete all

            if(vic_2_launcher_selected && e.getX()>419 && e.getY()>138 && e.getX()<484 && e.getY() < 212 && !paintComponent.multi_player){


                Desktop desktop = Desktop.getDesktop();

                try {
                    desktop.open(new File("launcher\\Resourse\\L_23.bat"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                System.exit(0);
            }// update launcher




            if((vic_3_launcher_selected || vic_2_launcher_selected) && e.getX()>34 && e.getY()>623 && e.getX()<94 && e.getY() < 676){

                if(paintComponent.multi_player){
                    paintComponent.multi_player = false;
                    return;

                }



                System.out.println("123");


                Main.the_choice_is_made = false;
                vic_2_launcher_selected = false;
                vic_3_launcher_selected = false;
                Main.frame.setTitle("launcher 2/3");

                return;
            }// назад


            //------------------------



            if(!Main.the_choice_is_made && e.getX()<498 && e.getY()<368) {
                Main.the_choice_is_made = true;
                Main.frame.setTitle("Victoria 2");
                vic_2_launcher_selected = true;
                return;
            } else if(!Main.the_choice_is_made){
                Main.frame.setTitle("Victoria 3");
                Main.the_choice_is_made = true;
                vic_3_launcher_selected = true;
                return;
            }


            //------------------------
            if(vic_3_launcher_selected && e.getX()>138 && e.getY()>235 && e.getX()<383 && e.getY() < 333){

                try {
                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\content_load.json"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } finally {

                    File file = new File("Victoria 3");
                    if (!file.exists()) {
                        JOptionPane.showMessageDialog(Main.frame,"Скачайте игру");
                        return;
                    }

                    Thread_close_game thread_close_game = new Thread_close_game();
                    thread_close_game.start();

                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.open(new File("launcher\\Resourse\\V3s.bat"));
                        System.exit(0);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                }





                System.out.println("vic_3");
            } // vic 3 run

            if(vic_3_launcher_selected && e.getX()>137 && e.getY()>347 && e.getX()<383 && e.getY() < 390){

                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Игра будет установлена в папку где находится лаунчер и займёт около 15 гигов. Запустить установку?", "Warning", dialogButton);
                if(dialogResult == 0) {
                    System.out.println("Yes option");

                } else {
                    System.out.println("No Option");
                    return;

                }





                Desktop desktop = Desktop.getDesktop();
                System.out.println("start download");
                try {
                    desktop.open(new File("launcher\\Resourse\\Vic 3.bat"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println("install");

            } //vic 3 download

            if(vic_3_launcher_selected && e.getX()>393 && e.getY()>346 && e.getX()<440 && e.getY() < 393){


                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\.launcher-cache"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\cache"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\crashes"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\dumps"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\exceptions"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\generated"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\oos"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\player"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\pops_filestorage"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\shadercache"));
                JOptionPane.showMessageDialog(Main.frame,"Кеш очищен");
                System.out.println("metla 1");
            } // metla 1

            if(vic_3_launcher_selected && e.getX()>138 && e.getY()>427 && e.getX()<383 && e.getY() < 473){





                //String path = new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\mod\\NVBM";

                File file1 = new File("Victoria 3");
                if (!file1.exists()) {
                    JOptionPane.showMessageDialog(Main.frame,"Скачайте игру");
                    return;
                }

                String canonicalPath;


                try {
                    canonicalPath = new File(".").getCanonicalPath();

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                canonicalPath = canonicalPath+"\\Victoria 3\\mod\\NVBM";
                File file = new File(canonicalPath);



                if (!file.exists()) {
                    JOptionPane.showMessageDialog(Main.frame,"Скачайте мод");
                    return;
                }
                Thread_close_game thread_close_game = new Thread_close_game();
                thread_close_game.start();





                String string = "{\"enabledMods\":[{\"path\":\""+canonicalPath+"\"}],\"disabledDLC\":[]}";
                Desktop desktop = Desktop.getDesktop();


                try {
                    Utility.modifyPath(string,new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\content_load.json");
                    desktop.open(new File("launcher\\Resourse\\V3s.bat"));
                    System.exit(0);

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }



                System.out.println("NVBM");
            } // run nvmb

            if(vic_3_launcher_selected && e.getX()>80 && e.getY()>428 && e.getX()<128 && e.getY() < 474){



                File file = new File("Victoria 3");
                if (!file.exists()) {
                    JOptionPane.showMessageDialog(Main.frame,"Скачайте игру");
                    return;
                }



                Desktop desktop = Desktop.getDesktop();
                System.out.println("start download nvmb");
                try {
                    desktop.open(new File("launcher\\Resourse\\VIC3M.bat"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

/*



 */
                System.out.println("install nvbm");

            } // install nvmb

            if(vic_3_launcher_selected && e.getX()>79 && e.getY()>347 && e.getX()<129 && e.getY() < 394){

                try {
                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\console_history.txt"));




                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } finally {
                    try {
                        Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\content_load.json"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } finally {
                        try {
                            Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\dlc_signature"));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } finally {
                            try {
                                Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\game_data.json"));
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }finally {
                                try {
                                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\launcher-v2.sqlite"));
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                }finally {
                                    try {
                                        Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\pdx_settings.json"));
                                    } catch (IOException ex) {
                                        throw new RuntimeException(ex);
                                    } finally {
                                        try {
                                            Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\pops_filestorage.index"));
                                        } catch (IOException ex) {
                                            throw new RuntimeException(ex);
                                        } finally {
                                            try {
                                                Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\tutorial.txt"));
                                            } catch (IOException ex) {
                                                throw new RuntimeException(ex);
                                            } finally {
                                                try {
                                                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\continue_game.json"));
                                                } catch (IOException ex) {
                                                    throw new RuntimeException(ex);
                                                } finally {
                                                    JOptionPane.showMessageDialog(Main.frame,"Настройки сброшены");
                                                }

                                            }

                                        }

                                    }

                                }

                            }

                        }

                    }

                }
                System.out.println("shesterenka");
            } // gear

            if(vic_3_launcher_selected && e.getX()>406 && e.getY()>627 && e.getX()<456 && e.getY() < 674){


                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Вы действительно хотите удалить игру?", "Warning", dialogButton);
                if(dialogResult == 0) {
                    System.out.println("Yes option");

                } else {
                    System.out.println("No Option");
                    return;

                }

                int dialogButton1 = JOptionPane.YES_NO_OPTION;
                int dialogResult1 = JOptionPane.showConfirmDialog(null, "Удалить папку мода с игрой?", "Warning", dialogButton1);
                if(dialogResult1 == 0) {
                    System.out.println("Yes option");
                    Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\mod"));

                } else {
                    System.out.println("No Option");


                }






                Main.frame.disable();






                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\.launcher-cache"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\cache"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\crashes"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\dumps"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\exceptions"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\generated"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\oos"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\player"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\pops_filestorage"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\shadercache"));
                Utility.deleteDirectory(new File("Victoria 3"));

                try {
                    Utility.vic_3_giga_try();
                } finally {
                    Main.frame.enable();
                    JOptionPane.showMessageDialog(Main.frame,"Раздел удален");

                }










            } // delete all

            if(vic_3_launcher_selected && e.getX()>125 && e.getY()>611 && e.getX()<373 && e.getY() < 699){



                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://discord.gg/HuVGesQT5e"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (URISyntaxException ex) {
                        throw new RuntimeException(ex);
                    }
                }




            } //// кнопка дискорда


            if(vic_3_launcher_selected && e.getX()>375 && e.getY()>283 && e.getX()<435 && e.getY() < 335){
                System.out.println("dlc");








            }

























        }


    }
}
