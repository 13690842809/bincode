package unit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import bin.compounding;



public class test {

	@SuppressWarnings("deprecation")
	@Test
	
	public void test() {
		double value1=compounding.test_one(100, 10, 0.03);
		assertEquals(134.39, value1, 0.1);
		
		double value2=compounding.test_two(100, 10, 0.03);
		assertEquals(130.0, value2, 0.1);	
		
		double value3=compounding.test_three(100, 10, 0.03);
		assertEquals(76.92, value3, 0.1);	
		
		double value4=compounding.test_four(100, 200, 0.03);
		assertEquals(23.44, value4, 0.1);	
		
		double value5=compounding.test_five(100, 200, 10);
		assertEquals(0.071, value5, 0.1);
		
		double value6_1=compounding.test_six1(100, 10, 0.03);
		assertEquals(1180.77, value6_1, 0.1);
		
		double value6_2=compounding.test_six2(100, 10, 0.03);
		assertEquals(14169.35, value6_2, 0.1);
		
		double value7=compounding.test_seven(100, 10, 0.03);
		assertEquals(1.11, value7, 0.1);
	}
	
	
	
}
