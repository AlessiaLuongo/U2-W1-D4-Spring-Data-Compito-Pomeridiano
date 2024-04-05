package alessia.U2W1D4SpringData.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Pizza implements IMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String mozzarella;
    private String pomodoro;
    private int calories;
    private double price;


    public Pizza() {
    }

    public Pizza(String nome,int calories, double price) {
        this.nome = nome;
        this.mozzarella = "Mozzarella";
        this.pomodoro = "Pomodoro";
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                "nome='" + nome + '\'' +
                ", mozzarella='" + mozzarella + '\'' +
                ", pomodoro='" + pomodoro + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
