import java.awt.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class paintComponent {



    public static boolean multi_player = false;



    public static void repaint_all(Launcher launcher, Graphics g) throws IOException {


        if(!Main.the_choice_is_made) {
            if(Graphic.back_active_1) {
                g.drawImage(Graphic.background_2, 0, 0, launcher);
                return;
            }

            if(Graphic.back_active_2) {

                g.drawImage(Graphic.background_3, 0, 0, launcher);
                return;

            }
            g.drawImage(Graphic.background_1, 0, 0, launcher);

        } // первая страница


        if(Launcher.vic_2_launcher_selected) {

            g.drawImage(Graphic.vic_2_background, 0, 0, launcher);


            if(!Graphic.back) {
                g.drawImage(Graphic.back_vic2, 34, 623, launcher);
            } else g.drawImage(Graphic.back_vic2_active, 34, 623, launcher);
            g.setFont(new Font("Cambria", Font.ROMAN_BASELINE, 20));
            g.setColor(Color.ORANGE);

                //******************************





            if(multi_player == true){

                g.drawImage(Graphic.IP_Browser_Background,137, 175, launcher);


                if (!Graphic.refresh_ip_button) {
                    g.drawImage(Graphic.IP_Browser_RefreshButton, 209, 648, launcher);
                } else g.drawImage(Graphic.IP_Browser_RefreshButton_Active, 209, 648, launcher);




                if( layout_mp.page != 0) {
                    if (!Graphic.ip_button_left) {
                        g.drawImage(Graphic.IP_Browser_LeftArrow, 143, 650, launcher);
                    } else g.drawImage(Graphic.IP_Browser_LeftArrow_Active, 143, 650, launcher);
                }
                if(layout_mp.list_entity_mp.size()>layout_mp.page+6) {
                    if (!Graphic.ip_button_right) {
                        g.drawImage(Graphic.IP_Browser_RightArrow, 323 - 5, 650, launcher);
                    } else g.drawImage(Graphic.IP_Browser_RightArrow_Active, 323 - 5, 650, launcher);
                }











                if(layout_mp.list_entity_mp.size() > 0 ){

                    if(layout_mp.list_entity_mp.size()>= 0+layout_mp.page) {
                        if(!Graphic.entry_1) g.drawImage(Graphic.IP_Browser_Entry, 144, 183, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 183, launcher);
                        if(layout_mp.page == 0){
                            g.drawString(layout_mp.list_entity_mp.get(0 + layout_mp.page).name.substring(1), 159, 205);
                        } else g.drawString(layout_mp.list_entity_mp.get(0 + layout_mp.page).name, 159, 205);
                        g.drawString(layout_mp.list_entity_mp.get(0 + layout_mp.page).ip, 159, 250);

                        //InetAddress address = InetAddress.getByName(layout_mp.list_entity_mp.get(0 + layout_mp.page).ip);

                        if(layout_mp.list_entity_mp.get(0+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,345,209,launcher);
                        } else g.drawImage(Graphic.red,345,209,launcher);




                    }



                }

                if(layout_mp.list_entity_mp.size() > 1 ){

                    if(layout_mp.list_entity_mp.size()> 1+layout_mp.page) {
                        if(!Graphic.entry_2) g.drawImage(Graphic.IP_Browser_Entry, 144, 260, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 260, launcher);
                        g.drawString(layout_mp.list_entity_mp.get(1 + layout_mp.page).name, 159, 260+22);
                        g.drawString(layout_mp.list_entity_mp.get(1 + layout_mp.page).ip, 159, 260+67);


                        if(layout_mp.list_entity_mp.get(1+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,345,209+77,launcher);
                        } else g.drawImage(Graphic.red,345,209+77,launcher);
                    }



                }

                if(layout_mp.list_entity_mp.size() > 2 ){

                    if(layout_mp.list_entity_mp.size()> 2+layout_mp.page) {
                        if(!Graphic.entry_3) g.drawImage(Graphic.IP_Browser_Entry, 144, 337, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 337, launcher);
                        g.drawString(layout_mp.list_entity_mp.get(2 + layout_mp.page).name, 159, 337+22);
                        g.drawString(layout_mp.list_entity_mp.get(2 + layout_mp.page).ip, 159, 337+67);

                        if(layout_mp.list_entity_mp.get(2+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,345,209+77+77,launcher);
                        } else g.drawImage(Graphic.red,345,209+77+77,launcher);
                    }



                }

                if(layout_mp.list_entity_mp.size() > 3 ){

                    if(layout_mp.list_entity_mp.size()> 3+layout_mp.page) {
                        if(!Graphic.entry_4) g.drawImage(Graphic.IP_Browser_Entry, 144, 414, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 414, launcher);
                        g.drawString(layout_mp.list_entity_mp.get(3 + layout_mp.page).name, 159, 414+22);
                        g.drawString(layout_mp.list_entity_mp.get(3 + layout_mp.page).ip, 159, 414+67);

                        if(layout_mp.list_entity_mp.get(3+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,345,209+77+77+77,launcher);
                        } else g.drawImage(Graphic.red,345,209+77+77+77,launcher);
                    }



                }

                if(layout_mp.list_entity_mp.size() > 4 ){

                    if(layout_mp.list_entity_mp.size()> 4+layout_mp.page) {
                        if(!Graphic.entry_5) g.drawImage(Graphic.IP_Browser_Entry, 144, 491, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 491, launcher);
                        g.drawString(layout_mp.list_entity_mp.get(4 + layout_mp.page).name, 159, 491+22);
                        g.drawString(layout_mp.list_entity_mp.get(4 + layout_mp.page).ip, 159, 491+67);

                        if(layout_mp.list_entity_mp.get(4+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,345,209+77+77+77+77,launcher);
                        } else g.drawImage(Graphic.red,345,209+77+77+77+77,launcher);
                    }



                }

                if(layout_mp.list_entity_mp.size() > 5 ){

                    if(layout_mp.list_entity_mp.size()> 5+layout_mp.page) {
                        if(!Graphic.entry_6) g.drawImage(Graphic.IP_Browser_Entry, 144, 568, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 568, launcher);
                        g.drawString(layout_mp.list_entity_mp.get(5 + layout_mp.page).name, 159, 568+22);
                        g.drawString(layout_mp.list_entity_mp.get(5 + layout_mp.page).ip, 159, 568+67);

                        if(layout_mp.list_entity_mp.get(5+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,345,209+77+77+77+77+77,launcher);
                        } else g.drawImage(Graphic.red,345,209+77+77+77+77+77,launcher);
                    }



                }

                return;
            } // IP_LOBBY


            if (!Graphic.ip_button) {
                g.drawImage(Graphic.IP_Browser_OpenButton, 70, 280, launcher);

            } else {
                g.drawImage(Graphic.IP_Browser_OpenButton_Active, 70, 280, launcher);
            }


            //*********************

            if(!Graphic.delete) {
                g.drawImage(Graphic.delete_all, 396, 623, launcher);
            } else g.drawImage(Graphic.delete_all_active, 396, 623, launcher);




            if(!Graphic.play_button_b) {
                g.drawImage(Graphic.play_button, 127, 232, launcher);
            } else g.drawImage(Graphic.play_button_selected, 127, 232, launcher);


            if(!Graphic.install_button_b) {
                g.drawImage(Graphic.install_button, 127, 342, launcher);
            } else g.drawImage(Graphic.install_button_selected, 127, 342, launcher);



            if(!Graphic.base_mod_launch_button_b) {
                g.drawImage(Graphic.base_mod_launch_button, 127, 422, launcher);
            } else g.drawImage(Graphic.base_mod_launch_button_selected, 127, 422, launcher);

            if(!Graphic.doddf_mod_launch_button_b) {
                g.drawImage(Graphic.doddf_mod_launch_button, 127, 481, launcher);
            } else g.drawImage(Graphic.doddf_mod_launch_button_selected, 127, 481, launcher);

            if(!Graphic.clean_button_1_b) {
                g.drawImage(Graphic.clean_button, 382, 342, launcher);
            } else g.drawImage(Graphic.clean_button_selected, 382, 342, launcher);

            if(!Graphic.clean_button_2_b) {
                g.drawImage(Graphic.clean_button, 382, 422, launcher);
            } else g.drawImage(Graphic.clean_button_selected, 382, 422, launcher);

            if(!Graphic.clean_button_3_b) {
                g.drawImage(Graphic.clean_button, 382, 481, launcher);
            } else g.drawImage(Graphic.clean_button_selected, 382, 481, launcher);


            if(!Graphic.reset_button_b) {
                g.drawImage(Graphic.reset_button, 69, 342, launcher);
            } else g.drawImage(Graphic.reset_button_selected, 69, 342, launcher);



            if(!Graphic.download_button_1_b) {
                g.drawImage(Graphic.download_button, 69, 422, launcher);
            } else g.drawImage(Graphic.download_button_selected, 69, 422, launcher);

            if(!Graphic.download_button_2_b) {
                g.drawImage(Graphic.download_button, 69, 481, launcher);
            }else g.drawImage(Graphic.download_button_selected, 69, 481, launcher);


            if(!Graphic.discord_button_b) {
                g.drawImage(Graphic.discord_button, 124, 560+50, launcher);
            } else g.drawImage(Graphic.discord_button_selected, 124, 560+50, launcher);


            //подсказки
            if(Graphic.discord_button_b) g.drawImage(Graphic.Discord_Desc, Launcher.x-150, Launcher.y, launcher);



            if(Graphic.ip_button) {
                g.drawImage(Graphic.IPB_Desc, Launcher.x, Launcher.y, launcher);

            }
            if(Graphic.advice_b_1){

                g.drawImage(Graphic.advice,Launcher.x,Launcher.y,launcher);
            }

            if(Graphic.advice_b_2){

                g.drawImage(Graphic.advice,Launcher.x,Launcher.y,launcher);
            }

            if(Graphic.advice_b_3){

                g.drawImage(Graphic.advice_2,Launcher.x,Launcher.y,launcher);
            }

            if(Graphic.advice_b_4){

                g.drawImage(Graphic.advice_3,Launcher.x-207,Launcher.y,launcher);
            }

            if(Graphic.advice_b_5){

                g.drawImage(Graphic.advice_3,Launcher.x-207,Launcher.y,launcher);
            }

            if(Graphic.advice_b_6){

                g.drawImage(Graphic.advice_3,Launcher.x-207,Launcher.y,launcher);
            }

            if(Graphic.back) g.drawImage(Graphic.advice_back,Launcher.x,Launcher.y-45,launcher);
            if(Graphic.delete) g.drawImage(Graphic.advice_delete,Launcher.x-190,Launcher.y-48,launcher);




        } // лаунчер вик 2

        if(Launcher.vic_3_launcher_selected){
           g.drawImage(Graphic.vic_3_background,0,0,launcher);



            if(!Graphic.DLCButton_Vic3_b) {
                g.drawImage(Graphic.DLCButton_Vic3, 375, 283, launcher);
            } else g.drawImage(Graphic.DLCButton_Active_Vic3, 375, 283, launcher);



            if(!Graphic.delete) {
                g.drawImage(Graphic.delete_all, 396, 623, launcher);
            } else g.drawImage(Graphic.delete_all_active, 396, 623, launcher);


            if(!Graphic.back) {
                g.drawImage(Graphic.back_vic3, 34, 623, launcher);
            } else g.drawImage(Graphic.back_vic3_active, 34, 623, launcher);

            if(!Graphic.play_button_b) {
                g.drawImage(Graphic.play_button_3, 127, 232, launcher);
            } else g.drawImage(Graphic.play_button_selected_3, 127, 232, launcher);

            if(!Graphic.install_button_b) {
                g.drawImage(Graphic.install_button_3, 127, 342, launcher);
            } else g.drawImage(Graphic.install_button_selected_3, 127, 342, launcher);

            if(!Graphic.base_mod_launch_button_b) {
                g.drawImage(Graphic.base_mod_launch_button_3, 127, 422, launcher);
            } else g.drawImage(Graphic.base_mod_launch_button_selected_3, 127, 422, launcher);

            if(!Graphic.clean_button_1_b) {
                g.drawImage(Graphic.clean_button_3, 382, 342, launcher);
            } else {
                g.drawImage(Graphic.clean_button_selected_3, 382, 342, launcher);
                g.drawImage(Graphic.advice_3,Launcher.x-207,Launcher.y-45,launcher);

            }

            if(!Graphic.reset_button_b) {
                g.drawImage(Graphic.reset_button_3, 69, 342, launcher);
            } else {
                g.drawImage(Graphic.reset_button_selected_3, 69, 342, launcher);
                g.drawImage(Graphic.advice_2,Launcher.x,Launcher.y-45,launcher);

            }

            if(!Graphic.download_button_1_b) {
                g.drawImage(Graphic.download_button_3, 69, 422, launcher);
            } else {
                g.drawImage(Graphic.download_button_selected_3, 69, 422, launcher);
                g.drawImage(Graphic.advice,Launcher.x,Launcher.y-45,launcher);

            }


            if(!Graphic.discord_button_b) {
                g.drawImage(Graphic.discord_button, 124, 560+50, launcher);
            } else g.drawImage(Graphic.discord_button_selected, 124, 560+50, launcher);



            if(Graphic.back) g.drawImage(Graphic.advice_back,Launcher.x,Launcher.y-45,launcher);
            if(Graphic.delete) g.drawImage(Graphic.advice_delete,Launcher.x-190,Launcher.y-48,launcher);
            if(Graphic.discord_button_b) g.drawImage(Graphic.Discord_Desc, Launcher.x-150, Launcher.y, launcher);
            if(Graphic.DLCButton_Vic3_b) g.drawImage(Graphic.DLC_Desc, Launcher.x-216, Launcher.y, launcher);


        } // лаунчер вик 3


    }
}
