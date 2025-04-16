package fr.eni.ludotheque.bo;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
@Builder
public class GameTest {
    @Test
    public void createGameTest() {
        Set<Kind> kind = new HashSet<>();

        Kind kind1 = Kind.builder()
                .libelle("Action")
                .build();
        Kind kind2 = Kind.builder()
                .libelle("Adventure")
                .build();

        kind.add(kind1);
        kind.add(kind2);
        Game game = Game.builder()
                .title("Monopoly")
                .reference("MP")
                .minAge(28)
                .description("Test")
                .duration(40)
                .dayPrice(20.00)
                .kinds(kind)
                .build();


        log.info(game.toString());
        assertThat(game).isNotNull();
        assertThat(game.getId()).isNull();
        assertThat(game.getTitle()).isEqualTo("Monopoly");
        assertThat(game.getReference()).isEqualTo("MP");
        assertThat(game.getMinAge()).isGreaterThan(27);
        assertThat(game.getDescription()).isEqualTo("Test");
        assertThat(game.getDuration()).isEqualTo(40);
        assertThat(game.getDayPrice()).isEqualTo(20.00);
        assertThat(game.getKinds()).isEqualTo(kind);
    }
}
