package fr.eni.ludotheque.dal;

import fr.eni.ludotheque.bo.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {
}
