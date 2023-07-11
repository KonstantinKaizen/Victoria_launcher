import javax.swing.*;
import java.awt.*;

public class Graphic  {

    public static boolean language_russian = true;

    public static boolean change_lang = true;



    public static boolean change_language_button_b = false;

    //для вик 2



    public static boolean refresh_ip_button = false;


    public static boolean entry_1 = false;
    public static boolean entry_2 = false;
    public static boolean entry_3 = false;
    public static boolean entry_4 = false;
    public static boolean entry_5 = false;
    public static boolean entry_6 = false;


    public static boolean ip_button = false;

    public static boolean ip_button_left = false;
    public static boolean ip_button_right = false;
    public static boolean back_active_1 = false; //вик 2 выбрать

    public static boolean back_active_2 = false; // вик 3 выбрать


    public static boolean advice_b_1 = false; // скачать мод базы

    public static boolean advice_b_2 = false; // скачать мод додф

    public static boolean advice_b_3 = false; // сброс настроек

    public static boolean advice_b_4 = false; // чистка кеша мода 2 3

    public static boolean advice_b_5 = false; // чистка кеша мода базы

    public static boolean advice_b_6 = false; // чиська кеща мода додф

    public static boolean play_button_b = false;
    public static boolean discord_button_b = false;
    public static boolean install_button_b = false;
    public static boolean mod_1_launch_b = false;
    public static boolean mod_2_launch_b = false;
    public static boolean mod_3_launch_b = false;
    public static boolean clean_button_1_b = false;
    public static boolean clean_button_2_b = false;
    public static boolean clean_button_3_b = false;
    public static boolean clean_button_4_b = false;



    public static boolean reset_button_b = false;
    public static boolean download_button_1_b = false;
    public static boolean download_button_2_b = false;
    public static boolean download_button_3_b = false;

    public static boolean download_mod_b_3 = false;

    public static boolean reset_gear_b_3 = false;

    public static boolean clean_cache_b_3 = false;

    public static boolean launch_game_b_3 = false;

    public static boolean launch_mode_b_3 = false;

    public static boolean install_game_b_3 = false;

    public static boolean lang_button_b_3 = false;





    public static boolean back = false;
    public static boolean delete = false;



    // VICTORIA 3 BOOLEANS


    public static boolean DLCButton_Vic3_b = false;





    //VIC 2 new BUTTONS

    //prefabs

    public static Image Prefab_260x120_Button = new ImageIcon("launcher/images/new/Vic2/LaunchG_RUS.png").getImage();
    public static Image Prefab_260x120_Button_Active = new ImageIcon("launcher/images/new/Vic2/LaunchG_RUS_Active.png").getImage();

    //text
    public static Image Lang_Icon = new ImageIcon("launcher/images/new/Vic2/ENG_Button.png").getImage();
    public static Image Lang_Icon_Active = new ImageIcon("launcher/images/new/Vic2/ENG_Button_Active.png").getImage();








    //VIC 2 BUTTONS
    public static Image background_1 = new ImageIcon("launcher/images/background_4.png").getImage();

    public static Image background_2 = new ImageIcon("launcher/images/background_4_1.png").getImage();

    public static Image background_3 = new ImageIcon("launcher/images/background_4_2.png").getImage();


    public static Image vic_2_background = new ImageIcon("launcher/images/vic_2_background.png").getImage();
    public static Image vic_3_background = new ImageIcon("launcher/images/vic_3_background.png").getImage();
    public static Image play_button = new ImageIcon("launcher/images/play_button.png").getImage();
    public static Image play_button_selected = new ImageIcon("launcher/images/play_button_selected.png").getImage();
    public static Image discord_button = new ImageIcon("launcher/images/discord.png").getImage();
    public static Image discord_button_selected = new ImageIcon("launcher/images/discord_selected.png").getImage();
    public static Image install_button = new ImageIcon("launcher/images/new/Vic2/InstallTBT_RUS.png").getImage();
    public static Image install_button_selected = new ImageIcon("launcher/images/new/Vic2/InstallTBT_RUS_Active.png").getImage();
    public static Image clean_button = new ImageIcon("launcher/images/new/Vic2/CleanCache_Button.png").getImage();
    public static Image clean_button_selected = new ImageIcon("launcher/images/new/Vic2/CleanCache_Button_Active.png").getImage();
    public static Image download_button = new ImageIcon("launcher/images/new/Vic2/Download_Button.png").getImage();

