package modele.metier;

/**
 *
 * @author bts
 */
public class Medicament {
    private String nomCommercial;
    private String code;
    private String composition;
    private String effets;
    private String contreIndic;
    private String prixEchantillon;
    private String depotLegal;

    public Medicament(String nomCommercial, String code, String composition, String effets, String contreIndic, String prixEchantillon, String depotLegal) {
        this.nomCommercial = nomCommercial;
        this.code = code;
        this.composition = composition;
        this.effets = effets;
        this.contreIndic = contreIndic;
        this.prixEchantillon = prixEchantillon;
        this.prixEchantillon = depotLegal;

    }

    public Medicament() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return code;
    }

    public String getnomCommercial() {
        return nomCommercial;
    }

    public void setnomCommercial(String nomCommercial) {
        this.nomCommercial = nomCommercial;
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getcomposition() {
        return composition;
    }

    public void setcomposition(String composition) {
        this.composition = composition;
    }

    public String geteffets() {
        return effets;
    }

    public void seteffets(String effets) {
        this.effets = effets;
    }

    public String getcontreIndic() {
        return contreIndic;
    }

    public void setcontreIndic(String contreIndic) {
        this.contreIndic = contreIndic;
    }

    public String getprixEchantillon() {
        return prixEchantillon;
    }

    public void setprixEchantillon(String prixEchantillon) {
        this.prixEchantillon = prixEchantillon;
    }
    public String getdepotLegal() {
        return depotLegal;
    }

    public void setdepotLegal(String depotLegal) {
        this.depotLegal = depotLegal;
    }
}