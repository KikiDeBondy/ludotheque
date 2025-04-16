package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany(mappedBy = "kinds")
    private Set<Game> games = new HashSet<>();
}