    public static Image download_button_selected = new ImageIcon("launcher/images/new/Vic2/Download_Button_Active.png").getImage();
    public static Image mod_1_launch_button = new ImageIcon("launcher/images/new/Vic2/RunMod_1_RUS.png").getImage();
    public static Image mod_1_launch_button_selected = new ImageIcon("launcher/images/new/Vic2/RunMod_1_RUS_Active.png").getImage();
    public static Image mod_2_launch_button = new ImageIcon("launcher/images/new/Vic2/RunMod_2_RUS.png").getImage();
    public static Image mod_2_launch_button_selected = new ImageIcon("launcher/images/new/Vic2/RunMod_2_RUS_Active.png").getImage();

    public static Image mod_3_launch_button = new ImageIcon("launcher/images/new/Vic2/RunMod_3_RUS.png").getImage();
    public static Image mod_3_launch_button_selected = new ImageIcon("launcher/images/new/Vic2/RunMod_3_RUS_Active.png").getImage();
    public static Image reset_button = new ImageIcon("launcher/images/new/Vic2/ResetSettings_Button.png").getImage();
    public static Image reset_button_selected = new ImageIcon("launcher/images/new/Vic2/ResetSettings_Button_Active.png").getImage();

    public static Image advice = new ImageIcon("launcher/images/advice.png").getImage();

    public static Image advice_2 = new ImageIcon("launcher/images/advice_2.png").getImage();

    public static Image advice_3 = new ImageIcon("launcher/images/advice_3.png").getImage();

    //VIC 3 BUTTONS

    public static Image play_button_3 = new ImageIcon("launcher/images/new/Vic3/LaunchG_Vic3_RUS.png").getImage();

    public static Image play_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/LaunchG_Vic3_RU_ActiveS.png").getImage();

    public static Image install_button_3 = new ImageIcon("launcher/images/new/Vic3/InstallTBT_Vic3_RUS.png").getImage();
    public static Image install_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/InstallTBT_Vic3_RUS_Active.png").getImage();

    public static Image base_mod_launch_button_3 = new ImageIcon("launcher/images/new/Vic3/RunNVBMTBT_RUS.png").getImage();
    public static Image base_mod_launch_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/RunNVBMTBT_RUS_Active.png").getImage();

    public static Image clean_button_3 = new ImageIcon("launcher/images/new/Vic3/CleanCache_Button_Vic3.png").getImage();
    public static Image clean_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/CleanCache_Button_Active_Vic3.png").getImage();

    public static Image reset_button_3 = new ImageIcon("launcher/images/new/Vic3/ResetSettings_Button_Vic3.png").getImage();
    public static Image reset_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/ResetSettings_Button_Active_Vic3.png").getImage();

    public static Image download_button_3 = new ImageIcon("launcher/images/new/Vic3/Download_Button_Vic3.png").getImage();

    public static Image download_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/Download_Button_Active_Vic3.png").getImage();


    public static Image back_vic2 = new ImageIcon("launcher/images/new/Vic2/Back_Button.png").getImage();
    public static Image back_vic2_active = new ImageIcon("launcher/images/new/Vic2/Back_Button_Active.png").getImage();

    public static Image back_vic3 = new ImageIcon("launcher/images/back_vic3.png").getImage();
    public static Image back_vic3_active = new ImageIcon("launcher/images/back_vic3_active.png").getImage();

