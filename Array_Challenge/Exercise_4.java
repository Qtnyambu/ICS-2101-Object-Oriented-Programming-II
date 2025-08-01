package Array_Challenge;

import java.util.Arrays;

public class Exercise_4 {

    public static void main (String[] args) {

        String[] pallets = {"B14", "A11", "B12", "A13" };

        System.out.println();

        Arrays.fill(pallets,0, 2, null);

        if (pallets[0] != null) {
            System.out.println("After: " +pallets[0].toLowerCase());
        } else {
            System.out.println("After: null");
        }

        System.out.println("Clearing 2 ... count: " +pallets.length);
        for (String pallet : pallets) {
            System.out.println("--" +pallet);
        }
    }


}