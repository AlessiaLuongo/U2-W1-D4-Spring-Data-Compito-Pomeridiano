package alessia.U2W1D4SpringData;

import alessia.U2W1D4SpringData.dao.*;
import alessia.U2W1D4SpringData.entities.Drink;
import alessia.U2W1D4SpringData.entities.Pizza;
import alessia.U2W1D4SpringData.entities.Topping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Slf4j
public class PizzeriaRunner implements CommandLineRunner {

    @Autowired
    private PizzaService pizzaService;
    @Autowired
    private PizzaDAO pizzaDAO;
    @Autowired
    private DrinkService drinkService;
    @Autowired
    private ToppingService toppingService;
    @Autowired
    @Qualifier("getToppingPomodoro")
    private Topping toppingPomodoro;

    @Autowired
    @Qualifier("getToppingOnions")
    private Topping toppingOnions;
    @Override
    public void run(String... args) throws Exception {



        Drink newDrink = new Drink("Coca cola", 125, 3.50);
        drinkService.saveDrink(newDrink);

        System.out.println(toppingOnions.getCalories());
        toppingService.saveTopping(toppingOnions);

        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingPomodoro);
        toppingList.add(toppingOnions);


        Pizza newPizza1 = new Pizza("Cipolle", toppingList, toppingPomodoro.getCalories() + toppingOnions.getCalories(), 5.50);
        pizzaService.savePizza(newPizza1);

        List<Pizza> pizzas = pizzaDAO.findByNome("Marinara");
        pizzas.forEach(pizza -> log.info(String.valueOf(pizza)));
    }
}
