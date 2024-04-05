package alessia.U2W1D4SpringData.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Pizza implements IMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @OneToMany(mappedBy = "pizza")
    private List<Topping> toppings = new ArrayList<>() ;
    private int calories;
    private double price;


    public Pizza() {
    }

    public Pizza(String nome, List<Topping> toppingList, int calories, double price) {
        this.nome = nome;
        this.toppings = toppingList;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                "nome='" + nome + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
