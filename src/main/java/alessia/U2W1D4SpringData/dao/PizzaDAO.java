package alessia.U2W1D4SpringData.dao;

import alessia.U2W1D4SpringData.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaDAO extends JpaRepository<Pizza, Long> {

    List<Pizza> findByNome(String nome);
}
