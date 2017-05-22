package exercises.task6;

import java.io.File;
import java.util.*;

/**
 * Created by mozilla9025 on 5/22/17.
 */
public class Task6 {

    private List<Poem> sortByLength(List<Poem> poems) {
        for (Poem poem : poems) {
            Collections.sort(poem.getPoemStrings(), new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.length() == s2.length() ? 0 : s1.length() > s2.length() ? 1 : -1;
                }
            });
        }
        return poems;
    }

    public static void main(String[] args) {
        List<Poem> poems = new ArrayList<>();

        poems.add(new Poem(new File("poems/poem1")));
        poems.add(new Poem(new File("poems/poem2")));

        Task6 task6 = new Task6();

        task6.sortByLength(poems);

        poems.forEach(v -> v.getPoemStrings().forEach(s -> System.out.println(s)));
    }


}
