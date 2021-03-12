package basicsAssignment;

public class BasicsTest {
	public static void main(String[] args) {
		Basics print = new Basics();
		
		//Print 1-255
		print.printTo255();
		
		
		//Print Odd 1-255
		print.printOdd255();
		
		
		//Print Sum
		print.printRunningSum();
		
		
		//Iterating through an array
		int[] myArray = {1,3,5,7,9,13};
		print.arrayIteration(myArray);
		
		
		//Find Max
		int[] maxArray = {-1,-100,10,1,2,0,1,22};
		print.findMax(maxArray);
		
		//Get Average
		int[] averageTest = {2,10,3};
		print.average(averageTest);
		
		//Array with Odd  Numbers
		print.oddArray();
		
		//Greater Than Y
		int[] greaterThanArr = {1,3,5,7};
		print.greaterThanY(greaterThanArr, 3);
		
		//Square The Values
		int[] arrX = {1,5,10,-2};
		print.squareTheValues(arrX);
		
		//Eliminate Negative Numbers
		int[] arrNoNeg = {1,5,10,-2};
		print.noNegNum(arrNoNeg);
		
		//Max, Min, and Average
		int[] arrMaxMinAvg = {1,5,10,-2};
		print.maxMinAvg(arrMaxMinAvg);
		
		//Shifting the Values in the Array
		int[] shiftedArr = {1,5,10,7,-2};
		print.shiftArray(shiftedArr);
		
	}
}
