package alessia.U2W1D4SpringData.dao;

import alessia.U2W1D4SpringData.entities.Topping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ToppingService {
    @Autowired
    private ToppingDAO toppingDAO;

    public void saveTopping(Topping newTopping){
        toppingDAO.save(newTopping);
        log.info("Topping salvato correttamente");
    }
}
