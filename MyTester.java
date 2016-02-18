import junit.framework.TestCase;


public class MyTester extends TestCase {

	public void testNfactorial() {
		MyCalculator calc = new MyCalculator();

		int[][] testValues = new int[][]{
				{0, 1}, {1, 1}, {5, 120}, {9, 362880}, {12, 479001600}
		};
	
		for(int[] testCase: testValues) {
			assertEquals("Expected " + testCase[0] + "! = " + testCase[1], testCase[1], calc.nfactorial(testCase[0]), 0.0);
		}
	}

	public void testBinarySearch() {
		MyCalculator calc = new MyCalculator();
		int[] testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		assertEquals("Expected -1" , -1, calc.binarySearch({}, 0), 0.0);
		assertEquals("Expected 4" , 4, calc.binarySearch(testArray, 5), 0.0);
		assertEquals("Expected 7" , 7, calc.binarySearch(testArray, 8), 0.0);
		assertEquals("Expected 1" , 1, calc.binarySearch(testArray, 2), 0.0);
	}

}
