package exercises.task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mozilla9025 on 5/22/17.
 */
public class Poem {

    private List<String> poemStrings;

    Poem(File poem) {
        Scanner scan = null;
        try {
            scan = new Scanner(poem);
            poemStrings = new ArrayList<>();
            while (scan.hasNext()) {
                poemStrings.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }
    }

    public List<String> getPoemStrings() {
        return poemStrings;
    }
}
