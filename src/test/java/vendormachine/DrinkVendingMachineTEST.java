package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import vendormachine.users.Person;
import vendormachine.users.util.Wallet;
import vendormachine.vendors.DrinkVendingMachine;
import vendormachine.vendors.enums.BRANDS;
import vendormachine.vendors.item.Snack;

public class DrinkVendingMachineTEST {
	
	/**  
	 * Task 2:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.vendors.DrinkVendingMachine'
	 * 
	 * 	Goal: 
	 * 		80% code/line coverage
	 * 		TDD: analyse code and add missing methods.
	 * */
	@Test
	public void create() {
		DrinkVendingMachine drinkmachine = new DrinkVendingMachine();
		assertEquals(0f, drinkmachine.getCredit());
	}
	@Test
	public void createParameters() {
		BRANDS brandName = BRANDS.EnergyMax;
		DrinkVendingMachine drinkmachine = new DrinkVendingMachine(2f, brandName);
		assertEquals(2f, drinkmachine.getCredit());
	}
	@Test
	public void selectDrinkwithEnough() {
		BRANDS brandName = BRANDS.EnergyMax;
		DrinkVendingMachine drinkmachine = new DrinkVendingMachine(2f, brandName);
		assertEquals("VanillaBurst", drinkmachine.selectDrink(1).name);
	}
	@Test
	public void selectDrinkwithoutEnough() {
		BRANDS brandName = BRANDS.EnergyMax;
		DrinkVendingMachine drinkmachine = new DrinkVendingMachine(0.5f, brandName);
		assertEquals(null, drinkmachine.selectDrink(1));
	}
	@Test
	public void selectDrinkNotExist() {
		BRANDS brandName = BRANDS.EnergyMax;
		DrinkVendingMachine drinkmachine = new DrinkVendingMachine(2f, brandName);
		assertEquals(null, drinkmachine.selectDrink(0));
	}
	@Test
	public void giveCredit() {
		DrinkVendingMachine drinkmachine = new DrinkVendingMachine();
		Wallet wallet = new Wallet(5f);
		Person person = new Person("Tim", wallet);
		drinkmachine.giveCredit(person, 2f);
		assertEquals(2f, drinkmachine.getCredit());
	}
}
  