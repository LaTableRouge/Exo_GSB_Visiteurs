package modele.metier;

// importation de java.sql.Date pour utiliser le type Date
import java.sql.Date;
import oracle.sql.BINARY_FLOAT;


public class RapportsVisite 
{
   
    private String numrapport;
    
    private String daterapport;
    private String nom;
    private String prenom;
    private String motifvisite;
    private String bilan;
 

    public RapportsVisite(String numrapport, String nom, String prenom,String daterapport, String motifvisite, String bilan) 
    {
        this.numrapport = numrapport;
        this.nom = nom;
        this.prenom = prenom;
        this.daterapport = daterapport;
        this.motifvisite = motifvisite;
        this.bilan = bilan;
    }


    @Override
    public String toString() 
    {
        return  nom + " " + prenom;
    }
    
    public String getNumrapport ()
            {
                return numrapport;
            }
    
     public void setNumrapport(String numrapport) 
    {
        this.numrapport = numrapport;
    }
     

   

    public String getDaterapport() {
        return daterapport;
    }

    public void setDaterapport(String daterapport) {
        this.daterapport = daterapport;
    }
    
    
    public String getNom() 
    {
        return nom;
    }

    public void setNom(String nom) 
    {
        this.nom = nom;
    }

     public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getMotifvisite() 
    {
        return motifvisite;
    }

    public void setMotifvisite(String motifvisite) 
    {
        this.motifvisite = motifvisite;
    }

    public String getBilan() {
        return bilan;
    }

    public void setBilan(String bilan) {
        this.bilan = bilan;
    }

}