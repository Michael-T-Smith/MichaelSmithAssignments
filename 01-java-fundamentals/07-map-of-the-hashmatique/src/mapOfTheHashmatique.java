import java.util.HashMap;
import java.util.Set;
public class mapOfTheHashmatique {
	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("The Gift", "I'm so afraid of the gift you give me");
		trackList.put("Weak", "When I get weak or I'm tired and afraid.");
		trackList.put("The Sickness", "Get down with the sickness");
		trackList.put("Bismarck", "He was made to rule the waves across the seven seas.");
		String trackName = trackList.get("Bismarck");
		System.out.println("song by track name: " + trackName);
		Set<String> lyrics = trackList.keySet();
		System.out.println("\n all contents of the track list: \n");
		for(String key : lyrics) {
			System.out.println(key);
			System.out.println(trackList.get(key) + "\n");
		}
	}
}
