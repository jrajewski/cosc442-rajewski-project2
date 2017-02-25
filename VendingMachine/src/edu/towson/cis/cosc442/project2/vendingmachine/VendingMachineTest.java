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
	@Before
	public void setUp() throws Exception {
		
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
	public void testAddItem() {
		//fail("Not yet implemented");
		VendingMachineItem addItem1 = new VendingMachineItem("Joe", 1000000);
		
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#removeItem(java.lang.String)}.
	 */
	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#insertMoney(double)}.
	 */
	@Test
	public void testInsertMoney() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#makePurchase(java.lang.String)}.
	 */
	@Test
	public void testMakePurchase() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachine#returnChange()}.
	 */
	@Test
	public void testReturnChange() {
		fail("Not yet implemented");
	}

}
