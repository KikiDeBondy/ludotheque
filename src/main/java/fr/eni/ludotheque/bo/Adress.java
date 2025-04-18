package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ADRESS")
public class Adress {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String street;

    @NonNull
    @Column(length = 10)
    private String postal_code;

    @NonNull
    private String city;

    //PAS BESOIN
    //@OneToOne(mappedBy = "adress")
    //private Client client;

}
