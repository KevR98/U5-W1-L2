package kevinramil.U5_W1_L2;

import kevinramil.U5_W1_L2.Enum.Stato;
import kevinramil.U5_W1_L2.Enum.StatoOrdine;
import kevinramil.U5_W1_L2.entities.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

@Component
@PropertySource("application.properties")
public class Runner implements CommandLineRunner {
    private final Logger logger = (Logger) LoggerFactory.getLogger(Runner.class);

    @Value("${coperto.costo}")
    private double costoCoperto;

    @Override
    public void run(String... args) {
        Item pizzaMargherita = new Pizza("Pizza Margherita", null, false);
        Item acqua = new Drink("Acqua", 0, 1.50);

        Tavolo tavolo = new Tavolo(1, 4, Stato.OCCUPATO);

        Ordine ordine = new Ordine();
        ordine.setNumOrdine(1);
        ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
        ordine.setCoperti(2);
        ordine.setOraAcquisizione(LocalDate.from(LocalDateTime.now()));
        ordine.setListaMenu(Arrays.asList(pizzaMargherita, acqua));
        ordine.setNumTavolo(tavolo);

        ordine.importoTotale(costoCoperto);

        logger.info("Ordine creato: " + ordine);

        System.out.println("prova");
    }
}
