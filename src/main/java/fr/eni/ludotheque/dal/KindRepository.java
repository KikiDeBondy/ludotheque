package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Kind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KindRepository extends JpaRepository<Kind, Long> {
}
