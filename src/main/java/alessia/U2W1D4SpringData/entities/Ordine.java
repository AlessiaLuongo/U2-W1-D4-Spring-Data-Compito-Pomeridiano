package alessia.U2W1D4SpringData.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Ordine {
    @Setter(AccessLevel.NONE)
    private int id;
    private StatoDellOrdine statoDellOrdine;
    private int numeroDeiCoperti;
    private int coperto;
    private LocalDate oraDellOrdine;
    private double costoDellOrdine;
    private List<IMenu> ordinazione;
    private Tavolo tavolo;
    private int calories;

    public Ordine() {
    }

    public Ordine(StatoDellOrdine statoDellOrdine, int numeroDeiCoperti, int coperto, LocalDate oraDellOrdine, List<IMenu> ordinazione, Tavolo tavolo) {
        this.statoDellOrdine = statoDellOrdine;
        this.numeroDeiCoperti = numeroDeiCoperti;
        this.coperto = coperto;
        this.oraDellOrdine = oraDellOrdine;
        this.ordinazione = ordinazione;
        this.tavolo = tavolo;
        this.costoDellOrdine = costoOrdine();
        this.calories = totaleCalorie(ordinazione);
        this.id = generateRandomId();
    }



    public void aggiungiAllOrdinazione(IMenu IMenu) {
        this.ordinazione.add(IMenu);
    }
    private int generateRandomId() {
        Random random = new Random();
        return random.nextInt(20);
    }

    private double costoOrdine() {
        double sommaTotale = 0.0;
        for (IMenu menu : ordinazione) {
            sommaTotale += menu.getPrice();
        }
        return sommaTotale;
    }
    private static int totaleCalorie(List<IMenu> ordinazione) {
        int sommaCalorie = 0;
        for (IMenu menu : ordinazione) {
            sommaCalorie += menu.getCalories();
        }
        return sommaCalorie;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "id=" + id +
                ", statoDellOrdine=" + statoDellOrdine +
                ", numeroDeiCoperti=" + numeroDeiCoperti +
                ", coperto=" + coperto +
                ", oraDellOrdine=" + oraDellOrdine +
                ", costoDellOrdine=" + costoDellOrdine +
                ", ordinazione=" + ordinazione +
                ", tavolo=" + tavolo +
                ", calories=" + calories +
                '}';
    }
}
