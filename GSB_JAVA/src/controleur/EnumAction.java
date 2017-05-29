package controleur;

/**
 * Liste des actions prises en charge par le contrôleur frontal
 * Règles de nommage pour ajouter une action :
 * - en majuscules
 * - le nom du contrôleur suivi d'un tiret bas et du nom de l'action pour ce contrôleur
 * @author bts
 */
public enum EnumAction 
{
    MENU_ID
    ,ID_FERMER
    
    ,MENU_ACCUEIL
    ,ACCUEIL_FERMER
    
    ,MENU_VISITEUR
    ,VISITEUR_FERMER
    
    ,MENU_QUITTER
    ,VISITEUR_SUIVANT
    ,VISITEUR_PRECEDENT
    
    ,MENU_RAPPORTSVISITE
    ,RAPPORTSVISITE_FERMER
    
    ,MENU_PRATICIENS
    ,PRATICIENS_FERMER
    
    ,MENU_MEDICAMENT
    ,MEDICAMENT_FERMER 
}
