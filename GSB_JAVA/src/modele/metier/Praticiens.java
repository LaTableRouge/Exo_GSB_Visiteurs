package modele.metier;

import oracle.sql.BINARY_FLOAT;

/**
 *
 * @author bts
 */
public class Praticiens 
{
    //Déclaration des variables privées
    private Number numéro;
    private String nom;
    private String spe;
    private String prenom;
    private String adresse;
    private String cp;
    private String ville;
    private float coefficient;
    private String code;
    
    //constructeur pour instancier les variables    
    public Praticiens(Number numéro, String nom, String prenom, String adresse, String cp, String ville, float coefficient, String code) 
    {
        this.numéro = numéro;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.coefficient = coefficient;
        this.code = code;
    }



    @Override
    //méthode qui retourne le nom et le prenom en chaine de caractère
    public String toString() 
    {
        return  nom + " " + prenom;
    }

    public Number getNumero()
    {
        return numéro;
    }

    public void setNumero(Number numéro) 
    {
        this.numéro = numéro;
    }
    
    public String getSpe ()
    {
        return spe;
    }
    
    public void setgetSpe(String spe) 
    {
        this.spe = spe;
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

    public String getAdresse() 
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public String getCp() 
    {
        return cp;
    }

    public void setCp(String cp)
    {
        this.cp = cp;
    }

    public String getVille() 
    {
        return ville;
    }

    public void setVille(String ville) 
    {
        this.ville = ville;
    }

    public Number getCoef()
    {
        return coefficient;
    }

    public void setCoef(float coefficient)
    {
        this.coefficient = coefficient;
    }

    public String getCode() 
    {
        return code;
    }

    public void setCode(String code) 
    {
        this.code = code;
    }

}