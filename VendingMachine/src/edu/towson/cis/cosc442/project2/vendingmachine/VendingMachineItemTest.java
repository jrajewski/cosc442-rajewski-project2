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
public class VendingMachineItemTest {

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
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#VendingMachineItem(java.lang.String, double)}.
	 Tests successful VendingMachineItem creation. 
	 */
	@Test
	public void testVendingMachineItemSuccess() {
		//fail("Not yet implemented");
		VendingMachineItem test = new VendingMachineItem("Skittles", 1.00);
		assertEquals(test.getName(), "Skittles");
		assertEquals(test.getPrice(), 1.00, 0.0);
	}
	
	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#VendingMachineItem(java.lang.String, double)}.
	 Tests failure of VendingMachineItem creation. 
	 */
	@Test(expected=VendingMachineException.class)
	public void testVendingMachineItemPriceFail() {
		//fail("Not yet implemented");
		VendingMachineItem test = new VendingMachineItem("Skittles", -5.00);
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#getName()}.
	 Tests successful retrieval of a VendingMachineItem's name.
	 */
	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		VendingMachineItem test = new VendingMachineItem("Skittles", 1.00);
		assertEquals(test.getName(), "Skittles");
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItem#getPrice()}.
	 */
	@Test
	public void testGetPrice() {
		//fail("Not yet implemented");
		VendingMachineItem test = new VendingMachineItem("Skittles", 1.00);
		assertEquals(test.getPrice(), 1.00, 0.0);
	}

}
