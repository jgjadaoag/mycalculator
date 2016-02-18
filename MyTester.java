import junit.framework.TestCase;


public class MyTester extends TestCase {

	public void testNfactorial() {
		MyCalculator calc = new MyCalculator();

		int[][] lessThan10 = new int[][]{
				{-1, -1}, {0, 1}, {1, 1}, {3, 6}, {5, 120}, {9, 362880}
		};
	
		for(int[] testCase: lessThan10) {
			assertEquals("Expected " + testCase[0] + "! = " + testCase[1], testCase[1], calc.nfactorial(testCase[0]), 0.0);
		}
		
		int[][] greaterThanEqual10 = new int[][]{
				{10, 3628800}, {11, 39916800}, {12, 479001600}
		};
	
		for(int[] testCase: greaterThanEqual10) {
			assertEquals("Expected " + testCase[0] + "! = " + testCase[1], testCase[1], calc.nfactorial(testCase[0]), 0.0);
		}
	}

	public void testBinarySearch() {
		MyCalculator calc = new MyCalculator();
		int[] testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] testArray2 = new int[]{};
		assertEquals("Expected -1" , -1, calc.binarySearch(testArray2, 0), 0.0);
		assertEquals("Expected 4" , 4, calc.binarySearch(testArray, 5), 0.0);
		assertEquals("Expected 7" , 7, calc.binarySearch(testArray, 8), 0.0);
		assertEquals("Expected 1" , 1, calc.binarySearch(testArray, 2), 0.0);
	}

}
