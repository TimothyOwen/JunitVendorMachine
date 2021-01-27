package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import vendormachine.users.util.Wallet;

public class WalletTEST {
	
	/** 
	 * Task 1:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.users.util.Wallet'
	 * 
	 * 		Goal: 80% code/line coverage
	 * */
	@Test
	public void create() {
		Wallet wallet = new Wallet();
		System.out.println("Create: No parameters");
		assertEquals("Generic", wallet.getBrand());
	}
	@Test
	public void createStart() {
		Wallet wallet = new Wallet((float) 1.0);
		System.out.println("Create: Start credit");
		assertEquals((float) 1.0, wallet.getAllCredit());
	}
	@Test
	public void createBrand() {
		Wallet wallet = new Wallet("Non-Generic",(float) 1.0);
		System.out.println("Create: Brand Name and Start credit");
		assertEquals("Non-Generic", wallet.getBrand());
	}
	@Test
	public void addCredit() {
		Wallet wallet = new Wallet();
		wallet.addCredit(0.5f);
		System.out.println("Add credit");
		assertEquals(1.0f, wallet.getAllCredit());
	}
	@Test
	public void setCredit() {
		Wallet wallet = new Wallet();
		wallet.setCredit(1.0f);
		System.out.println("Set credit");
		assertEquals(1.0f, wallet.getAllCredit());
	} 
	@Test
	public void setBrand() {
		Wallet wallet = new Wallet();
		wallet.setBrand("Non-Generic");
		System.out.println("Set brand");
		assertEquals("Non-Generic", wallet.getBrand());
	} 
	@Test
	public void withdraw() {
		Wallet wallet = new Wallet();
		wallet.setCredit(1.0f);
		wallet.getCredit(0.5f);
		System.out.println("Withdraw credit");
		assertEquals(0.5f, wallet.getAllCredit());
	} 
	@Test
	public void withdrawSurplus() {
		Wallet wallet = new Wallet();
		wallet.setCredit(0.5f);
		wallet.getCredit(1f);
		System.out.println("Withdraw surplus credit");
		assertEquals(0.5f, wallet.getAllCredit());
	} 
	
	
	
	// Hint: 
	// Others Tests for other classes that use Wallet may impact code coverage
	// Avoid relying on these tests, one test for one class; keep "Single Responsibility" in mind.
	
}
