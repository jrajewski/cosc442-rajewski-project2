/**
 * 
 */
package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ringo
 *
 */
public class VendingMachineTest {

	/**
	 * @throws java.lang.Exception
	 */
	private VendingMachine vendingMachineTest;
	
	@Before
	public void setUp() throws Exception {
		vendingMachineTest = new VendingMachine();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem, java.lang.String)}.
		Test to successfully add an item to the vending machine.
	 */
	@Test
	public void testAddItemSuccess() {
		//fail("Not yet implemented");
		VendingMachineItem addItem = new VendingMachineItem("Pass", 99999);
		
		vendingMachineTest.addItem(addItem, "A");
		
		assertEquals(vendingMachineTest.getItem("A").getName(), "Pass");
	}
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#addItem(edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem, java.lang.String)}.
		Test to fail adding an item to the vending machine.
	 */
	

	@Test(expected=VendingMachineException.class)
	public void testAddItemFailure() {
		//fail("Not yet implemented");
		VendingMachineItem addItem2 = new VendingMachineItem("Pass", 99999);
		
		//using invalid code to throw exception
		vendingMachineTest.addItem(addItem2, "E");

		//assertNotEquals(vendingMachineTest.getItem("A"), "Pass");
		assertNull(vendingMachineTest.getItem("E"));
	}


	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 Tests successful removal of an item from the vending machine.
	 */
	@Test
	public void testRemoveItemSuccess() {
		//fail("Not yet implemented");
		VendingMachineItem addItem = new VendingMachineItem("Pass", 99999);
		vendingMachineTest.addItem(addItem, "A");
		
		vendingMachineTest.removeItem("A");
		assertNull(vendingMachineTest.getItem("A"));
	}
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 Tests failed removal of an item from the vending machine by testing if the exception is thrown.
	 */
	@Test(expected=VendingMachineException.class)
	public void testRemoveItemFailure() {
		//fail("Not yet implemented");
		//VendingMachineItem addItem1 = new VendingMachineItem("Pass", 99999);
		//vendingMachineTest.addItem(addItem1, "A");
		
		vendingMachineTest.removeItem("A");
		//assertNotNull(vendingMachineTest.getItem("A"));
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#insertMoney(double)}.
	 Tests that the balance inserted to the vending machine is 
	 */
	@Test
	public void testInsertMoneySuccess() {
		//fail("Not yet implemented");
		vendingMachineTest.insertMoney(10.00);
		assertEquals(vendingMachineTest.getBalance(), 10.00, 0.0);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#insertMoney(double)}.
	 */
	@Test(expected=VendingMachineException.class)
	public void testInsertMoneyFailure() {
		//fail("Not yet implemented");
		vendingMachineTest.insertMoney(-10.00);
	}
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#getBalance()}.
	 Test to verify the correct initial balance is retrieved from the vending machine.
	 */
	@Test
	public void testGetBalanceInitial() {
		//fail("Not yet implemented");
		assertEquals(vendingMachineTest.getBalance(), 0.0, 0.0);
	}
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#getBalance()}.
	 Test to verify the correct balance is retrieved from the vending machine after inserting money.
	 */
	@Test
	public void testGetBalanceAdd() {
		//fail("Not yet implemented");
		vendingMachineTest.insertMoney(10.00);
		assertEquals(vendingMachineTest.getBalance(), 10.0, 0.0);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 Tests successful purchase.
	 */
	@Test
	public void testMakePurchaseSuccess() {
		//fail("Not yet implemented");
		VendingMachineItem addItem = new VendingMachineItem("Pass", 5.0);
		vendingMachineTest.addItem(addItem, "A");
		
		vendingMachineTest.insertMoney(10.00);
		
		assertEquals(vendingMachineTest.makePurchase("A"), true);
	}
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 Tests failure for insufficient funds for item.
	 */
	@Test
	public void testMakePurchaseNoMoneyFailure() {
		//fail("Not yet implemented");
		VendingMachineItem addItem = new VendingMachineItem("Pass", 5.0);
		vendingMachineTest.addItem(addItem, "A");
		
		vendingMachineTest.insertMoney(0.0);
		
		assertEquals(vendingMachineTest.makePurchase("A"), false);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 Tests failure to vend item if there is no item in the given slot.
	 */
	@Test
	public void testMakePurchaseNoItemFailure() {
		//fail("Not yet implemented");
		vendingMachineTest.insertMoney(10.0);
		
		assertEquals(vendingMachineTest.makePurchase("A"), false);
	}
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#returnChange()}.
	 Tests successful return of change to user.
	 */
	@Test
	public void testReturnChangeSuccess() {
		//fail("Not yet implemented");
		vendingMachineTest.insertMoney(10.0);
		vendingMachineTest.returnChange();
		assertEquals(vendingMachineTest.getBalance(), 0.0, 0.0);
	}

}
