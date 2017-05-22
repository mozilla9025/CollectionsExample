package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mozilla9025 on 5/22/17.
 */
public class Task1 {

    private List<String> fillList(File file) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                strings.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        return strings;
    }

    private void fillFile(List<String> strings, File file) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (int i = strings.size() - 1; i >= 0; i--) {
                fileWriter.write(strings.get(i) + "\n");
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Task1 t = new Task1();
        List<String> fileStrings = t.fillList(new File("input.txt"));
        fileStrings.forEach(v -> System.out.println(v));
        t.fillFile(fileStrings, new File("output.txt"));
    }

}
