package TestPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mainPackage.CrookedDie1;
import mainPackage.Die;
import mainPackage.PredictableDie;

public class DieTest
{

private Die die;
private Die crookedDie;
	

	@Before
	public void setUp() throws Exception
	{
		
		int predictablRoll [] = {1,2,3,4,5} ; //predictablRoll has a value of 1-4 array
		die = new PredictableDie(predictablRoll); //initialize new die
		crookedDie = new CrookedDie1();
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testRoll1ofPredictableDie() 
	{
		die.roll();
		assertEquals("First roll is 1", 1, die.getLastRoll());
	}
	
	@Test
	public void testRoll1ofPredictableDie2() 
	{
		die.roll();
		die.roll();
		assertEquals("First roll is 2", 2, die.getLastRoll());
	}
	
	@Test
	public void testRoll1ofPredictableDie3() 
	{
		die.roll();
		die.roll();
		die.roll();
		assertEquals("First roll is 3", 3, die.getLastRoll());
	}

	@Test
	public void testRoll1ofPredictableDie4() 
	{
		die.roll();
		die.roll();
		die.roll();
		die.roll();
		assertEquals("First roll is 4", 4, die.getLastRoll());
	}
	
	@Test
	public void testRoll1ofPredictableDie5() 
	{
		die.roll();
		die.roll();
		die.roll();
		die.roll();
		die.roll();
		assertEquals("First roll is 5", 5, die.getLastRoll());
	}
	
	@Test
	public void testStaticOverride() 
	{
		
		assertEquals("It will say Die", "Die", crookedDie.testStatic());
	}
	
}
