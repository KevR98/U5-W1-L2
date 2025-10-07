package kevinramil.U5_W1_L2.entities;

import kevinramil.U5_W1_L2.Enum.StatoOrdine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Ordine {
    private List<Item> listaMenu;
    private int numOrdine;
    private StatoOrdine statoOrdine;
    private int coperti;
    private LocalDate oraAcquisizione;
    private Tavolo numTavolo;
    private double totale;

    // METODI
    public double importoTotale(double costoCoperto) {
        this.totale = listaMenu.stream().mapToDouble(item -> item.getPrice()).sum();
        this.totale = this.totale + coperti * costoCoperto;
        return costoCoperto;
    }
}
