package fr.eni.ludotheque.bo;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@Slf4j
@SpringBootTest
@Builder
public class ClientTest {

    @Test
    public void createClientTest() {

        Client nath = Client.builder()
                .name("Ked")
                .firstName("Nath")
                .email("n.k@gmail.com")
                .build();
        log.info(nath.toString());
        assertThat(nath).isNotNull();
        assertThat(nath.getId()).isNull();
        assertThat(nath.getName()).isEqualTo("Ked");
        assertThat(nath.getEmail()).isEqualTo("n.k@gmail.com");


    }
}
