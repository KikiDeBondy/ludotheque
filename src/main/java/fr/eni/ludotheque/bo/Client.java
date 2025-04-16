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
    private String name;

    @NonNull
    private String firstName;

    @NonNull
    @Column(unique = true)
    private String email;

    @Column(length = 10)
    private String no_telephone;

}
