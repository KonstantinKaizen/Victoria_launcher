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
            layout_mp.list_entity_mp.get(num).isAvailable = address.isReachable(100);




        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
