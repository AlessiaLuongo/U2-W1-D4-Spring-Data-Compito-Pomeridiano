package alessia.U2W1D4SpringData.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;


@Getter
@Setter

public class Tavolo {
    @Setter(AccessLevel.NONE)
    private int id;
    private int numeroMassimoCoperti;

    private boolean libero;

    public Tavolo() {
    }

    public Tavolo(int numeroMassimoCoperti, boolean libero) {
        this.id = generateRandomId();
        this.numeroMassimoCoperti = numeroMassimoCoperti;
        this.libero = libero;
    }

    private int generateRandomId() {
        Random random = new Random();
        return random.nextInt(20);
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "id=" + id +
                ", numeroMassimoCoperti=" + numeroMassimoCoperti +
                ", stato del tavolo=" + (this.isLibero()? "occupato" : "libero") +
                '}';
    }
}
