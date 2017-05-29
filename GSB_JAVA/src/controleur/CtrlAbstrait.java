package controleur;

import vue.VueAbstraite;

/**
 * CtrlAbstrait
 * modèle de contrôleur de base
 * chaque contrôleur possède :
 * - une vue
 * - une liaison vers le contrôleur principal
 */
public abstract class CtrlAbstrait 
{
    
    protected VueAbstraite vue = null;
    protected CtrlPrincipal ctrlPrincipal = null;
    
    //Constructeur de la vue CtrlAbstrait
    protected CtrlAbstrait(CtrlPrincipal ctrlPrincipal) 
    {
        this.ctrlPrincipal = ctrlPrincipal;
    }
    
    //Retourne une vue
    public VueAbstraite getVue() 
    {
        return vue;
    }
    
    //set vueAbstraite au lieu de vue
    public void setVue(VueAbstraite vue) 
    {
        this.vue = vue;
    }
    
    //appelle controleur principal
    public CtrlPrincipal getCtrlPrincipal() 
    {
        return (CtrlPrincipal)ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) 
    {
        this.ctrlPrincipal = ctrlPrincipal;
    }
}
