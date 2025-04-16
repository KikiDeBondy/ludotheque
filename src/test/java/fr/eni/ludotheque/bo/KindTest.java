package fr.eni.ludotheque.bo;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@Slf4j
@SpringBootTest
@Builder
public class KindTest {

    @Test
    public void createKindTest() {
        Kind kind = Kind.builder()
                .libelle("Action")
                .build();
        log.info("kind: {}", kind);

        assertThat(kind).isNotNull();
        assertThat(kind.getId()).isNull();
        assertThat(kind.getLibelle()).isEqualTo("Action");
    }
}