    public static Image delete_all = new ImageIcon("launcher/images/new/Vic2/Delete_Button.png").getImage();
    public static Image delete_all_active = new ImageIcon("launcher/images/new/Vic2/Delete_Button_Active.png").getImage();

    public static Image advice_back = new ImageIcon("launcher/images/advice_back.png").getImage();
    public static Image advice_delete = new ImageIcon("launcher/images/advice_delete.png").getImage();

    public static Image IP_Browser_OpenButton = new ImageIcon("launcher/images/new/Vic2/IPB_Button.png").getImage();

    public static Image IP_Browser_OpenButton_Active = new ImageIcon("launcher/images/new/Vic2/IPB_Button_Active.png").getImage();

    public static Image IP_Browser_Background = new ImageIcon("launcher/images/IP_Browser_Background.png").getImage();

    public static Image IP_Browser_Entry = new ImageIcon("launcher/images/IP_Browser_Entry.png").getImage();

    public static Image IP_Browser_Entry_Active = new ImageIcon("launcher/images/IP_Browser_Entry_Active.png").getImage();

    public static Image IP_Browser_LeftArrow = new ImageIcon("launcher/images/IP_Browser_LeftArrow.png").getImage();
    public static Image IP_Browser_LeftArrow_Active = new ImageIcon("launcher/images/IP_Browser_LeftArrow_Active.png").getImage();
    public static Image IP_Browser_RightArrow = new ImageIcon("launcher/images/IP_Browser_RightArrow.png").getImage();
    public static Image IP_Browser_RightArrow_Active = new ImageIcon("launcher/images/IP_Browser_RightArrow_Active.png").getImage();

    public static Image IP_Browser_RefreshButton = new ImageIcon("launcher/images/IP_Browser_RefreshButton.png").getImage();

    public static Image IP_Browser_RefreshButton_Active = new ImageIcon("launcher/images/IP_Browser_RefreshButton_Active.png").getImage();

    public static Image red = new ImageIcon("launcher/images/red.png").getImage();
    public static Image green = new ImageIcon("launcher/images/green.png").getImage();

    public static Image IPB_Desc = new ImageIcon("launcher/images/IPB_Desc.png").getImage();

    public static Image Discord_Desc = new ImageIcon("launcher/images/Discord_Desc.png").getImage();

    public static Image DLCButton_Vic3 = new ImageIcon("launcher/images/new/Vic3/DLC_Button_Vic3.png").getImage();

    public static Image DLCButton_Active_Vic3 = new ImageIcon("launcher/images/new/Vic3/DLC_Button_Active_Vic3.png").getImage();



    public static Image DLC_Desc = new ImageIcon("launcher/images/DLC_Desc.png").getImage();

    public static Image Has_Ping_Desc = new ImageIcon("launcher/images/Has_Ping_Desc.png").getImage();

    public static Image No_Ping_Desc = new ImageIcon("launcher/images/No_Ping_Desc.png").getImage();
    public static Image ENG_Button = new ImageIcon("launcher/images/new/Vic3/ENG_Button_Vic3.png").getImage();
    public static Image ENG_Button_Active = new ImageIcon("launcher/images/new/Vic3/ENG_Button_Active_Vic3.png").getImage();

    public static Image DeleteButton_Active_Vic3 = new ImageIcon("launcher/images/new/Vic3/Delete_Button_Active_Vic3.png").getImage();
    public static Image DeleteButton_Vic3 = new ImageIcon("launcher/images/new/Vic3/Delete_Button_Vic3.png").getImage();
    public static Image Loading_Screen = new ImageIcon("launcher/images/Loading_Screen.png").getImage();
    public static Image Loading_Progressbar = new ImageIcon("launcher/images/Loading_Progressbar.png").getImage();

    public static Image Quote_Downloading = new ImageIcon("launcher/images/Quote_Downloading.png").getImage();
    public static Image Quote_Unzipping = new ImageIcon("launcher/images/Quote_Unzipping.png").getImage();




