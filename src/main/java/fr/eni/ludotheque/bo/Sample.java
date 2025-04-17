package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "SAMPLE")
public class Sample {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    @Column(length = 12, unique = true, nullable = false)
    private String barcode;

    @NonNull
    private Boolean borrowable;

    @ManyToOne
    @JoinColumn(name = "game_id") // clé étrangère vers Game.id
    private Game game;
}
