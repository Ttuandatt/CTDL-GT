import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Dictionary<String, String>> dictionaryList = new ArrayList<Dictionary<String, String>>();
        // Thêm nhiều cặp vào danh sách
        dictionaryList.add(new Dictionary<>("Hello", "Xin chào"));
        dictionaryList.add(new Dictionary<>("How old are you?", "Bạn bao nhiêu tuổi"));
        dictionaryList.add(new Dictionary<>("Thank you", "Cảm ơn"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in English word: ");
        String word = scanner.nextLine();

        boolean found = false;
        for(Dictionary<String, String> dictionary : dictionaryList) {
            if(word.equalsIgnoreCase(dictionary.getKey())){
                found = true;
                System.out.println(dictionary.toString());
                break;
            }
        }

        if (!found) {
            System.out.println("Word not found in dictionary.");
        }
    }
}
