package WS;



//import java.util.Date;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;
import java.util.Date ;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double Conversionù( @WebParam(name= "montant") double mt ){
        return mt*10.54;
    }
    @WebMethod
    public Compte getCommpte (@WebParam(name = "code") int code ){
        return new Compte(code , Math.random()*9888,  new Date()) ;
    }

    public List<Compte> ListeComptes (){

        return List.of(
                 new Compte(1 , Math.random()*9888,new Date()) ,
                 new Compte(2 , Math.random()*9888,new Date()),
                 new Compte(3 , Math.random()*9888,new Date()),
                 new Compte(4 , Math.random()*9888,new Date())


        );
    }
}
