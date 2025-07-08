package Array_Challenge;

public class ArrayChallenge {
    public static void main(String[] args) {
        String[]orderGroup = {"B123", "C234", "A345", "C15" ,"B177", "G3003", "C235", "B179"};
        for (String item : orderGroup) {
            if (item.startsWith("B")) {
                System.out.println(item);
            }
        }
    }
}
