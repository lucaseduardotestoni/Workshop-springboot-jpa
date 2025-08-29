package curso.java.workshopjava.repositories;

import curso.java.workshopjava.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
