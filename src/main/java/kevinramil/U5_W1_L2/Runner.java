package kevinramil.U5_W1_L2;

import kevinramil.U5_W1_L2.Enum.Stato;
import kevinramil.U5_W1_L2.Enum.StatoOrdine;
import kevinramil.U5_W1_L2.entities.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class Runner implements CommandLineRunner {
    private final Logger logger = (Logger) LoggerFactory.getLogger(Runner.class);
    private double costoCoperto;

    @Override
    public void run(String... args) {
        Item pizzaMargherita = new Pizza("Pizza Margherita", null, false);
        Item acqua = new Drink("Acqua", 0, 1.50);

        Tavolo tavolo = new Tavolo(1, 4, Stato.OCCUPATO);

        Ordine ordine1 = new Ordine(
                Arrays.asList(pizzaMargherita, acqua),
                1,
                StatoOrdine.IN_CORSO,
                4,
                LocalDate.now(),
                tavolo,
                0.0
        );

        logger.info("Ordine creato: " + ordine1);
    }
}
