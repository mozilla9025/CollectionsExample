package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mozilla9025 on 5/22/17.
 */
public class Task9 {

    private double OLS(List<Double> U, List<Double> I) {

        double sumUI = 0;
        double sumSqrI = 0;

        if (isSizeEqual(U, I)) {
            for (int i = 0; i < U.size(); i++) {
                sumUI += U.get(i) * I.get(i);
                sumSqrI += Math.pow(I.get(i), 2);
            }
        }
        return sumUI / sumSqrI;
    }

    private boolean isSizeEqual(List<Double> U, List<Double> I) {
        if (!U.isEmpty() && !I.isEmpty() && U.size() == I.size()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        List<Double> U = new ArrayList<>();
        List<Double> I = new ArrayList<>();

        I.addAll(Arrays.asList(0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0,
                1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0));
        U.addAll(Arrays.asList(0.27, 0.56, 0.9, 1.18, 1.49, 1.79, 2.05, 2.42, 2.68,
                3.01, 3.35, 3.56, 3.85, 4.18, 4.48, 4.79, 5.12, 5.45, 5.68, 5.9));

        System.out.println(new Task9().OLS(U, I));
    }
}
