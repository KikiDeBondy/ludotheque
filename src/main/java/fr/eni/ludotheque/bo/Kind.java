package fr.eni.ludotheque.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "KIND")
public class Kind {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String libelle;
}
