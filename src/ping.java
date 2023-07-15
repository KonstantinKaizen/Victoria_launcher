import java.io.IOException;
import java.net.InetAddress;


public class ping extends Thread{


    int num;


    public String ping;


    public ping(int num, String ping) {
        this.num = num;
        this.ping = ping;
    }

    public  void run(){



        try {



            InetAddress address = InetAddress.getByName(ping);
            layout_mp.list_entity_mp.get(num).isAvailable = address.isReachable(500);




        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static boolean check_server_ping(){

        String server_ip = "194.147.148.18";
        try {


            InetAddress address = InetAddress.getByName(server_ip);
            return true;
        } catch (Exception e){

            return true;

        }






    }
}
