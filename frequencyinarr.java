import java.util.HashMap;

public class frequencyinarr {
    public static void main(String[] args) {
        // Input character array
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'a', 'd'};

        // Create a HashMap to store frequency
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Traverse the array
        for (char ch : arr) {
            if (frequencyMap.containsKey(ch)) {
                // If character exists, increment count
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                // If character does not exist, initialize count to 1
                frequencyMap.put(ch, 1);
            }
        }

        // Print frequency of each character
        System.out.println("Character frequencies:");
        for (char ch : frequencyMap.keySet()) {
            System.out.println(ch + " -> " + frequencyMap.get(ch));
        }
    }
}