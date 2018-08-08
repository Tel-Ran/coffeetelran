package telran.coffeeran.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.coffeeran.model.interfaces.ICoffeeRun;
import telran.coffeeran.dto.*;
@SpringBootApplication
@RestController
@ComponentScan("telran.coffeeran.model.impl")
@CrossOrigin
public class CofeerunAppl {
@Autowired
ICoffeeRun orders;

@PostMapping(value=CoffeerunApi.ADD_ORDER)
synchronized boolean addOrder(@RequestBody Coffee order) {
	return orders.addOrder(order);

}
@DeleteMapping(value=CoffeerunApi.REMOVE_ORDER)
String removeOrder(String emailAddress)
{
	return orders.removeOrder(emailAddress)?"order removed":"order doesn't exists";
}
@GetMapping(value=CoffeerunApi.GET_ALL_ORDERS)
Map<String,Coffee> getAllOrders(){
	return orders.getAllOrders();
}
@GetMapping(value=CoffeerunApi.GET_ORDER)
Coffee getOrder(String emailAddress) {
	return orders.getOrder(emailAddress);
}
	public static void main(String[] args) {
		SpringApplication.run
		(CofeerunAppl.class, args);

	}

}
