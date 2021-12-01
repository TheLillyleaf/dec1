import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class OneA {
    public static void main(String[] args) throws Exception {

        int countIncrease = 0;
        int countDecrease = 0;
        ArrayList<Integer> array = new ArrayList<>();

        try {
            File input = new File("input");

            Scanner scanner = new Scanner(input);

            while (scanner.hasNextLine()) {
                array.add(Integer.parseInt(scanner.nextLine()));

            }

        } catch (Exception e) {
            // TODO: handle exception
        }
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > array.get(i - 1)) {
                countIncrease++;

            }

        }

        System.out.println(countIncrease);
    }
}
