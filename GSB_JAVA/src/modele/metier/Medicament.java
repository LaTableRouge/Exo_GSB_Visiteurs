package modele.metier;

/**
 *
 * @author bts
 */
public class Medicament 
{
    //Déclaration des variables privées
    private String nomCommercial;
    private String code;
    private String composition;
    private String effets;
    private String contreIndic;
    private float prixEchantillon;
    private String depotLegal;
    
    //constructeur pour instancier les variables
    public Medicament(String nomCommercial, String code, String composition, String effets, String contreIndic, float prixEchantillon)
    {
        this.nomCommercial = nomCommercial;
        this.code = code;
        this.composition = composition;
        this.effets = effets;
        this.contreIndic = contreIndic;
        this.prixEchantillon = prixEchantillon;  
    }

 
    // Accesseurs
    @Override
    public String toString() 
    {
        return code;
    }
    //accéder au nom commercial
    //méthode qui retourne le nom commercial en chaine de caractère
    public String getNomCommercial() 
    {
        return nomCommercial;
    }
    
    //modifier le nom commercial
    public void setNomCommercial(String nomCommercial) 
    {
        this.nomCommercial = nomCommercial;
    }
    //accéder au prix
    //méthode qui retourne le prix en chaine de caractère
    public float getPrix() 
    {
        return prixEchantillon;
    }
    
    //modifier le prix
    public void setPrix(float prixEchantillon) 
    {
        this.prixEchantillon = prixEchantillon;
    }
    //accéder au code
    //méthode qui retourne le code en chaine de caractère
    public String getCode() 
    {
        return code;
    }
    //modifier le code
    public void setCode(String code) 
    {
        this.code = code;
    }
    //accéder au composition
    //méthode qui retourne une composition en chaine de caractère
    public String getComposition() 
    {
        return composition;
    }
    //modifier la/les composition(s)
    public void setComposition(String composition) 
    {
        this.composition = composition;
    }
    //accéder aux effets
    //méthode qui retourne un effet en chaine de caractère
    public String getEffets() 
    {
        return effets;
    }
    //modifier les effets
    public void setEffets(String effets) 
    {
        this.effets = effets;
    }
    //accéder aux contres indications
    //méthode qui retourne une contre indication en chaine de caractère
    public String getContreIndic() 
    {
        return contreIndic;
    }
    //modifier les contres indications
    public void setContreIndic(String contreIndic) 
    {
        this.contreIndic = contreIndic;
    }
    //accéder au depot legal
    //méthode qui retourne un depot legal en chaine de caractère
    public String getDepotLegal()
    {
        return depotLegal;
    }
    //modifier le depot legal
    public void setDepotLegal(String depotLegal) 
    {
        this.depotLegal = depotLegal;
    }
}