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
    @Column(length = 12)
    private String barcode;

    @NonNull
    private Boolean borrowable;
}
