package fr.eni.ludotheque.bo;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "CLIENTS")
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    @Column(nullable = false)

    private String name;

    @Column(nullable = false)
    @NonNull
    private String firstName;

    @NonNull
    @Column(unique = true, nullable = false)
    private String email;

    @Column(length = 15)
    private String no_telephone;


    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "adress_id")
    private Adress adress;

}
