import java.awt.*;
import java.io.IOException;

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
                g.drawImage(Graphic.back_vic2, 69, 698, launcher);
            } else g.drawImage(Graphic.back_vic2_active, 69, 698, launcher);
            g.setFont(new Font("Cambria", Font.ROMAN_BASELINE, 20));
            g.setColor(Color.ORANGE);






            //****************************** IP LOBBY
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




                        if(layout_mp.page == 0){ g.drawString(layout_mp.list_entity_mp.get(0 + layout_mp.page).name.substring(0), 159, 205); }
                        else g.drawString(layout_mp.list_entity_mp.get(0 + layout_mp.page).name, 159, 205);
                        g.drawString(layout_mp.list_entity_mp.get(0 + layout_mp.page).ip, 159, 248);

                        //InetAddress address = InetAddress.getByName(layout_mp.list_entity_mp.get(0 + layout_mp.page).ip);

                        if(layout_mp.list_entity_mp.get(0+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,340,209,launcher);
                        } else g.drawImage(Graphic.red,340,209,launcher);




                    }



                }

                if(layout_mp.list_entity_mp.size() > 1 ){

                    if(layout_mp.list_entity_mp.size()> 1+layout_mp.page) {
                        if(!Graphic.entry_2) g.drawImage(Graphic.IP_Browser_Entry, 144, 260, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 260, launcher);
                        g.drawString(layout_mp.list_entity_mp.get(1 + layout_mp.page).name, 159, 260+22);
                        g.drawString(layout_mp.list_entity_mp.get(1 + layout_mp.page).ip, 159, 260+67-2);


                        if(layout_mp.list_entity_mp.get(1+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,340,209+77,launcher);
                        } else g.drawImage(Graphic.red,340,209+77,launcher);
                    }



                }

                if(layout_mp.list_entity_mp.size() > 2 ){

                    if(layout_mp.list_entity_mp.size()> 2+layout_mp.page) {
                        if(!Graphic.entry_3) g.drawImage(Graphic.IP_Browser_Entry, 144, 337, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 337, launcher);
                        g.drawString(layout_mp.list_entity_mp.get(2 + layout_mp.page).name, 159, 337+22);
                        g.drawString(layout_mp.list_entity_mp.get(2 + layout_mp.page).ip, 159, 337+67-2);

                        if(layout_mp.list_entity_mp.get(2+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,340,209+77+77,launcher);
                        } else g.drawImage(Graphic.red,340,209+77+77,launcher);
                    }



                }

                if(layout_mp.list_entity_mp.size() > 3 ){

                    if(layout_mp.list_entity_mp.size()> 3+layout_mp.page) {
                        if(!Graphic.entry_4) g.drawImage(Graphic.IP_Browser_Entry, 144, 414, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 414, launcher);
                        g.drawString(layout_mp.list_entity_mp.get(3 + layout_mp.page).name, 159, 414+22);
                        g.drawString(layout_mp.list_entity_mp.get(3 + layout_mp.page).ip, 159, 414+67-2);

                        if(layout_mp.list_entity_mp.get(3+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,340,209+77+77+77,launcher);
                        } else g.drawImage(Graphic.red,340,209+77+77+77,launcher);
                    }



                }

                if(layout_mp.list_entity_mp.size() > 4 ){

                    if(layout_mp.list_entity_mp.size()> 4+layout_mp.page) {
                        if(!Graphic.entry_5) g.drawImage(Graphic.IP_Browser_Entry, 144, 491, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 491, launcher);
                        g.drawString(layout_mp.list_entity_mp.get(4 + layout_mp.page).name, 159, 491+22);
                        g.drawString(layout_mp.list_entity_mp.get(4 + layout_mp.page).ip, 159, 491+67-2);

                        if(layout_mp.list_entity_mp.get(4+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,340,209+77+77+77+77,launcher);
                        } else g.drawImage(Graphic.red,340,209+77+77+77+77,launcher);
                    }



                }

                if(layout_mp.list_entity_mp.size() > 5 ){

                    if(layout_mp.list_entity_mp.size()> 5+layout_mp.page) {
                        if(!Graphic.entry_6) g.drawImage(Graphic.IP_Browser_Entry, 144, 568, launcher);
                        else g.drawImage(Graphic.IP_Browser_Entry_Active, 144, 568, launcher);
                        g.drawString(layout_mp.list_entity_mp.get(5 + layout_mp.page).name, 159, 568+22);
                        g.drawString(layout_mp.list_entity_mp.get(5 + layout_mp.page).ip, 159, 568+67-2);

                        if(layout_mp.list_entity_mp.get(5+layout_mp.page).isAvailable){
                            g.drawImage(Graphic.green,340,209+77+77+77+77+77,launcher);
                        } else g.drawImage(Graphic.red,340,209+77+77+77+77+77,launcher);
                    }



                }


                if(Graphic.entry_1  && Launcher.x > 347 && Launcher.x < 380 && Launcher.y > 217 && Launcher.y < 246 ) {
                    if(layout_mp.list_entity_mp.get(0+layout_mp.page).isAvailable) {

                        g.drawImage(Graphic.Has_Ping_Desc, Launcher.x - 240, Launcher.y, launcher);
                    } else g.drawImage(Graphic.No_Ping_Desc, Launcher.x - 230, Launcher.y, launcher);
                }

                if(Graphic.entry_2  && Launcher.x > 348 && Launcher.x < 379 && Launcher.y > 294 && Launcher.y < 323 ) {
                    if(layout_mp.list_entity_mp.get(1+layout_mp.page).isAvailable) {

                        g.drawImage(Graphic.Has_Ping_Desc, Launcher.x - 240, Launcher.y, launcher);
                    } else g.drawImage(Graphic.No_Ping_Desc, Launcher.x - 230, Launcher.y, launcher);
                }

                if(Graphic.entry_3  && Launcher.x > 348 && Launcher.x < 379 && Launcher.y > 371 && Launcher.y < 401 ) {
                    if(layout_mp.list_entity_mp.get(2+layout_mp.page).isAvailable) {

                        g.drawImage(Graphic.Has_Ping_Desc, Launcher.x - 240, Launcher.y, launcher);
                    } else g.drawImage(Graphic.No_Ping_Desc, Launcher.x - 230, Launcher.y, launcher);
                }

                if(Graphic.entry_4  && Launcher.x > 348 && Launcher.x < 379 && Launcher.y > 448 && Launcher.y < 479 ) {
                    if(layout_mp.list_entity_mp.get(3+layout_mp.page).isAvailable) {

                        g.drawImage(Graphic.Has_Ping_Desc, Launcher.x - 240, Launcher.y, launcher);
                    } else g.drawImage(Graphic.No_Ping_Desc, Launcher.x - 230, Launcher.y, launcher);
                }

                if(Graphic.entry_5  && Launcher.x > 348 && Launcher.x < 379 && Launcher.y > 527 && Launcher.y < 555 ) {
                    if(layout_mp.list_entity_mp.get(4+layout_mp.page).isAvailable) {

                        g.drawImage(Graphic.Has_Ping_Desc, Launcher.x - 240, Launcher.y, launcher);
                    } else g.drawImage(Graphic.No_Ping_Desc, Launcher.x - 230, Launcher.y, launcher);
                }

                if(Graphic.entry_6  && Launcher.x > 348 && Launcher.x < 379 && Launcher.y > 603 && Launcher.y < 632 ) {
                    if(layout_mp.list_entity_mp.get(5+layout_mp.page).isAvailable) {

                        g.drawImage(Graphic.Has_Ping_Desc, Launcher.x - 240, Launcher.y, launcher);
                    } else g.drawImage(Graphic.No_Ping_Desc, Launcher.x - 230, Launcher.y, launcher);
                }




                return;
            } // IP_LOBBY
            //*******************************************


            if (!Graphic.ip_button) {
                g.drawImage(Graphic.IP_Browser_OpenButton, 69, 234, launcher);

            } else {
                g.drawImage(Graphic.IP_Browser_OpenButton_Active, 69, 234, launcher);
            }


            //*********************


            if(!Graphic.change_language_button_b) {
                g.drawImage(Graphic.Lang_Icon, 382, 234, launcher);
            } else {
                g.drawImage(Graphic.Lang_Icon_Active, 382, 234, launcher);

            } // LANGUAGE




            if(!Graphic.delete) {
                g.drawImage(Graphic.delete_all, 382, 698, launcher);
            } else g.drawImage(Graphic.delete_all_active, 382, 698, launcher);




            if(!Graphic.play_button_b) {

                g.drawImage(Graphic.Prefab_260x120_Button, 127, 292, launcher);

            } else {
                g.drawImage(Graphic.Prefab_260x120_Button_Active, 127, 292, launcher);

            }




