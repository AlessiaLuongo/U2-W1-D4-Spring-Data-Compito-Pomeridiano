package alessia.U2W1D4SpringData;

import alessia.U2W1D4SpringData.dao.DrinkDAO;
import alessia.U2W1D4SpringData.dao.DrinkService;
import alessia.U2W1D4SpringData.dao.PizzaService;
import alessia.U2W1D4SpringData.dao.ToppingService;
import alessia.U2W1D4SpringData.entities.Drink;
import alessia.U2W1D4SpringData.entities.Pizza;
import alessia.U2W1D4SpringData.entities.Topping;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Slf4j
public class PizzeriaRunner implements CommandLineRunner {

    @Autowired
    private PizzaService pizzaService;
    @Autowired
    private DrinkService drinkService;
    @Autowired
    private ToppingService toppingService;
    @Override
    public void run(String... args) throws Exception {

        Faker faker = new Faker();
        Random rndm = new Random();
        Pizza newPizza = new Pizza(faker.country().name(), rndm.nextInt(0,100), rndm.nextDouble(5,100));
        pizzaService.savePizza(newPizza);

        Drink newDrink = new Drink(faker.color().name(), rndm.nextInt(0,100), rndm.nextDouble(5,100));
        drinkService.saveDrink(newDrink);

        Topping newTopping = new Topping(faker.funnyName().name(), rndm.nextInt(0,100), rndm.nextDouble(5,100));
        toppingService.saveTopping(newTopping);
    }
}
