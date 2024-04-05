package alessia.U2W1D4SpringData.dao;


import alessia.U2W1D4SpringData.entities.Drink;
import alessia.U2W1D4SpringData.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkDAO extends JpaRepository<Drink, Long> {
}
