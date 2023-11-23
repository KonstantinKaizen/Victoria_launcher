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

                //-----------------------------------------------



                Graphic.play_button_b = e.getX() > 129 && e.getY() > 294 && e.getX() < 375 && e.getY() < 343;
                Graphic.install_button_b = e.getX() > 128 && e.getY() > 235 && e.getX() < 374 && e.getY() < 282;

                Graphic.mod_1_launch_b = e.getX() > 129 && e.getY() > 409 && e.getX() < 374 && e.getY() < 460;
                Graphic.mod_2_launch_b = e.getX() > 129 && e.getY() > 467 && e.getX() < 374 && e.getY() < 516;
                Graphic.mod_3_launch_b = e.getX() > 129 && e.getY() > 525 && e.getX() < 374 && e.getY() < 577;
                Graphic.mod_4_launch_b = e.getX() > 129 && e.getY() > 584 && e.getX() < 378 && e.getY() < 633;

                Graphic.download_button_0_b = e.getX() > 69 && e.getY() > 293 && e.getX() < 120 && e.getY() < 342;

                Graphic.download_button_1_b = e.getX() > 71 && e.getY() > 410 && e.getX() < 118 && e.getY() < 458;
                Graphic.advice_b_1 = e.getX() > 71 && e.getY() > 410 && e.getX() < 118 && e.getY() < 458;

                Graphic.download_button_2_b = e.getX() > 70 && e.getY() > 468 && e.getX() < 120 && e.getY() < 516;
                Graphic.advice_b_2 = e.getX() > 70 && e.getY() > 468 && e.getX() < 120 && e.getY() < 516;

                Graphic.download_button_3_b = e.getX() > 70 && e.getY() > 525 && e.getX() < 118 && e.getY() < 572;

                Graphic.download_button_4_b = e.getX() > 71 && e.getY() > 582 && e.getX() < 120 && e.getY() < 632;

                Graphic.clean_button_1_b = e.getX() > 382 && e.getY() > 294 && e.getX() < 434 && e.getY() < 344;
                Graphic.advice_b_4 = e.getX() > 382 && e.getY() > 294 && e.getX() < 434 && e.getY() < 344;

                Graphic.clean_button_2_b = e.getX() > 384 && e.getY() > 411 && e.getX() < 433 && e.getY() < 461;
                Graphic.advice_b_5 = e.getX() > 384 && e.getY() > 411 && e.getX() < 433 && e.getY() < 461;



                Graphic.clean_button_3_b = e.getX() > 383 && e.getY() > 470 && e.getX() < 434 && e.getY() < 518;
                Graphic.advice_b_6 = e.getX() > 383 && e.getY() > 470 && e.getX() < 434 && e.getY() < 518;

                Graphic.clean_button_4_b = e.getX() > 382 && e.getY() > 526 && e.getX() < 434 && e.getY() < 574;

                Graphic.clean_button_5_b = e.getX() > 383 && e.getY() > 584 && e.getX() < 433 && e.getY() < 633;


                Graphic.reset_button_b = e.getX() > 167 && e.getY() > 642 && e.getX() < 218 && e.getY() < 692;
                Graphic.advice_b_3 = e.getX() > 167 && e.getY() > 642 && e.getX() < 218 && e.getY() < 692;

                Graphic.vk_b       = e.getX() > 226 && e.getY() > 700 && e.getX() < 276 && e.getY() < 748; // VK

                Graphic.war_b = e.getX() > 226 && e.getY() > 641 && e.getX() < 277 && e.getY() < 693; //WAR



                Graphic.ec_b = e.getX() > 283 && e.getY() > 640 && e.getX() < 333 && e.getY() < 691; // EC








                Graphic.discord_button_b = e.getX() > 284 && e.getY() > 699 && e.getX() < 335 && e.getY() < 749;

                Graphic.back = e.getX() > 69 && e.getY() > 698 && e.getX() < 120 && e.getY() < 750;

                Graphic.delete = e.getX() > 383 && e.getY() > 698 && e.getX() < 432 && e.getY() < 750;

                Graphic.ip_button = e.getX() > 70 && e.getY() > 235 && e.getX() < 120 && e.getY() < 286;
                Graphic.ip_button_left = e.getX() > 143 && e.getY() > 650 && e.getX() < 209 && e.getY() < 684 ;
                Graphic.ip_button_right = e.getX() > 323-5 && e.getY() > 650 && e.getX() < 383 && e.getY() < 684;


                Graphic.entry_1 = e.getX() > 144 && e.getY() > 183 && e.getX() < 382 && e.getY() < 252;
                Graphic.entry_2 = e.getX() > 144 && e.getY() > 260 && e.getX() < 382 && e.getY() < 330;
                Graphic.entry_3 = e.getX() > 144 && e.getY() > 337 && e.getX() < 382 && e.getY() < 407;
                Graphic.entry_4 = e.getX() > 144 && e.getY() > 414 && e.getX() < 382 && e.getY() < 484;
                Graphic.entry_5 = e.getX() > 144 && e.getY() > 494 && e.getX() < 382 && e.getY() < 560;
                Graphic.entry_6 = e.getX() > 144 && e.getY() > 568 && e.getX() < 382 && e.getY() < 639;

                Graphic.refresh_ip_button = e.getX() > 209 && e.getY() > 648 && e.getX() < 318 && e.getY() < 683;

                Graphic.DLCButton_Vic3_b = e.getX() > 74 && e.getY() > 285 && e.getX() < 123 && e.getY() < 335;

                Graphic.change_language_button_b = e.getX()>383 && e.getY()>235 && e.getX()<433 && e.getY() < 286;


                //------------------Vic 3

                   Graphic.download_mod_b_3 = e.getX()>72 && e.getY()>427 && e.getX()<121 && e.getY() < 475;

                   Graphic.reset_gear_b_3 = e.getX()>72 && e.getY()>346 && e.getX()<122 && e.getY() < 394;

                   Graphic.clean_cache_b_3 = e.getX()>386 && e.getY()>347 && e.getX()<434 && e.getY() < 394;

                   Graphic.launch_game_b_3 = e.getX()>131 && e.getY()>236 && e.getX()<376 && e.getY() < 333;

                   Graphic.install_game_b_3 = e.getX()>131 && e.getY()>345 && e.getX()<375 && e.getY() < 391;

                   Graphic.launch_mode_b_3 = e.getX()>131 && e.getY()>427 && e.getX()<376 && e.getY() < 475;

                Graphic.lang_button_b_3 = e.getX()>386 && e.getY()>287 && e.getX()<435 && e.getY() < 335;




























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
        public void mousePressed(final MouseEvent e) {


            //super.mouseClicked(e);





            System.out.println(vic_2_launcher_selected);

            System.out.println("X : "+e.getX()+"   Y : "+e.getY());




            if(!paintComponent.multi_player && vic_2_launcher_selected && e.getX()>70 && e.getY()>236 && e.getX()<120 && e.getY() < 285) {
                        paintComponent.multi_player = true;


                        new Thread(new Runnable() {
                            @Override
                            public void run() {

                                System.out.println("123");

                                try {



                                    if (!Files.exists(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\0\\settings.txt").toPath())) {
                                        System.out.println("start default");

                                        try {

                                            Utility.copyFile(new File("Victoria 2\\mod\\0\\settings.txt"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\0\\settings.txt"));
                                            System.out.println("default end");
                                        } catch (IOException ex) {


                                        }
                                    }

                                } finally {

                                    try {




                                        if (!Files.exists(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\settings.txt").toPath())) {
                                            System.out.println("BDSHFM start");

                                            try {

                                                Utility.copyFile(new File("Victoria 2\\mod\\1\\settings.txt"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\settings.txt"));
                                                System.out.println("BDSHFM end");
                                            } catch (IOException ex) {


                                            }
                                        }

                                    } finally {
                                        try {


                                            if (!Files.exists(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\settings.txt").toPath())) {
                                                System.out.println("DoDDF start");

                                                try {

                                                    Utility.copyFile(new File("Victoria 2\\mod\\2\\settings.txt"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\settings.txt"));
                                                    System.out.println("DoDDF end");
                                                } catch (IOException ex) {


                                                }
                                            }

                                        } finally {

                                            try {


                                                if (!Files.exists(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\settings.txt").toPath())) {
                                                    System.out.println("DoDDF start");

                                                    try {

                                                        Utility.copyFile(new File("Victoria 2\\mod\\3\\settings.txt"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\settings.txt"));
                                                        System.out.println("DoDDF end");
                                                    } catch (IOException ex) {


                                                    }
                                                }
                                            } finally {
                                                layout_mp.page = 0;

                                                System.out.println("123");
                                                layout_mp.list_entity_mp.clear();


                                                try {
                                                    Utility.download(Main.config,"cfg.txt");
                                                } catch (IOException ex) {

                                                    Utility.alert("Нет подключения","No connection");
                                                    throw new RuntimeException(ex);
                                                }


                                                try {
                                                    File file = new File("cfg.txt");
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

                                                int i = 0;

                                                for (entity_mp x:layout_mp.list_entity_mp) {

                                                    ping ping = new ping(i,x.ip);
                                                    ping.start();
                                                    i++;


                                                }

                                            }












                                        }
                                    }
                                }















                    }}).start();








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

                    System.out.println(layout_mp.list_entity_mp.get(0).ip);




                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(0 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\0\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(0 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\1\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(0 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\2\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(0 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\3\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(0 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\4\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(0 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\5\\settings.txt");

                    System.out.println("file modifed");
                    Utility.alert("IP изменен","IP changed");



                }


            }// кнопка лобби 1
            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>260 && e.getX()<382 && e.getY() < 330 && paintComponent.multi_player){


                if(layout_mp.list_entity_mp.size()>= 1+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(1 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\0\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(1 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\1\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(1 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\2\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(1 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\3\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(1 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\4\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(1 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\5\\settings.txt");
                    System.out.println("file modifed");
                    Utility.alert("IP изменен","IP changed");



                }
            }// кнопка лобби 2
            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>337 && e.getX()<382 && e.getY() < 407 && paintComponent.multi_player){

                if(layout_mp.list_entity_mp.size()>= 2+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(2 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\0\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(2 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\1\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(2 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\2\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(2 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\3\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(2 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\4\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(2 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\5\\settings.txt");
                    System.out.println("file modifed");
                    Utility.alert("IP изменен","IP changed");



                }
            }// кнопка лобби 3
            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>414 && e.getX()<382 && e.getY() < 484 && paintComponent.multi_player){

                if(layout_mp.list_entity_mp.size()>= 3+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(3 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\0\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(3 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\1\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(3 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\2\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(3 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\3\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(3 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\4\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(3 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\5\\settings.txt");
                    System.out.println("file modifed");
                    Utility.alert("IP изменен","IP changed");



                }
            }// кнопка лобби 4
            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>494 && e.getX()<382 && e.getY() < 560 && paintComponent.multi_player){

                if(layout_mp.list_entity_mp.size()>= 4+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(4 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\0\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(4 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\1\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(4 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\2\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(4 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\3\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(4 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\4\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(4 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\5\\settings.txt");
                    System.out.println("file modifed");
                    Utility.alert("IP изменен","IP changed");



                }
            }// кнопка лобби 5
            if(vic_2_launcher_selected && e.getX()>144 && e.getY()>568 && e.getX()<382 && e.getY() < 639 && paintComponent.multi_player){

                if(layout_mp.list_entity_mp.size()>= 5+layout_mp.page) {


                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(5 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\0\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(5 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\1\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(5 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\2\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(5 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\3\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(5 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\4\\settings.txt");
                    TextFileModification.modifyFile("lasthost=\""+layout_mp.list_entity_mp.get(5 + layout_mp.page).ip+"\"","\\Paradox Interactive\\Victoria II\\5\\settings.txt");
                    System.out.println("file modifed");
                    Utility.alert("IP изменен","IP changed");



                }
            }// кнопка лобби 6




            if(vic_2_launcher_selected && e.getX()>284 && e.getY()>699 && e.getX()<334 && e.getY() < 748 && !paintComponent.multi_player){










                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://discord.gg/victoria-2-3-738309426905219155"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (URISyntaxException ex) {
                        throw new RuntimeException(ex);
                    }
                }





            } //  кнопка дискорда



            if(vic_2_launcher_selected && e.getX()>226 && e.getY()>699 && e.getX()<276 && e.getY() < 747 && !paintComponent.multi_player){










                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://vk.com/23int"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (URISyntaxException ex) {
                        throw new RuntimeException(ex);
                    }
                }





            } //  кнопка вк



            if(vic_2_launcher_selected && e.getX()>383 && e.getY()>235 && e.getX()<433 && e.getY() < 285 && !paintComponent.multi_player){

                System.out.println("change lang");

                Graphic.change_lang_to_eng();

                Language.sync_language("Victoria 2\\localisation\\");
                Language.sync_language("Victoria 2\\mod\\0\\localisation\\");
                Language.sync_language("Victoria 2\\mod\\1\\localisation\\");
                Language.sync_language("Victoria 2\\mod\\2\\localisation\\");
                Language.sync_language("Victoria 2\\mod\\3\\localisation\\");




            }// кнопка смены языка


            if(vic_2_launcher_selected && e.getX()>128 && e.getY()>236 && e.getX()<372 && e.getY() < 284 && !paintComponent.multi_player){
                String s;
                String s2;

                File file = new File("Victoria 2");

                if(file.exists()) {


                    if (Graphic.language_russian) {

                        s = "Переустановить игру?";

                    } else {
                        s = "Reinstall game?";


                    }


                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(null, s, "Warning", dialogButton);
                    if (dialogResult == 0) {
                        System.out.println("Yes option");

                    } else {
                        System.out.println("No Option");
                        return;

                    }
                }






                Desktop desktop = Desktop.getDesktop();

                Main.frame.enable(false);



                if(!ping.check_server_ping()){
                    Main.frame.enable(true);
                    Utility.alert("Проверьте соединение с сетью или используйте VPN.","Check your network connection or use a VPN.");
                    return;
                }


                Utility.deleteDirectory(new File("Victoria 2"));
                //Utility.copyDirectory("Victoria 2\\mod","mod");





                if (!new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II").exists()) {

                    System.out.println("vic 2 dir not exist");

                    new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II").mkdirs();

                }

                if (!new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\0").exists()) {

                    System.out.println("vic 2 dir not exist");

                    new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\0").mkdirs();

                }
                if (!new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1").exists()) {

                    System.out.println("vic 2 dir not exist");

                    new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1").mkdirs();

                }
                if (!new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2").exists()) {

                    System.out.println("vic 2 dir not exist");

                    new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2").mkdirs();

                }
                if (!new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3").exists()) {

                    System.out.println("vic 2 dir not exist");

                    new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3").mkdirs();

                }
                if (!new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\4").exists()) {

                    System.out.println("vic 2 dir not exist");

                    new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\4").mkdirs();

                }








                try {
                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\settings.txt"));

                } catch (IOException ex) {

                    throw new RuntimeException(ex);
                }  finally {

                            System.out.println("starting load victoria 2");


                            try {
                                Runtime.getRuntime().exec("taskkill /F /IM v2game.exe");
                                //desktop.open(new File("launcher\\V2_Clear.bat"));
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }





                            new Thread(new Runnable() {
                                @Override
                                public void run() {

                                    //Utility.deleteDir(new File("Victoria 2"));




                                    new Main(Main.victoria_2_link, "Victoria 2.zip", "Victoria 2");


                                    Thread_download_game thread_download_game = new Thread_download_game(Main.victoria_2_link, "Victoria 2.zip");
                                    thread_download_game.start();


                                    try {
                                        Thread.sleep(3000);
                                    } catch (InterruptedException ex) {
                                        throw new RuntimeException(ex);
                                    }


                                    while (Thread_download_game.is_loading) {

                                        try {
                                            Thread.sleep(1000);
                                        } catch (InterruptedException ex) {
                                            throw new RuntimeException(ex);
                                        }
                                    }

                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException ex) {
                                        throw new RuntimeException(ex);
                                    }

                                    Utility.extractFolder("Victoria 2.zip", "Victoria 2");
                                    /*
                                    try {
                                        Utility.copyDirectory(new File("Victoria 2 temp\\Victoria 2"),new File("Victoria 2"));
                                    } catch (IOException ex) {
                                        throw new RuntimeException(ex);
                                    }

                                     */
                                    //Utility.deleteDir(new File("Victoria 2 temp"));
                                    Utility.deleteDir(new File("Victoria 2.zip"));


                                    Main.load_frame.dispose();
                                    Main.frame.enable(true);



                                }

                            }).start();


                            //System.out.println("start download");
                            //desktop.open(new File("launcher\\Resourse\\Vic 2.bat"));





                    Main.frame.enable(true);
                } // шестеренка
                System.out.println("enable frame");
                Main.frame.enable(true);

                //File file1 = new File("Victoria 2/1.bat");






                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map"));

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\0\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\0\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\0\\map"));

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\map"));

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\map"));

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\map"));

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\4\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\4\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\4\\map"));


                try {
                    Utility.copyDirectory(new File("mod"),new File("Victoria 2\\mod"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                Utility.deleteDirectory(new File("mod"));
















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

                String url4 = "https://www.googleapis.com/drive/v3/files/1mCQ9demPZx_0KkonOsgmWdVsybd1AAwK?alt=media&key=AIzaSyAbEeSvujd4zevMVTqOzGaYV_siZXU6f6A";



                https://drive.google.com/u/0/uc?id=1mCQ9demPZx_0KkonOsgmWdVsybd1AAwK&export=download
                AIzaSyAbEeSvujd4zevMVTqOzGaYV_siZXU6f6A


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


            if(vic_2_launcher_selected && e.getX()>131 && e.getY()>296 && e.getX()<376 && e.getY() < 343 && !paintComponent.multi_player){

                try {

                    System.out.println("запуск мода 1");

                    File file1 = new File("Victoria 2/1.bat");
                    if (!file1.exists()) {
                        System.out.println("1");
                        Utility.alert("ОШИБКА - Переустановите мод или игру", "ERROR - reinstall game or mod");
                        return;
                    }


                    Desktop desktop = Desktop.getDesktop();
                    File file = new File("Victoria 2/mod/1");
                    if (!file.isDirectory()) {
                        System.out.println("2");
                        Utility.alert("ОШИБКА - Установите мод", "ERROR - install mod first");
                        return;
                    }


                    new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\gfx\\flags").mkdirs();
                    try {
                        Utility.copyDirectory(new File("Victoria 2/mod/1/flags"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\gfx\\flags"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } finally {

                        Thread_close_game thread_close_game = new Thread_close_game();
                        thread_close_game.start();

                        Copying.copying("Victoria 2/1.bat", "Victoria 2/mod/1/time", new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\map\\cache\\time", new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\map");
                        Main.frame.enable();

                    }

                } catch (Exception c){

                    System.out.println("1");

                }finally {
                    Main.frame.enable();
                }



            } //  запуск мода 1

            if(vic_2_launcher_selected && e.getX()>127 && e.getY()>410 && e.getX()<375 && e.getY() < 458 && !paintComponent.multi_player){
                System.out.println("запуск мода 2");

                File file1 = new File("Victoria 2/2.bat");
                if (!file1.exists()) {
                    Utility.alert("ОШИБКА - Переустановите мод или игру","ERROR - reinstall game or mod");
                    return;
                }

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2/mod/2");

                if(!file.isDirectory()){

                    Utility.alert("ОШИБКА - Установите мод","ERROR - install mod first");
                    return;
                }


                new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\gfx\\flags").mkdirs();

                try {
                    Utility.copyDirectory(new File("Victoria 2\\mod\\2\\flags"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\gfx\\flags"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } finally {

                    Thread_close_game thread_close_game = new Thread_close_game();
                    thread_close_game.start();


                    Copying.copying("Victoria 2\\2.bat","Victoria 2/time",new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map",new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Documents\\Paradox Interactive\\Victoria II");
                    Main.frame.enable();

                }


                
            } //  запуск мода 2

            if(vic_2_launcher_selected && e.getX()>129 && e.getY()>469 && e.getX()<376 && e.getY() < 515 && !paintComponent.multi_player){


                    System.out.println("запуск мода 3");
                    File file1 = new File("Victoria 2/3.bat");
                    if (!file1.exists()) {
                        Utility.alert("ОШИБКА - Переустановите мод или игру", "ERROR - reinstall game or mod");
                        return;
                    }

                    Desktop desktop = Desktop.getDesktop();
                    File file = new File("Victoria 2/mod/3");

                    if (!file.isDirectory()) {

                        Utility.alert("ОШИБКА - Установите мод", "ERROR - install mod first");
                        return;
                    }


                    new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\gfx\\flags").mkdirs();

                    try {
                        Utility.copyDirectory(new File("Victoria 2\\mod\\3\\flags"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\gfx\\flags"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } finally {

                        Thread_close_game thread_close_game = new Thread_close_game();
                        thread_close_game.start();


                        Copying.copying("Victoria 2\\3.bat", "Victoria 2/time", new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map", new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Documents\\Paradox Interactive\\Victoria II");
                        Main.frame.enable();

                    }

                /*

                File file1 = new File("Victoria 2/2.bat");
                if (!file1.exists()) {
                    Utility.alert("ОШИБКА - Переустановите мод или игру","ERROR - reinstall game or mod");
                    return;
                }

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2/mod/DoDDF");

                if(!file.isDirectory()){

                    Utility.alert("ОШИБКА - Установите мод","ERROR - install mod first");
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

                 */


            } //  запуск мода 3

            if(vic_2_launcher_selected && e.getX()>127 && e.getY()>526 && e.getX()<376 && e.getY() < 575 && !paintComponent.multi_player){


                System.out.println("запуск мода 4");
                File file1 = new File("Victoria 2/4.bat");
                if (!file1.exists()) {
                    Utility.alert("ОШИБКА - Переустановите мод или игру", "ERROR - reinstall game or mod");
                    return;
                }

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2/mod/4");

                if (!file.isDirectory()) {

                    Utility.alert("ОШИБКА - Установите мод", "ERROR - install mod first");
                    return;
                }


                new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\4\\gfx\\flags").mkdirs();

                try {
                    Utility.copyDirectory(new File("Victoria 2\\mod\\4\\flags"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\4\\gfx\\flags"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } finally {

                    Thread_close_game thread_close_game = new Thread_close_game();
                    thread_close_game.start();


                    Copying.copying("Victoria 2\\4.bat", "Victoria 2/time", new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map", new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Documents\\Paradox Interactive\\Victoria II");
                    Main.frame.enable();

                }

                /*

                File file1 = new File("Victoria 2/2.bat");
                if (!file1.exists()) {
                    Utility.alert("ОШИБКА - Переустановите мод или игру","ERROR - reinstall game or mod");
                    return;
                }

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2/mod/DoDDF");

                if(!file.isDirectory()){

                    Utility.alert("ОШИБКА - Установите мод","ERROR - install mod first");
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

                 */


            } //  запуск мода 4

            if(vic_2_launcher_selected && e.getX()>128 && e.getY()>583 && e.getX()<375 && e.getY() < 632 && !paintComponent.multi_player){


                System.out.println("запуск мода 5");
                File file1 = new File("Victoria 2/5.bat");
                if (!file1.exists()) {
                    Utility.alert("ОШИБКА - Переустановите мод или игру", "ERROR - reinstall game or mod");
                    return;
                }

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2/mod/5");

                if (!file.isDirectory()) {

                    Utility.alert("ОШИБКА - Установите мод", "ERROR - install mod first");
                    return;
                }


                new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\5\\gfx\\flags").mkdirs();

                try {
                    Utility.copyDirectory(new File("Victoria 2\\mod\\5\\flags"), new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\5\\gfx\\flags"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } finally {

                    Thread_close_game thread_close_game = new Thread_close_game();
                    thread_close_game.start();


                    Copying.copying("Victoria 2\\5.bat", "Victoria 2/time", new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map", new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Documents\\Paradox Interactive\\Victoria II");
                    Main.frame.enable();

                }

                /*

                File file1 = new File("Victoria 2/2.bat");
                if (!file1.exists()) {
                    Utility.alert("ОШИБКА - Переустановите мод или игру","ERROR - reinstall game or mod");
                    return;
                }

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2/mod/DoDDF");

                if(!file.isDirectory()){

                    Utility.alert("ОШИБКА - Установите мод","ERROR - install mod first");
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

                 */


            } //  запуск мода 5


            if(vic_2_launcher_selected && e.getX()>382 && e.getY()>294 && e.getX()<433 && e.getY() < 345 && !paintComponent.multi_player){
                    System.out.println("отчистить_кеш_игры_метла 1");

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\map"));

                    Utility.alert("Кеш очищен","cache cleared");

            } //  метла_1

            if(vic_2_launcher_selected && e.getX()>383 && e.getY()>411 && e.getX()<432 && e.getY() < 460 && !paintComponent.multi_player){
                System.out.println("отчисттиь мод 2");



                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\map"));



                Utility.alert("Кеш очищен","cache cleared");
            } //  метла_2

            if(vic_2_launcher_selected && e.getX()>383 && e.getY()>469 && e.getX()<433 && e.getY() < 517 && !paintComponent.multi_player){
                System.out.println("отчитисть мод 3");

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\map"));



                Utility.alert("Кеш очищен","cache cleared");
            } //  метла_3

            if(vic_2_launcher_selected && e.getX()>383 && e.getY()>527 && e.getX()<432 && e.getY() < 577 && !paintComponent.multi_player){
                System.out.println("отчитисть мод 4");
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\4\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\4\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\4\\map"));

                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\gfx"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\logs"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\map"));



                Utility.alert("Кеш очищен","cache cleared");
            } //  метла_4

            if(vic_2_launcher_selected && e.getX()>382 && e.getY()>585 && e.getX()<434 && e.getY() < 634 && !paintComponent.multi_player){
                System.out.println("отчитисть мод 5");
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\5\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\5\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\5\\map"));

                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\gfx"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\logs"));
                //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\map"));



                Utility.alert("Кеш очищен","cache cleared");
            } //  метла_5


            if(vic_2_launcher_selected && e.getX()>169 && e.getY()>642 && e.getX()<218 && e.getY() < 691 && !paintComponent.multi_player){
                System.out.println("сброс_настроек_шестеренка");

                try {
                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\settings.txt"));

                } catch (IOException ex) {

                    throw new RuntimeException(ex);
                }finally {
                    try {
                        Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\0\\settings.txt"));

                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } finally {
                        try {
                            Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\settings.txt"));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        } finally {
                            try {
                                Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\settings.txt"));
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            } finally {

                                try {
                                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\3\\settings.txt"));
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                } finally {

                                    Utility.alert("Настройки сброшены","settings reseted");

                                }



                            }


                        }
                    }

                }

            } //  шестеренка


            if(vic_2_launcher_selected && e.getX()>70 && e.getY()>292 && e.getX()<120 && e.getY() < 342 && !paintComponent.multi_player){





                try {
                    System.out.println("скачать мод 1");

                    Main.frame.enable(false);


                    if (!ping.check_server_ping()) {
                        Main.frame.enable(true);
                        Utility.alert("Проверьте соединение с сетью или используйте VPN.", "Check your network connection or use a VPN.");
                        return;
                    }

                    //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1"));

                    Desktop desktop = Desktop.getDesktop();
                    File file = new File("Victoria 2");
                    Utility.deleteDirectory(new File("Victoria 2\\mod\\1"));
                    Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\gfx"));
                    Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\logs"));
                    Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1\\map"));
                    System.out.println("кеш отчищен");

                    try {
                        //desktop.open(new File("launcher\\V2_Clear.bat"));
                        Runtime.getRuntime().exec("taskkill /F /IM v2game.exe");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    try {

                        //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\settings.txt"));
                    } finally {
                        try {
                            //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt"));
                        } finally {
                            try {
                                //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt"));
                            } finally {

                                if (file.isDirectory()) {


                                    new Thread(new Runnable() {
                                        @Override
                                        public void run() {


                                            new Main(Main.victoria_2_1_mod, "1.zip", "Victoria 2\\mod\\1");


                                            Thread_download_game thread_download_game = new Thread_download_game(Main.victoria_2_1_mod, "1.zip");
                                            thread_download_game.start();


                                            try {
                                                Thread.sleep(3000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);
                                            }


                                            while (Thread_download_game.is_loading) {

                                                try {
                                                    Thread.sleep(1000);
                                                    System.out.println("is loading");
                                                } catch (InterruptedException ex) {
                                                    throw new RuntimeException(ex);
                                                }
                                            }

                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);

                                            }
                                            System.out.println("START EXTRACTION");
                                            Utility.extractFolder("1.zip", "tmp");
                                            System.out.println("COMPLETE EXTRACTION");

                                            try {
                                                new File("Victoria 2\\mod").mkdirs();
                                                Utility.deleteDirectory(new File("Victoria 2\\mod\\1"));
                                                Utility.copyDirectory(new File("tmp\\1"), new File("Victoria 2\\mod\\1"));
                                                Utility.copyFile(new File("tmp\\1.mod"), new File("Victoria 2\\mod\\1.mod"));

                                            } catch (IOException ex) {
                                                throw new RuntimeException(ex);
                                            }


                                            Utility.deleteDir(new File("tmp"));
                                            Utility.deleteDir(new File("1.zip"));


                                            Main.load_frame.dispose();
                                            Main.frame.enable();


                                        }

                                    }).start();
                                } else Utility.alert("ОШИБКА - Установите игру", "ERROR - Install game first");


                            }
                        }

                    } // шестеренка + запуск скачки мода
                } finally {
                    Main.frame.enable();
                }




            } //  скачать мод 001

            if(vic_2_launcher_selected && e.getX()>71 && e.getY()>411 && e.getX()<120 && e.getY() < 459 && !paintComponent.multi_player){





                try {
                    System.out.println("скачать мод 2");

                    Main.frame.enable(false);


                    if (!ping.check_server_ping()) {
                        Main.frame.enable(true);
                        Utility.alert("Проверьте соединение с сетью или используйте VPN.", "Check your network connection or use a VPN.");
                        return;
                    }

                    //Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\1"));

                    Desktop desktop = Desktop.getDesktop();
                    File file = new File("Victoria 2");
                    Utility.deleteDirectory(new File("Victoria 2\\mod\\2"));
                    Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\gfx"));
                    Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\logs"));
                    Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\2\\map"));
                    System.out.println("кеш отчищен");

                    try {
                        //desktop.open(new File("launcher\\V2_Clear.bat"));
                        Runtime.getRuntime().exec("taskkill /F /IM v2game.exe");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    try {

                        //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\settings.txt"));
                    } finally {
                        try {
                            //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\BDSHFM\\settings.txt"));
                        } finally {
                            try {
                                //Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\DoDDF\\settings.txt"));
                            } finally {

                                if (file.isDirectory()) {


                                    new Thread(new Runnable() {
                                        @Override
                                        public void run() {


                                            new Main(Main.victoria_2_2_mod, "2.zip", "Victoria 2\\mod\\2");


                                            Thread_download_game thread_download_game = new Thread_download_game(Main.victoria_2_2_mod, "2.zip");
                                            thread_download_game.start();


                                            try {
                                                Thread.sleep(3000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);
                                            }


                                            while (Thread_download_game.is_loading) {

                                                try {
                                                    Thread.sleep(1000);
                                                    System.out.println("is loading");
                                                } catch (InterruptedException ex) {
                                                    throw new RuntimeException(ex);
                                                }
                                            }

                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);

                                            }
                                            System.out.println("START EXTRACTION");
                                            Utility.extractFolder("2.zip", "tmp");
                                            System.out.println("COMPLETE EXTRACTION");

                                            try {
                                                new File("Victoria 2\\mod").mkdirs();
                                                Utility.deleteDirectory(new File("Victoria 2\\mod\\2"));
                                                Utility.copyDirectory(new File("tmp\\2"), new File("Victoria 2\\mod\\2"));
                                                Utility.copyFile(new File("tmp\\2.mod"), new File("Victoria 2\\mod\\2.mod"));

                                            } catch (IOException ex) {
                                                throw new RuntimeException(ex);
                                            }


                                            Utility.deleteDir(new File("tmp"));
                                            Utility.deleteDir(new File("2.zip"));


                                            Main.load_frame.dispose();
                                            Main.frame.enable();


                                        }

                                    }).start();
                                } else Utility.alert("ОШИБКА - Установите игру", "ERROR - Install game first");


                            }
                        }

                    } // шестеренка + запуск скачки мода
                } finally {
                    Main.frame.enable();
                }




            } //  скачать мод 002

            if(vic_2_launcher_selected && e.getX()>71 && e.getY()>466 && e.getX()<120 && e.getY() < 517 && !paintComponent.multi_player){

                try {
                    System.out.println("скачать мод 3");
                    Main.frame.enable(false);
                    if (!ping.check_server_ping()) {
                        Main.frame.enable(true);
                        Utility.alert("Проверьте соединение с сетью или используйте VPN.", "Check your network connection or use a VPN.");
                        return;
                    }

                    Desktop desktop = Desktop.getDesktop();
                    File file = new File("Victoria 2");
                    Utility.deleteDirectory(new File("Victoria 2\\mod\\3"));

                    try {
                        //desktop.open(new File("launcher\\V2_Clear.bat"));
                        Runtime.getRuntime().exec("taskkill /F /IM v2game.exe");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

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

                                if (file.isDirectory()) {

                                    new Thread(new Runnable() {
                                        @Override
                                        public void run() {


                                            new Main(Main.victoria_2_3_mod, "3.zip", "Victoria 2\\mod\\3");


                                            Thread_download_game thread_download_game = new Thread_download_game(Main.victoria_2_3_mod, "3.zip");
                                            thread_download_game.start();


                                            try {
                                                Thread.sleep(3000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);
                                            }


                                            while (Thread_download_game.is_loading) {

                                                try {
                                                    Thread.sleep(1000);
                                                } catch (InterruptedException ex) {
                                                    throw new RuntimeException(ex);
                                                }
                                            }

                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);
                                            }

                                            Utility.extractFolder("3.zip", "tmp");

                                            try {
                                                new File("Victoria 2\\mod").mkdirs();
                                                Utility.deleteDirectory(new File("Victoria 2\\mod\\3"));
                                                Utility.copyDirectory(new File("tmp\\3"), new File("Victoria 2\\mod\\3"));
                                                Utility.copyFile(new File("tmp\\3.mod"), new File("Victoria 2\\mod\\3.mod"));
                                            } catch (IOException ex) {
                                                throw new RuntimeException(ex);
                                            }


                                            Utility.deleteDir(new File("tmp"));
                                            Utility.deleteDir(new File("3.zip"));


                                            Main.load_frame.dispose();
                                            Main.frame.enable(true);


                                        }

                                    }).start();
                                } else Utility.alert("ОШИБКА - Установите игру", "ERROR - Install game first");

                            }
                        }

                    } // шестеренка + установка мода додф
                } finally {
                    Main.frame.enable();
                }







            } //  скачать мод 003

            if(vic_2_launcher_selected && e.getX()>71 && e.getY()>526 && e.getX()<120 && e.getY() < 574 && !paintComponent.multi_player){

                try {


                    Main.frame.enable(false);

                    if (!ping.check_server_ping()) {
                        Main.frame.enable(true);
                        Utility.alert("Проверьте соединение с сетью или используйте VPN.", "Check your network connection or use a VPN.");
                        return;
                    }

                    System.out.println("скачать мод 4");


                    Desktop desktop = Desktop.getDesktop();
                    File file = new File("Victoria 2");

                    try {
                        //desktop.open(new File("launcher\\V2_Clear.bat"));
                        Runtime.getRuntime().exec("taskkill /F /IM v2game.exe");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    Utility.deleteDirectory(new File("Victoria 2\\mod\\4"));

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

                                if (file.isDirectory()) {

                                    new Thread(new Runnable() {
                                        @Override
                                        public void run() {


                                            new Main(Main.victoria_2_4_mod, "4.zip", "Victoria 2\\mod\\4");


                                            Thread_download_game thread_download_game = new Thread_download_game(Main.victoria_2_4_mod, "4.zip");
                                            thread_download_game.start();


                                            try {
                                                Thread.sleep(3000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);
                                            }


                                            while (Thread_download_game.is_loading) {

                                                try {
                                                    Thread.sleep(1000);
                                                } catch (InterruptedException ex) {
                                                    throw new RuntimeException(ex);
                                                }
                                            }

                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);
                                            }
                                            Main.frame.enable(false);

                                            Utility.extractFolder("4.zip", "tmp");

                                            try {
                                                new File("Victoria 2\\mod").mkdirs();
                                                Utility.deleteDirectory(new File("Victoria 2\\mod\\4"));
                                                Utility.copyDirectory(new File("tmp\\4"), new File("Victoria 2\\mod\\4"));
                                                Utility.copyFile(new File("tmp\\4.mod"), new File("Victoria 2\\mod\\4.mod"));
                                            } catch (IOException ex) {
                                                throw new RuntimeException(ex);
                                            }


                                            Utility.deleteDir(new File("tmp"));
                                            Utility.deleteDir(new File("4.zip"));


                                            Main.load_frame.dispose();
                                            Main.frame.enable(true);


                                        }

                                    }).start();
                                } else Utility.alert("ОШИБКА - Установите игру", "ERROR - Install game first");

                            }
                        }

                    } // шестеренка + установка мода додф


                /*

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2");

                try {
                    desktop.open(new File("launcher\\V2_Clear.bat"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

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

                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {




                                        new Main(Main.victoria_2_DoDF, "DoDDF.zip", "Victoria 2\\mod\\DoDDF");


                                        Thread_download_game thread_download_game = new Thread_download_game(Main.victoria_2_DoDF, "DoDDF.zip");
                                        thread_download_game.start();


                                        try {
                                            Thread.sleep(3000);
                                        } catch (InterruptedException ex) {
                                            throw new RuntimeException(ex);
                                        }


                                        while (Thread_download_game.is_loading) {

                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);
                                            }
                                        }

                                        try {
                                            Thread.sleep(1000);
                                        } catch (InterruptedException ex) {
                                            throw new RuntimeException(ex);
                                        }

                                        Utility.extractFolder("DoDDF.zip", "tmp");

                                        try {
                                            new File("Victoria 2\\mod").mkdirs();
                                            Utility.deleteDirectory(new File("Victoria 2\\mod\\DoDDF"));
                                            Utility.copyDirectory(new File("tmp\\DoDDF"),new File("Victoria 2\\mod\\DoDDF"));
                                            Utility.copyFile(new File("tmp\\DoDDF.mod"),new File("Victoria 2\\mod\\DoDDF.mod"));
                                        } catch (IOException ex) {
                                            throw new RuntimeException(ex);
                                        }


                                        Utility.deleteDir(new File("tmp"));
                                        Utility.deleteDir(new File("DoDDF.zip"));


                                        Main.load_frame.dispose();



                                    }

                                }).start();
                            } else Utility.alert("ОШИБКА - Установите игру","ERROR - Install game first");

                        }
                    }

                } // шестеренка + установка мода додф

                 */
                } finally {
                    Main.frame.enable();
                }






            } //  скачать мод 004

            if(vic_2_launcher_selected && e.getX()>71 && e.getY()>583 && e.getX()<120 && e.getY() < 634 && !paintComponent.multi_player){
                try {
                    Main.frame.enable(false);

                    if (!ping.check_server_ping()) {
                        Main.frame.enable(true);
                        Utility.alert("Проверьте соединение с сетью или используйте VPN.", "Check your network connection or use a VPN.");
                        return;
                    }

                    System.out.println("скачать мод 5");


                    Desktop desktop = Desktop.getDesktop();
                    File file = new File("Victoria 2");

                    try {
                        //desktop.open(new File("launcher\\V2_Clear.bat"));
                        Runtime.getRuntime().exec("taskkill /F /IM v2game.exe");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    Utility.deleteDirectory(new File("Victoria 2\\mod\\5"));

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

                                if (file.isDirectory()) {

                                    new Thread(new Runnable() {
                                        @Override
                                        public void run() {


                                            new Main(Main.victoria_2_5_mod, "5.zip", "Victoria 2\\mod\\5");


                                            Thread_download_game thread_download_game = new Thread_download_game(Main.victoria_2_5_mod, "5.zip");
                                            thread_download_game.start();


                                            try {
                                                Thread.sleep(3000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);
                                            }


                                            while (Thread_download_game.is_loading) {

                                                try {
                                                    Thread.sleep(1000);
                                                } catch (InterruptedException ex) {
                                                    throw new RuntimeException(ex);
                                                }
                                            }

                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);
                                            }
                                            Main.frame.enable(false);

                                            Utility.extractFolder("5.zip", "tmp");

                                            try {
                                                new File("Victoria 2\\mod").mkdirs();
                                                Utility.deleteDirectory(new File("Victoria 2\\mod\\5"));
                                                Utility.copyDirectory(new File("tmp\\5"), new File("Victoria 2\\mod\\5"));
                                                Utility.copyFile(new File("tmp\\5.mod"), new File("Victoria 2\\mod\\5.mod"));
                                            } catch (IOException ex) {
                                                throw new RuntimeException(ex);
                                            }


                                            Utility.deleteDir(new File("tmp"));
                                            Utility.deleteDir(new File("5.zip"));


                                            Main.load_frame.dispose();
                                            Main.frame.enable(true);


                                        }

                                    }).start();
                                } else Utility.alert("ОШИБКА - Установите игру", "ERROR - Install game first");

                            }
                        }

                    } // шестеренка + установка мода додф


                /*

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2");

                try {
                    desktop.open(new File("launcher\\V2_Clear.bat"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

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

                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {




                                        new Main(Main.victoria_2_DoDF, "DoDDF.zip", "Victoria 2\\mod\\DoDDF");


                                        Thread_download_game thread_download_game = new Thread_download_game(Main.victoria_2_DoDF, "DoDDF.zip");
                                        thread_download_game.start();


                                        try {
                                            Thread.sleep(3000);
                                        } catch (InterruptedException ex) {
                                            throw new RuntimeException(ex);
                                        }


                                        while (Thread_download_game.is_loading) {

                                            try {
                                                Thread.sleep(1000);
                                            } catch (InterruptedException ex) {
                                                throw new RuntimeException(ex);
                                            }
                                        }

                                        try {
                                            Thread.sleep(1000);
                                        } catch (InterruptedException ex) {
                                            throw new RuntimeException(ex);
                                        }

                                        Utility.extractFolder("DoDDF.zip", "tmp");

                                        try {
                                            new File("Victoria 2\\mod").mkdirs();
                                            Utility.deleteDirectory(new File("Victoria 2\\mod\\DoDDF"));
                                            Utility.copyDirectory(new File("tmp\\DoDDF"),new File("Victoria 2\\mod\\DoDDF"));
                                            Utility.copyFile(new File("tmp\\DoDDF.mod"),new File("Victoria 2\\mod\\DoDDF.mod"));
                                        } catch (IOException ex) {
                                            throw new RuntimeException(ex);
                                        }


                                        Utility.deleteDir(new File("tmp"));
                                        Utility.deleteDir(new File("DoDDF.zip"));


                                        Main.load_frame.dispose();



                                    }

                                }).start();
                            } else Utility.alert("ОШИБКА - Установите игру","ERROR - Install game first");

                        }
                    }

                } // шестеренка + установка мода додф

                 */
                } finally {
                    Main.frame.enable();
                }






            } //  скачать мод 005


            if(vic_2_launcher_selected && e.getX()>383 && e.getY()>699 && e.getX()<434 && e.getY() < 747 && !paintComponent.multi_player){

                Main.frame.disable();

                Utility.deleteDirectory(new File("Victoria 2"));

                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\gfx"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\logs"));
                Utility.deleteDirectory(new File(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria II\\map"));
                Main.frame.enable();

                Utility.alert("Раздел удален","section removed");




            } // delete all

            if(vic_2_launcher_selected && e.getX()>225 && e.getY()>641 && e.getX()<274 && e.getY() < 690 && !paintComponent.multi_player){

                System.out.println("war analyzer");




                Desktop desktop = Desktop.getDesktop();


                try {
                    desktop.open(new File("Victoria 2/VickyAnalyzers/War Analyzer.bat"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }








            } // war anylyzer



            if(vic_2_launcher_selected && e.getX()>285 && e.getY()>641 && e.getX()<333 && e.getY() < 689 && !paintComponent.multi_player){

                System.out.println("eco analyzer");




                Desktop desktop = Desktop.getDesktop();


                try {
                    desktop.open(new File("Victoria 2/VickyAnalyzers/Economy Analyzer.bat"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }








            } // eco anylyzer

            /*

            if(vic_2_launcher_selected && e.getX()>419 && e.getY()>138 && e.getX()<484 && e.getY() < 212 && !paintComponent.multi_player){


                Desktop desktop = Desktop.getDesktop();

                try {
                    desktop.open(new File("launcher\\Resourse\\L_23.bat"));
                    System.out.println("1231231");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                System.exit(0);
            }// update launcher

             */


            if((vic_2_launcher_selected) && e.getX()>69 && e.getY()>699 && e.getX()<120 && e.getY() < 749){

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
            }// назад для вик 2



            //----------------------------------------------------------------------------------------------------------------------------------------------------
            if((vic_3_launcher_selected ) && e.getX()>69 && e.getY()>699 && e.getX()<120 && e.getY() < 749){

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
            //----------------------------------------------------------------------------------------------------------------------------------------------------



            if(vic_3_launcher_selected && e.getX()>227 && e.getY()>700 && e.getX()<275 && e.getY() < 748){






                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://vk.com/23int"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (URISyntaxException ex) {
                        throw new RuntimeException(ex);
                    }
                }



            } //// вк кнопка

            if(vic_3_launcher_selected && e.getX()>389 && e.getY()>288 && e.getX()<441 && e.getY() < 330 ){

                System.out.println("change lang");

                Graphic.change_lang_to_eng();
                Language.sync_language("Victoria 2\\localisation\\");
                Language.sync_language("Victoria 2\\mod\\DoDDF\\localisation\\");
                Language.sync_language("Victoria 2\\mod\\STAHL_MOD\\localisation\\");



            } // смена языка

            if(vic_3_launcher_selected && e.getX()>138 && e.getY()>235 && e.getX()<383 && e.getY() < 333){

                try {
                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\content_load.json"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } finally {

                    File file = new File("Victoria 3");
                    if (!file.exists()) {
                        Utility.alert("Скачайте игру","Download game");
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

                Desktop desktop = Desktop.getDesktop();
                File file = new File("Victoria 2");
                Main.frame.enable(false);

                try {
                    desktop.open(new File("launcher\\V3_Clear.bat"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }



                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, "Игра будет установлена в папку где находится лаунчер и займёт около 15 гигов. Запустить установку?", "Warning", dialogButton);
                if(dialogResult == 0) {
                    System.out.println("Yes option");

                } else {
                    System.out.println("No Option");
                    return;

                }


                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        Utility.deleteDir(new File("Victoria 3"));

                        new Main(Main.victoria_3_link, "Victoria 3.zip", "Victoria 3");



                        Thread_download_game thread_download_game = new Thread_download_game(Main.victoria_3_link, "Victoria 3.zip");
                        thread_download_game.start();

                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }


                        while (Thread_download_game.is_loading) {

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                throw new RuntimeException(ex);
                            }
                        }

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }


/*
               while(Thread_download_game.is_loading){

                    JOptionPane jop = new JOptionPane();
                    jop.setMessageType(JOptionPane.PLAIN_MESSAGE);
                    try {

                        StringBuilder load_indicator = new StringBuilder();
                        int how_much_persent_loaded = new BigInteger(String.valueOf(Files.size(Paths.get("dlc.zip")))).divide(one_persent).intValue();
                        for (int i = 0; i < how_much_persent_loaded/3; i++) {

                            load_indicator.append("|");

                        }
                        jop.setMessage(load_indicator.toString() +"\n"+ "                                     "+how_much_persent_loaded + "%");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    final JDialog dialog = jop.createDialog(null, "Message");
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {

                                //Thread.sleep(1500);
                            } catch (Exception e) {
                            }
                            dialog.dispose();
                        }

                    }).start();

                    dialog.setVisible(true);




                }

 */

                        Utility.extractFolder("Victoria 3.zip", "Victoria 3");




                        Utility.deleteDir(new File("Victoria 3.zip"));

                        Main.load_frame.dispose();
                        System.out.println("vic 3 download ended");
                        Main.frame.enable(true);



                    }

                }).start();






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
                Utility.alert("Кеш очищен","Cache cleared");
                System.out.println("metla 1");
            } // metla 1

            if(vic_3_launcher_selected && e.getX()>138 && e.getY()>427 && e.getX()<383 && e.getY() < 473){





                //String path = new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\mod\\NVBM";

                File file1 = new File("Victoria 3");
                if (!file1.exists()) {
                    Utility.alert("Скачайте игру","Download game");
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
                    Utility.alert("Скачайте мод","Download mod");
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
            } // run NVMB

            if(vic_3_launcher_selected && e.getX()>80 && e.getY()>428 && e.getX()<128 && e.getY() < 474){

                Desktop desktop = Desktop.getDesktop();
                Main.frame.enable(false);

                try {
                    desktop.open(new File("launcher\\V3_Clear.bat"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }



                File file = new File("Victoria 3");
                if (!file.exists()) {
                    Utility.alert("Скачайте игру","Download game");
                    return;
                }



                System.out.println("start download nvmb");
                new Thread(new Runnable() {
                    @Override
                    public void run() {




                        new Main(Main.victoria_3_nvmb, "NVMB.zip", "Victoria 3\\mod\\NVMB");


                        Thread_download_game thread_download_game = new Thread_download_game(Main.victoria_3_nvmb, "NVMB.zip");
                        thread_download_game.start();


                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }


                        while (Thread_download_game.is_loading) {

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                throw new RuntimeException(ex);
                            }
                        }

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }

                        Utility.extractFolder("NVMB.zip", "Victoria 3\\mod\\NVBM");
                            /*
                            try {
                                Utility.copyDirectory(new File("Victoria 2 temp\\Victoria 2"),new File("Victoria 2"));
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }

                             */
                        //Utility.deleteDir(new File("Victoria 2 temp"));
                        Utility.deleteDir(new File("NVMB.zip"));


                        Main.load_frame.dispose();
                        Main.frame.enable(true);



                    }

                }).start();

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

                                                    Utility.alert("Настройки сброшены","Settings cleared");
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

            if(vic_3_launcher_selected && e.getX()>384 && e.getY()>698 && e.getX()<433 && e.getY() < 750){

                String s;
                String s2;

                if(Graphic.language_russian) {

                    s = "Вы действительно хотите удалить игру?";
                     s2 = "Удалить папку мода с игрой?";
                } else {
                     s = "Are you sure you want to uninstall the game?";
                     s2 = "Delete game mod folder?";

                }





                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(null, s, "Warning", dialogButton);
                if(dialogResult == 0) {
                    System.out.println("Yes option");

                } else {
                    System.out.println("No Option");
                    return;

                }

                int dialogButton1 = JOptionPane.YES_NO_OPTION;
                int dialogResult1 = JOptionPane.showConfirmDialog(null, s2, "Warning", dialogButton1);
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
                    Utility.alert("Раздел удален","Section removed");

                }










            } // delete all

            if(vic_3_launcher_selected && e.getX()>125 && e.getY()>611 && e.getX()<373 && e.getY() < 699){






                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://discord.gg/victoria-2-3-738309426905219155"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (URISyntaxException ex) {
                        throw new RuntimeException(ex);
                    }
                }



            } //// кнопка дискорда

            if (vic_3_launcher_selected && e.getX() > 74 && e.getY() > 285 && e.getX() < 123 && e.getY() < 335) {


                File file = new File("Victoria 3");
                if (!file.exists()) {
                    Utility.alert("Скачайте игру","Download game");
                    return;
                }




                new Thread(new Runnable() {
                    @Override
                    public void run() {


                        try {

                            Desktop desktop = Desktop.getDesktop();

                            try {
                                desktop.open(new File("launcher\\V3_Clear.bat"));
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }


                            System.out.println("dlc");



                            new Main(Main.dlc_link, "dlc.zip", "dlc");


                            Thread_download_game thread_download_game = new Thread_download_game(Main.dlc_link, "dlc.zip");
                            thread_download_game.start();


                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException ex) {
                                throw new RuntimeException(ex);
                            }


                            while (Thread_download_game.is_loading) {

                                Thread.sleep(1000);
                            }

                            Thread.sleep(1000);


/*
               while(Thread_download_game.is_loading){

                    JOptionPane jop = new JOptionPane();
                    jop.setMessageType(JOptionPane.PLAIN_MESSAGE);
                    try {

                        StringBuilder load_indicator = new StringBuilder();
                        int how_much_persent_loaded = new BigInteger(String.valueOf(Files.size(Paths.get("dlc.zip")))).divide(one_persent).intValue();
                        for (int i = 0; i < how_much_persent_loaded/3; i++) {

                            load_indicator.append("|");

                        }
                        jop.setMessage(load_indicator.toString() +"\n"+ "                                     "+how_much_persent_loaded + "%");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    final JDialog dialog = jop.createDialog(null, "Message");
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {

                                //Thread.sleep(1500);
                            } catch (Exception e) {
                            }
                            dialog.dispose();
                        }

                    }).start();

                    dialog.setVisible(true);




                }

 */

                            Utility.extractFolder("dlc.zip", "dlc");


                            try {
                                System.out.println("COPYING");
                                Utility.copyFile_2(new File("dlc\\binaries\\steam_api64.dll"), new File("Victoria 3\\binaries\\steam_api64.dll"));
                                Utility.copyFile_2(new File("dlc\\binaries\\steamclient64.dll"), new File("Victoria 3\\binaries\\steamclient64.dll"));
                                Utility.copyFile_2(new File("dlc\\binaries\\flt.ini"), new File("Victoria 3\\binaries\\flt.ini"));
                                Utility.copyDirectory(new File("dlc\\game\\dlc"), new File("Victoria 3\\game\\dlc"));
                                Utility.copyDirectory(new File("dlc\\game\\dlc_metadata"), new File("Victoria 3\\game\\dlc_metadata"));
                                Utility.copyDirectory(new File("dlc\\game\\soundtrack"), new File("Victoria 3\\game\\soundtrack"));
                                System.out.println("ONE");
                            } catch (IOException ex) {
                                System.out.println("ERROR");
                                throw new RuntimeException(ex);
                            }


                            Utility.deleteDir(new File("dlc"));
                            Utility.deleteDir(new File("dlc.zip"));


                        } catch (Exception c) {
                            System.out.println("ERROR");

                        } finally {

                            Main.load_frame.dispose();
                            Main.frame.enable();
                            Utility.deleteDir(new File("dlc.zip"));
                            Utility.deleteDir(new File("dlc"));
                        }
                        System.out.println("COMPLETED");
                    }

                }).start();
            } //DLC установка





            /*
            new Thread(new Runnable() {
                @Override
                public void run() {    }

            }).start();
             */


































        }


    }
}
