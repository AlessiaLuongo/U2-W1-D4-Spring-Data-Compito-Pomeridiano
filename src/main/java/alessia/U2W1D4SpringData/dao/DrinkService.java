package alessia.U2W1D4SpringData.dao;

import alessia.U2W1D4SpringData.entities.Drink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DrinkService {
    @Autowired
    private DrinkDAO drinkDAO;

     public void saveDrink(Drink newDrink){
         drinkDAO.save(newDrink);
         log.info("Drink salvato correttamente");
     }
}
