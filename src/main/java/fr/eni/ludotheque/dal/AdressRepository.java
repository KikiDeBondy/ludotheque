package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress, Long> {
}
