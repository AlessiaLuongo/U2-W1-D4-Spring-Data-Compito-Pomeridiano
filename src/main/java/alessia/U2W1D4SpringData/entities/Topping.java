package alessia.U2W1D4SpringData.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Topping implements IMenu{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int calories;
    private double price;
    @ManyToOne
    @JoinColumn(name = "topping_id")
    private Pizza pizza;



    public Topping() {
    }

    public Topping(String name, int calories, double price) {

        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public Topping(String name) {
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
