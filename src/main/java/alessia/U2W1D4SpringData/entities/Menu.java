package alessia.U2W1D4SpringData.entities;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Menu {
    private final List<Pizza> pizzas;
    private final List<Topping> toppings;
    private final List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzas=" + pizzas +
                ", toppings=" + toppings +
                ", drinks=" + drinks +
                '}';
    }
}
