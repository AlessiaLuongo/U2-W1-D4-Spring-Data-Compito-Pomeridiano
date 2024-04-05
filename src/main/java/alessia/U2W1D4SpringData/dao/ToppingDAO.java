package alessia.U2W1D4SpringData.dao;

import alessia.U2W1D4SpringData.entities.Pizza;
import alessia.U2W1D4SpringData.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingDAO extends JpaRepository<Topping, Long> {
}