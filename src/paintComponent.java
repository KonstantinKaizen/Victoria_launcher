import java.awt.*;

public class paintComponent {



    public static void repaint_all(Launcher launcher, Graphics g){


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


            if(!Graphic.delete) {
                g.drawImage(Graphic.delete_all, 396, 723, launcher);
            } else g.drawImage(Graphic.delete_all_active, 396, 723, launcher);




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
                g.drawImage(Graphic.discord_button, 124, 630, launcher);
            } else g.drawImage(Graphic.discord_button_selected, 124, 630, launcher);

            if(!Graphic.back) {
                g.drawImage(Graphic.back_vic2, 34, 723, launcher);
            } else g.drawImage(Graphic.back_vic2_active, 34, 723, launcher);




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

                g.drawImage(Graphic.advice_3,Launcher.x-100,Launcher.y,launcher);
            }

            if(Graphic.advice_b_5){

                g.drawImage(Graphic.advice_3,Launcher.x-100,Launcher.y,launcher);
            }

            if(Graphic.advice_b_6){

                g.drawImage(Graphic.advice_3,Launcher.x-100,Launcher.y,launcher);
            }

            if(Graphic.back) g.drawImage(Graphic.advice_back,Launcher.x,Launcher.y-45,launcher);
            if(Graphic.delete) g.drawImage(Graphic.advice_delete,Launcher.x-130,Launcher.y-50,launcher);




        } // лаунчер вик 2

        if(Launcher.vic_3_launcher_selected){
           g.drawImage(Graphic.vic_3_background,0,0,launcher);



            if(!Graphic.delete) {
                g.drawImage(Graphic.delete_all, 396, 723, launcher);
            } else g.drawImage(Graphic.delete_all_active, 396, 723, launcher);


            if(!Graphic.back) {
                g.drawImage(Graphic.back_vic3, 34, 723, launcher);
            } else g.drawImage(Graphic.back_vic3_active, 34, 723, launcher);

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
                g.drawImage(Graphic.advice_3,Launcher.x-100,Launcher.y-45,launcher);

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
                g.drawImage(Graphic.discord_button, 124, 630, launcher);
            } else g.drawImage(Graphic.discord_button_selected, 124, 630, launcher);

            if(Graphic.back) g.drawImage(Graphic.advice_back,Launcher.x,Launcher.y-45,launcher);
            if(Graphic.delete) g.drawImage(Graphic.advice_delete,Launcher.x-130,Launcher.y-50,launcher);


        } // лаунчер вик 3


    }
}
