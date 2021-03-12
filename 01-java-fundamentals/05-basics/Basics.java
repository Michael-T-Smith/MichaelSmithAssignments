package basicsAssignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Basics {
	public void printTo255() {
		for(int i = 0; i < 256; i++) {
			System.out.println(i);
		}
	}
	
	public void printOdd255() {
		for (int i = 1; i < 256; i += 2) {
			System.out.println(i);
		}
	}
	
	public void printRunningSum() {
		int num = 0;
		int sum = 0;
		for(int i = 0; i < 256; i++) {
			sum = i + sum;
			num = i;
			System.out.println("New number: " + num + " Sum: " + sum);
		}
	}
	
	public void arrayIteration(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	
	public void average(int[] arr) {
		int sum = 0;
		int amountOfNums = arr.length;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum/amountOfNums);
	}
	
	public void oddArray () {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i = 1; i < 256; i+=2) {
			y.add(i);
		}
		System.out.println(y);
			
	}
	
	public void greaterThanY(int[] arr, int y) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(y < arr[i]) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
	public void squareTheValues(int[] arrX) {
		ArrayList<Integer> arrSquared = new ArrayList<Integer>();
		for(int i = 0; i < arrX.length; i++) {
			arrSquared.add(arrX[i] * arrX[i]);
		}
		System.out.println(arrSquared);	
	}
	
	public void noNegNum(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void maxMinAvg(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		float sum = 0;
		float average = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;
			
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
			
		}
		average = sum / arr.length;
		System.out.println(max + ", " + min + ", " + average);
	}
	
	public void shiftArray(int[] arr) {
		ArrayList<Integer> shiftedArray = new ArrayList<Integer>();
		for(int i = 1; i < arr.length; i++) {
			shiftedArray.add(arr[i]);
		}
		shiftedArray.add(0);
		System.out.println(shiftedArray);
	}

}