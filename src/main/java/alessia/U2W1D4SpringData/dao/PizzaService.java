package alessia.U2W1D4SpringData.dao;

import alessia.U2W1D4SpringData.entities.Pizza;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PizzaService {
    @Autowired
    private PizzaDAO pizzaDAO;

    public void savePizza(Pizza newPizza){
        pizzaDAO.save(newPizza);
        log.info("Pizza salvata correttamente");
    }

}