/*
            if(!Graphic.mod_1_launch_b) {
                g.drawImage(Graphic.base_mod_launch_button, 139, 409-58, launcher);
            } else g.drawImage(Graphic.base_mod_launch_button_selected, 139, 409-58, launcher);

 */

            if(!Graphic.vk_b) {
                g.drawImage(Graphic.vk_button, 225, 698, launcher);
            } else {
                g.drawImage(Graphic.vk_button_selected, 225, 698, launcher);

            } // VK

            if(!Graphic.ec_b) {
                g.drawImage(Graphic.ec_button, 283, 640, launcher);
            } else g.drawImage(Graphic.ec_button_selected, 283, 640, launcher); // eco analyzer

            if(!Graphic.war_b) {
                g.drawImage(Graphic.war_button, 225, 640, launcher);
            } else g.drawImage(Graphic.war_button_selected, 225, 640, launcher); // war analyzer


            if(!Graphic.mod_1_launch_b) {
                g.drawImage(Graphic.mod_1_launch_button, 127, 408, launcher);
            } else g.drawImage(Graphic.mod_1_launch_button_selected, 127, 408, launcher);

            if(!Graphic.mod_2_launch_b) {
                g.drawImage(Graphic.mod_2_launch_button, 127, 466, launcher);
            } else g.drawImage(Graphic.mod_2_launch_button_selected, 127, 466, launcher);

            if(!Graphic.mod_3_launch_b) {
                g.drawImage(Graphic.mod_3_launch_button, 127, 466+58, launcher);
            } else g.drawImage(Graphic.mod_3_launch_button_selected, 127, 466+58, launcher);

            if(!Graphic.mod_4_launch_b) {
                g.drawImage(Graphic.mod_4_launch_button, 127, 466+58+58, launcher);
            } else g.drawImage(Graphic.mod_4_launch_button_selected, 127, 466+58+58, launcher);


            if(!Graphic.clean_button_1_b) {
                g.drawImage(Graphic.clean_button, 382, 293, launcher);
            } else g.drawImage(Graphic.clean_button_selected, 382, 293, launcher);//CACHE

            if(!Graphic.clean_button_2_b) {
                g.drawImage(Graphic.clean_button, 382, 409, launcher);
            } else g.drawImage(Graphic.clean_button_selected, 382, 409, launcher);//CACHE

            if(!Graphic.clean_button_3_b) {
                g.drawImage(Graphic.clean_button, 382, 467, launcher);
            } else g.drawImage(Graphic.clean_button_selected, 382, 467, launcher);//CACHE

            if(!Graphic.clean_button_4_b) {
                g.drawImage(Graphic.clean_button, 382, 467+58, launcher);
            } else g.drawImage(Graphic.clean_button_selected, 382, 467+58, launcher);//CACHE

            if(!Graphic.clean_button_5_b) {
                g.drawImage(Graphic.clean_button, 382, 467+58+58, launcher);
            } else {
                g.drawImage(Graphic.clean_button_selected, 382, 467 + 58 + 58, launcher);
                g.drawImage(Graphic.advice_3,Launcher.x-207,Launcher.y,launcher);

            }//CACHE 5


            if(!Graphic.reset_button_b) {
                g.drawImage(Graphic.reset_button, 167, 640, launcher);
            } else g.drawImage(Graphic.reset_button_selected, 167, 640, launcher);



            if(!Graphic.install_button_b) {
                g.drawImage(Graphic.install_button, 127, 234, launcher);
            } else g.drawImage(Graphic.install_button_selected, 127, 234, launcher);// скачать игру



            if(!Graphic.download_button_0_b) {
                g.drawImage(Graphic.download_button, 69, 234+58, launcher);
            } else {
                g.drawImage(Graphic.download_button_selected, 69, 234 + 58, launcher);
                g.drawImage(Graphic.advice,Launcher.x,Launcher.y,launcher);
            }

            if(!Graphic.download_button_1_b) {
                g.drawImage(Graphic.download_button, 69, 408, launcher);
            } else g.drawImage(Graphic.download_button_selected, 69, 408, launcher);

            if(!Graphic.download_button_2_b) {
                g.drawImage(Graphic.download_button, 69, 466, launcher);
            }else g.drawImage(Graphic.download_button_selected, 69, 466, launcher);

            if(!Graphic.download_button_3_b) {
                g.drawImage(Graphic.download_button, 69, 466+58, launcher);
            }else g.drawImage(Graphic.download_button_selected, 69, 466+58, launcher);

            if(!Graphic.download_button_4_b) {
                g.drawImage(Graphic.download_button, 69, 466+58+58, launcher);
            }else {
                g.drawImage(Graphic.download_button_selected, 69, 466 + 58 + 58, launcher);
                g.drawImage(Graphic.advice,Launcher.x,Launcher.y,launcher);
            }


            if(!Graphic.discord_button_b) {
                g.drawImage(Graphic.discord_button, 283, 698, launcher);
            } else g.drawImage(Graphic.discord_button_selected, 283, 698, launcher);


            //подсказки
            if(Graphic.discord_button_b) g.drawImage(Graphic.Discord_Desc, Launcher.x-150, Launcher.y-43, launcher);

            if(Graphic.vk_b) g.drawImage(Graphic.VK_DESK,Launcher.x-100,Launcher.y-45,launcher);

            if(Graphic.ec_b) g.drawImage(Graphic.ECO_DESK,Launcher.x-200,Launcher.y-45,launcher);

            if(Graphic.war_b) g.drawImage(Graphic.WAR_DESK,Launcher.x-100,Launcher.y-45,launcher);

             // VK



            if(Graphic.ip_button) {
                g.drawImage(Graphic.IPB_Desc, Launcher.x, Launcher.y, launcher);

            }
            if(Graphic.advice_b_1){

                g.drawImage(Graphic.advice,Launcher.x,Launcher.y,launcher);
            }

            if(Graphic.advice_b_2){

                g.drawImage(Graphic.advice,Launcher.x,Launcher.y,launcher);
            }

            if(Graphic.download_button_3_b){

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

            if(Graphic.clean_button_4_b){

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





            if(!Graphic.lang_button_b_3) {
                g.drawImage(Graphic.ENG_Button, 375+7, 283, launcher);
            } else g.drawImage(Graphic.ENG_Button_Active, 375+7, 283, launcher);



            if(!Graphic.DLCButton_Vic3_b) {
                g.drawImage(Graphic.DLCButton_Vic3, 63+6, 282, launcher);
            } else g.drawImage(Graphic.DLCButton_Active_Vic3, 63+6, 282, launcher);



            if(!Graphic.delete) {
                g.drawImage(Graphic.DeleteButton_Vic3, 382, 698-2, launcher);
            } else g.drawImage(Graphic.DeleteButton_Active_Vic3, 382, 698-2, launcher);


            if(!Graphic.back) {
                g.drawImage(Graphic.back_vic3, 69-9, 698-5, launcher);
            } else g.drawImage(Graphic.back_vic3_active, 69-9, 698-5, launcher);

            if(!Graphic.launch_game_b_3) {
                g.drawImage(Graphic.play_button_3, 127, 232-7, launcher);
            } else g.drawImage(Graphic.play_button_selected_3, 127, 232-7, launcher);

            if(!Graphic.install_game_b_3) {
                g.drawImage(Graphic.install_button_3, 127, 342, launcher);
            } else g.drawImage(Graphic.install_button_selected_3, 127, 342, launcher);

            if(!Graphic.launch_mode_b_3) {
                g.drawImage(Graphic.base_mod_launch_button_3, 127, 422, launcher);
            } else g.drawImage(Graphic.base_mod_launch_button_selected_3, 127, 422, launcher);

            if(!Graphic.clean_cache_b_3) {
                g.drawImage(Graphic.clean_button_3, 382, 342, launcher);
            } else {
                g.drawImage(Graphic.clean_button_selected_3, 382, 342, launcher);
                g.drawImage(Graphic.advice_3,Launcher.x-207,Launcher.y-45,launcher);

            }

            if(!Graphic.reset_gear_b_3) {
                g.drawImage(Graphic.reset_button_3, 69, 342, launcher);
            } else {
                g.drawImage(Graphic.reset_button_selected_3, 69, 342, launcher);
                g.drawImage(Graphic.advice_2,Launcher.x,Launcher.y-45,launcher);

            }

            if(!Graphic.download_mod_b_3) {
                g.drawImage(Graphic.download_button_3, 69, 422, launcher);
            } else {
                g.drawImage(Graphic.download_button_selected_3, 69, 422, launcher);
                g.drawImage(Graphic.advice,Launcher.x,Launcher.y-45,launcher);

            }


            if(!Graphic.discord_button_b) {
                g.drawImage(Graphic.discord_button, 283, 698, launcher);
            } else g.drawImage(Graphic.discord_button_selected, 283, 698-2, launcher);

            if(!Graphic.vk_b) {
                g.drawImage(Graphic.vk_button, 225, 698, launcher);
            } else g.drawImage(Graphic.vk_button_selected, 225, 698, launcher);





            if(Graphic.back) g.drawImage(Graphic.advice_back,Launcher.x,Launcher.y-45,launcher);


            if(Graphic.delete) g.drawImage(Graphic.advice_delete,Launcher.x-190,Launcher.y-48,launcher);
            if(Graphic.discord_button_b) g.drawImage(Graphic.Discord_Desc, Launcher.x-150, Launcher.y-45, launcher);
            if(Graphic.DLCButton_Vic3_b) g.drawImage(Graphic.DLC_Desc, Launcher.x, Launcher.y, launcher);


        } // лаунчер вик 3


    }
}
