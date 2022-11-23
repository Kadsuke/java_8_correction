package tech.techturningpoint.service;

import tech.techturningpoint.model.Artiste;
import tech.techturningpoint.model.Person;

import java.util.List;
import java.util.Optional;

/**
 * Exercices sur Optional de Java 8.
 */
public class ExerciceOptional implements IExerciceOptional {
    /**
     * Retourne le nom du premier artiste de la liste ipod de la personne s'il existe.
     * Indices : Utiliser map et filter.
     *
     * @param person personne
     * @return nom s'il existe, "unknown" sinon.
     */
    @Override
    public String getNameFirstArtisteInIpod(Person person)
    {
        Optional<Person> perso = Optional.ofNullable(person);

        return perso.map(Person::getDansMonIpod)
                .filter(p-> !p.isEmpty()&&p.get(0).getNom()!=null)
                .map(pp->pp.get(0).getNom())
                .orElse("unknown");

    }

    /**
     * Retourne le nom du chef s'il existe.
     * Indices : Utiliser map et flatMap.
     *
     * @param person le subordonné
     * @return nom du chef s'il existe, Eric sinon
     */
    @Override
    public String getNameOfChef(Person person) {
        //TODO
        Optional<Person> perso = Optional.ofNullable(person);

        return perso.flatMap(Person::getChef)
                .map(Person::getNom)
                .orElse("Eric");

    }

}