    public static void change_lang_to_eng(){

        System.out.println("change");


        if(language_russian || change_lang) {

            //смена на англ


            ENG_Button = new ImageIcon("launcher/images/new/Vic3/RUS_Button_Vic3.png").getImage();
            ENG_Button_Active = new ImageIcon("launcher/images/new/Vic3/RUS_Button_Active_Vic3.png").getImage();









            Lang_Icon = new ImageIcon("launcher/images/new/Vic2/RUS_Button.png").getImage();
            Lang_Icon_Active = new ImageIcon("launcher/images/new/Vic2/RUS_Button_Active.png").getImage();


            advice = new ImageIcon("launcher/images/ENG/advice.png").getImage();

            advice_3 = new ImageIcon("launcher/images/ENG/advice_3.png").getImage();
            advice_back = new ImageIcon("launcher/images/ENG/advice_back.png").getImage();



            Prefab_260x120_Button = new ImageIcon("launcher/images/new/Vic2/LaunchG_ENG.png").getImage();
            Prefab_260x120_Button_Active = new ImageIcon("launcher/images/new/Vic2/LaunchG_ENG_Active.png").getImage();

            install_button = new ImageIcon("launcher/images/new/Vic2/InstallTBT_ENG.png").getImage();
            install_button_selected = new ImageIcon("launcher/images/new/Vic2/InstallTBT_ENG_Active.png").getImage();

            mod_1_launch_button = new ImageIcon("launcher/images/new/Vic2/RunMod_1_ENG.png").getImage();
            mod_1_launch_button_selected = new ImageIcon("launcher/images/new/Vic2/RunMod_1_ENG_Active.png").getImage();

            mod_2_launch_button = new ImageIcon("launcher/images/new/Vic2/RunMod_2_ENG.png").getImage();
            mod_2_launch_button_selected = new ImageIcon("launcher/images/new/Vic2/RunMod_2_ENG_Active.png").getImage();

            mod_3_launch_button = new ImageIcon("launcher/images/new/Vic2/RunMod_3_ENG.png").getImage();
            mod_3_launch_button_selected = new ImageIcon("launcher/images/new/Vic2/RunMod_3_ENG_Active.png").getImage();



            advice_delete = new ImageIcon("launcher/images/ENG/advice_delete.png").getImage();

            base_mod_launch_button_3 = new ImageIcon("launcher/images/new/Vic3/RunNVBMTBT_ENG.png").getImage();
            base_mod_launch_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/RunNVBMTBT_ENG_Active.png").getImage();


            Discord_Desc = new ImageIcon("launcher/images/ENG/Discord_Desc.png").getImage();

            DLC_Desc = new ImageIcon("launcher/images/ENG/DLC_Desc.png").getImage();



            Has_Ping_Desc = new ImageIcon("launcher/images/ENG/Has_Ping_Desc.png").getImage();


            install_button_3 = new ImageIcon("launcher/images/new/Vic3/InstallTBT_Vic3_ENG.png").getImage();
            install_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/InstallTBT_Vic3_ENG_Active.png").getImage();


            IPB_Desc = new ImageIcon("launcher/images/ENG/IPB_Desc.png").getImage();

            No_Ping_Desc = new ImageIcon("launcher/images/ENG/No_Ping_Desc.png").getImage();

            play_button_3 = new ImageIcon("launcher/images/new/Vic3/LaunchG_Vic3_ENG.png").getImage();
            play_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/LaunchG_Vic3_ENG_Active.png").getImage();


            advice_2 = new ImageIcon("launcher/images/ENG/advice_2.png").getImage();

            Quote_Downloading = new ImageIcon("launcher/images/ENG/Quote_Downloading.png").getImage();
            Quote_Unzipping = new ImageIcon("launcher/images/ENG/Quote_Unzipping.png").getImage();



            language_russian =false;
            Utility.givenWritingStringToFile_whenUsingFileOutputStream_thenCorrect("eng","launcher\\lang.txt");
            Graphic.change_lang = false;
        } else {

            //смена на рус

            Lang_Icon = new ImageIcon("launcher/images/new/Vic2/ENG_Button.png").getImage();
            Lang_Icon_Active = new ImageIcon("launcher/images/new/Vic2/ENG_Button_Active.png").getImage();

            ENG_Button = new ImageIcon("launcher/images/new/Vic3/ENG_Button_Vic3.png").getImage();
            ENG_Button_Active = new ImageIcon("launcher/images/new/Vic3/ENG_Button_Active_Vic3.png").getImage();


            advice = new ImageIcon("launcher/images/advice.png").getImage();

            advice_3 = new ImageIcon("launcher/images/advice_3.png").getImage();
            advice_back = new ImageIcon("launcher/images/advice_back.png").getImage();

            advice_delete = new ImageIcon("launcher/images/advice_delete.png").getImage();

            Prefab_260x120_Button = new ImageIcon("launcher/images/new/Vic2/LaunchG_RUS.png").getImage();
            Prefab_260x120_Button_Active = new ImageIcon("launcher/images/new/Vic2/LaunchG_RUS_Active.png").getImage();

            install_button = new ImageIcon("launcher/images/new/Vic2/InstallTBT_RUS.png").getImage();
            install_button_selected = new ImageIcon("launcher/images/new/Vic2/InstallTBT_RUS_Active.png").getImage();

            mod_1_launch_button = new ImageIcon("launcher/images/new/Vic2/RunMod_1_RUS.png").getImage();
            mod_1_launch_button_selected = new ImageIcon("launcher/images/new/Vic2/RunMod_1_RUS_Active.png").getImage();

            mod_2_launch_button = new ImageIcon("launcher/images/new/Vic2/RunMod_2_RUS.png").getImage();
            mod_2_launch_button_selected = new ImageIcon("launcher/images/new/Vic2/RunMod_2_RUS_Active.png").getImage();

            mod_3_launch_button = new ImageIcon("launcher/images/new/Vic2/RunMod_3_RUS.png").getImage();
            mod_3_launch_button_selected = new ImageIcon("launcher/images/new/Vic2/RunMod_3_RUS_Active.png").getImage();

            base_mod_launch_button_3 = new ImageIcon("launcher/images/new/Vic3/RunNVBMTBT_RUS.png").getImage();
            base_mod_launch_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/RunNVBMTBT_RUS_Active.png").getImage();


            Discord_Desc = new ImageIcon("launcher/images/Discord_Desc.png").getImage();

            DLC_Desc = new ImageIcon("launcher/images/DLC_Desc.png").getImage();



            Has_Ping_Desc = new ImageIcon("launcher/images/Has_Ping_Desc.png").getImage();


            install_button_3 = new ImageIcon("launcher/images/new/Vic3/InstallTBT_Vic3_RUS.png").getImage();
            install_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/InstallTBT_Vic3_RUS_Active.png").getImage();

            IPB_Desc = new ImageIcon("launcher/images/IPB_Desc.png").getImage();

            No_Ping_Desc = new ImageIcon("launcher/images/No_Ping_Desc.png").getImage();

            play_button_3 = new ImageIcon("launcher/images/new/Vic3/LaunchG_Vic3_RUS.png").getImage();
            play_button_selected_3 = new ImageIcon("launcher/images/new/Vic3/LaunchG_Vic3_RU_ActiveS.png").getImage();


            advice_2 = new ImageIcon("launcher/images/advice_2.png").getImage();



            Quote_Downloading = new ImageIcon("launcher/images/Quote_Downloading.png").getImage();
            Quote_Unzipping = new ImageIcon("launcher/images/Quote_Unzipping.png").getImage();

            language_russian = true;
            Utility.givenWritingStringToFile_whenUsingFileOutputStream_thenCorrect("rus","launcher\\lang.txt");



        }






    }






















}
