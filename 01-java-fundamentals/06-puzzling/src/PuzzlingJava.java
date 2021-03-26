import java.util.*;

public class PuzzlingJava {
	public static void main(String[] args) {
		int[] greaterThan10 = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
		sumAndGreaterThan10(greaterThan10);
		stringArray();
		randomArray();
		randomString();

	}

	public static void sumAndGreaterThan10(int[] arr) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] > 10) {
				newArr.add(arr[i]);
			}
		}
		System.out.println("Running Sum: " + sum);
		System.out.println("Numbers Greater than 10: " + newArr);
	}

	public static void stringArray() {
		List<String> namesList = Arrays.asList("Nancy", "Jinichi", "Fujibayasho", "Momochi", "Ishikawa");
		ArrayList<String> nameArr = new ArrayList<String>();
		ArrayList<String> greaterArr = new ArrayList<String>();
		nameArr.addAll(namesList);
		Collections.shuffle(nameArr);
		for (int i = 0; i < nameArr.size(); i++) {
			if (nameArr.get(i).length() > 10) {
				greaterArr.add(nameArr.get(i));
			}
		}
		System.out.println(nameArr);
		System.out.println("Name longer than 10: " + greaterArr);

		String characters = "abcdefghijklmnopqrstuvwxyz";
		char[] chars = characters.toCharArray();
		List<Character> alphabet = new ArrayList<Character>();
		
		for (char c : chars) {
			alphabet.add(c);
		}
		
		System.out.println("alphabet not shuffled: " + alphabet);
		Collections.shuffle(alphabet);
		System.out.println("alphabet shuffled: " + alphabet);
		System.out.println("Last Letter: " + alphabet.get(25));
		System.out.println("First Letter: " + alphabet.get(0));
		
		if (alphabet.get(0) == 'a' || alphabet.get(0) == 'e' || alphabet.get(0) == 'i' 
				|| alphabet.get(0) == 'o' || alphabet.get(0) == 'u') {
			System.out.println("First letter is a vowel");
		} else {
			System.out.println("First letter is not a vowel");
		}

	}
	
	public static void randomArray() {
		
		Random ranNum = new Random();
		int[] randomArr = new int[10];
		for(int i = 0; i < randomArr.length; i++) {
			int randomNumber = ranNum.nextInt((100 - 55) + 1) + 55;
			randomArr[i] = randomNumber;
		}
		
		System.out.println("Random Array: " + Arrays.toString(randomArr));
		List<Integer>sortedArray = new ArrayList<Integer>();
		for(int i = 0; i < randomArr.length; i++) {
			sortedArray.add(randomArr[i]);
		}
		
		Collections.sort(sortedArray);
		System.out.println("sorted array: " + sortedArray);
		System.out.println("Minimum Value: " + sortedArray.get(0));
		System.out.println("Maximum Value: " + sortedArray.get(9));
		
	}
	
	public static void randomString() {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		int length = 5;
		
		for(int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}
		String randomString = sb.toString();
		System.out.println("Random String: " + randomString);
		
	}	
}
