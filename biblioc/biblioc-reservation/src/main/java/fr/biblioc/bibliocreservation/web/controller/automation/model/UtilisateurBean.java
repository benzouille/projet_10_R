package fr.biblioc.bibliocreservation.web.controller.automation.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Bean Utilisateur coté client
 */
public class UtilisateurBean {

    //------------------------- ATTRIBUTS -------------------------

    private int id_utilisateur;

    private String nom;

    private String prenom;

    private long telephone;

    private int id_adresse;

    //------------------------- CONSTRUCTEUR -------------------------

    /**
     * constructeur
     */
    public UtilisateurBean() {
    }

    /**
     * constructeur avec parametres
     * @param nom string
     * @param prenom string
     * @param telephone long
     * @param id_adresse int
     */
    public UtilisateurBean(String nom, String prenom, long telephone, int id_adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.id_adresse = id_adresse;
    }

    //------------------------- GETTER/SETTER -------------------------

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }

    //------------------------- TO_STRING -------------------------

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id_utilisateur=" + id_utilisateur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone=" + telephone +
                ", id_adresse=" + id_adresse +
                '}';
    }
}
