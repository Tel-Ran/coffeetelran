package telran.coffeeran.model.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import telran.coffeeran.dto.Coffee;
import telran.coffeeran.model.interfaces.ICoffeeRun;
@Service
public class CoffeeMaps implements ICoffeeRun {
HashMap<String,Coffee> orders=new HashMap<>();
	@Override
	synchronized public Coffee getOrder(String emailAddress) {
		return orders.get(emailAddress);
	}

	@Override
	synchronized public Map<String,Coffee> getAllOrders() {
		return new HashMap<String,Coffee>(orders);
	}

	@Override
	synchronized public boolean addOrder(Coffee order) {
		boolean res=orders.putIfAbsent(order.emailAddress, order)==null;
		return res;
	
	}

	@Override
	synchronized public boolean removeOrder(String emailAddress) {
		return orders.remove(emailAddress)!=null;
	}

}
