package project.ordermodule;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	private OrderService service;

	public OrderController(OrderService service) {
		this.service = service;
	}
	
	@GetMapping("/orders")
	public List<Order> getAllOrders() {
	    return service.getAllOrders();
	}
	
	@GetMapping("/orders/{id}")
	public Order getOrderById(@PathVariable Integer id) {
		return service.getOrderById(id);
	}
	
	@PostMapping("/orders")
	public Order createOrder(@RequestBody Order order) {
		return service.saveOrder(order);
	}
	
	@PutMapping("/orders/{id}")
	public Order updateOrder(@PathVariable Integer id, @RequestBody Order order) {
	    order.setId(id);
	    return service.saveOrder(order);
	}
	
	@DeleteMapping("/orders/{id}")
	public void deleteOrder(@PathVariable Integer id) {
	    service.deleteOrder(id);
	}
	
}
