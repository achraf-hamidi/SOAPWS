import WS.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerJws {

    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
         System.out.println("web service delpoyed in  http://0.0.0.0:9191/");

    }
}
