package tech.techturningpoint.model;

/**
 * User: FiFEi
 * Date: 29/01/15
 */
public class Artiste {

    /**
     * Nom de l'artiste.
     */
    public String nom;

    public String getNom() {
        return nom;
    }

    public double getClassement() {
        return classement;
    }

    /**
     * Classement au Top50.
     */
    public double classement;

    public Artiste(String nom, double note) {
        this.nom = nom;
        this.classement = note;
    }
}
