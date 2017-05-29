package modele.metier;

/**
*
* @author bts
*/
public class Labo 
{
    //Déclaration des variables privées
    private String code;
    private String nom;
    private String chefVente;
    
    //constructeur pour instancier les variables
    public Labo(String code, String nom, String chefVente) 
    {
        this.code = code;
        this.nom = nom;
        this.chefVente = chefVente;
    }
    
    public Labo() 
    {
        this.code = "";
        this.nom = "";
        this.chefVente = "";
    }
    //accéder au code
    public String getCode()
    {
        return code;
    }
    //modifié le code
    public void setCode(String code)
    {
        this.code = code;
    }
    //accéder au nom
    public String getNom() 
    {
        return nom;
    }
    //modifié le nom
    public void setNom(String nom) 
    {
        this.nom = nom;
    }
    //accéder au chef de vente
    public String getChefVente() 
    {
        return chefVente;
    }
    //modifié le chef de vente
    public void setChefVente(String chefVente)
    {
        this.chefVente = chefVente;
    }

    @Override
    public String toString() 
    {
        return nom ;
    }    
}