package telran.coffeeran.model.interfaces;

import java.util.Map;

import telran.coffeeran.dto.*;

public interface ICoffeeRun {
Coffee getOrder(String emailAddress);
Map<String,Coffee> getAllOrders();
boolean addOrder(Coffee order);
boolean removeOrder(String emailAddress);
}
