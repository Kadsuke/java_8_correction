package tech.techturningpoint.service;


import tech.techturningpoint.model.Person;

import java.util.Optional;

/**
 * User: lh712825
 */
public interface IExerciceOptional {
    /**
     * Retourne le nom du premier artiste de la liste ipod de la personne s'il existe.
     *
     * @param person personne
     * @return nom s'il existe, "unknown" sinon.
     */
    String getNameFirstArtisteInIpod(Person person);

    /**
     * Retourne le nom du chef s'il existe.
     * @param person le subordonn√©
     * @return nom du chef s'il existe, Eric sinon
     */
    String getNameOfChef(Person person);
}
