import jakarta.xml.ws.Endpoint;
import wx.BanqueService;

public class serveurJWS {

    public static void main(String[] args) {
        //permet de demarer un petit serveur HTTP
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web service déployé sur http://0.0.0.0:9191");
    }
}
