package telran.coffeeran.dto;

public class Coffee {
public String emailAddress;
public String coffee;
public int strength;
public String size;
public String flavor;
public Coffee(String emailAddress, String coffee, int strength, String size, String flavor) {
	super();
	this.emailAddress = emailAddress;
	this.coffee = coffee;
	this.strength = strength;
	this.size = size;
	this.flavor = flavor;
}
public Coffee() {}
public String getEmailAddress() {
	return emailAddress;
}
public String getCoffee() {
	return coffee;
}
public int getStrength() {
	return strength;
}
public String getSize() {
	return size;
}
public String getFlavor() {
	return flavor;
}
@Override
public String toString() {
	return "Coffee [emailAddress=" + emailAddress + ", coffee=" + coffee + ", strength=" + strength + ", size=" + size
			+ ", flavor=" + flavor + "]";
}

}
