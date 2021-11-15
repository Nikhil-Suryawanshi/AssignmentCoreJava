package Assignment_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	int arr[]= {56,34,7,3,54,3,34,34,53};
	@Test
	void checkMinMaxtest() {
		MinMaxFinder minmax=new MinMaxFinder();
		int expectedArray[]= {3,56};
		int actualArray[]=minmax.findMinMax(arr);
		assertArrayEquals(expectedArray,actualArray);
	}
	
	@Test
	void checkReturnTypeTest() {
		
	}
	
	@Test
	void checkValues() {
		
	}

}
