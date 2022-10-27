package WS;

import java.util.Date;

public class Compte {
    private  int code ;
    private  double solde ;
    private Date dateDeCreation ;

    public int getCode() {
        return code;
    }



    public Compte(int code, double solde, Date dateDeCreation) {
        this.code = code;
        this.solde = solde;
        this.dateDeCreation = dateDeCreation;
    }
}
