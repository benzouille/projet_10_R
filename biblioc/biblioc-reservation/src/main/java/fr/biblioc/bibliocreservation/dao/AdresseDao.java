package fr.biblioc.bibliocreservation.dao;

import fr.biblioc.bibliocreservation.model.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseDao extends JpaRepository<Adresse, Integer> {
}
