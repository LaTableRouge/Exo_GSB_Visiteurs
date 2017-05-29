package modele.metier;


public class RapportsVisite 
{
   
    private int numrapport;
    private String daterapport;
    private String nom;
    private String prenom;
    private String motifvisite;
  
 

    public RapportsVisite(int numrapport, String nom, String prenom,String daterapport, String motifvisite) 
    {
        this.numrapport = numrapport;
        this.nom = nom;
        this.prenom = prenom;
        this.daterapport = daterapport;
        this.motifvisite = motifvisite;
        
    }


    @Override
    public String toString() 
    {
        return  nom + " " + prenom;
    }
    
    public int getNumrapport()
    {
        return numrapport;
    }
    
    public void setNumrapport(int numrapport) 
    {
        this.numrapport = numrapport;
    }

    public String getDaterapport()
    {
        return daterapport;
    }

    public void setDaterapport(String daterapport) 
    {
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

    public String getPrenom() 
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
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
}