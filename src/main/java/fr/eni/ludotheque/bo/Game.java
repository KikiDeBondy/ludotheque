package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "GAME")
public class Game {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;

    @NonNull
    private String reference;

    private Integer minAge;

    private String description;

    private Integer duration;

    @NonNull
    private Double dayPrice;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Sample> sample;
}
