package project.ordermodule;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	private OrderRepository repository;

	public OrderService(OrderRepository repository) {
		this.repository = repository;
	}
	
	public List<Order> getAllOrders() {
	    return repository.findAll();
	}
	
	public Order getOrderById(Integer id) {
	    return repository.findById(id)
	            .orElse(null);
	}
	
	public Order saveOrder(Order order) {
	    return repository.save(order);
	}
	
	public void deleteOrder(Integer id) {
	    repository.deleteById(id);
	}
	

}
