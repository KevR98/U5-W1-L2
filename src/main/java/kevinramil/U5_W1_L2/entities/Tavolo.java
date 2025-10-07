package kevinramil.U5_W1_L2.entities;

import kevinramil.U5_W1_L2.Enum.Stato;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Tavolo {

    private int numTavolo;
    private int numMaxCoperti;
    private Stato stato;


}
