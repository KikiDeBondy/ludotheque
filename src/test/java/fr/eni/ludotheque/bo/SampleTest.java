package fr.eni.ludotheque.bo;


import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
@Builder
public class SampleTest {

    @Test
    public void createSampleTest() {

        Sample game = Sample.builder()
                .barcode("1242523413543")
                .borrowable(false)
                .build();


        log.info(game.toString());
        assertThat(game).isNotNull();
        assertThat(game.getId()).isNull();
        assertThat(game.getBarcode()).isEqualTo("1242523413543");
        assertThat(game.getBorrowable()).isEqualTo(false);
    }
}
