import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.lang.Math.round;

public class markov_matrix {
    List <String> trios;
    public markov_matrix(List<String> trios){
        this.trios = trios;
    }
    public double [][] create_transition_matrix() {
        List<String> unique = new ArrayList<String>();
        for (int i = 0; i < trios.size(); i++) {
            if (unique.contains(trios.get(i))) {
                continue;
            } else {
                unique.add(trios.get(i));
            }
        }
        int[][] matrix = new int[unique.size()][unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            for (int j = 0; j < unique.size(); j++) {
                matrix[i][j] = 0;
                for (int f = 0; f < trios.size() - 1; f++) {
                    if (trios.get(f).equals(unique.get(i)) & trios.get(f + 1).equals(unique.get(j))) {
                        matrix[i][j] = matrix[i][j] + 1;
                    }
                }
            }
        }
        System.out.println(" ");

        double[] sums = new double[unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            for (int j = 0; j < unique.size(); j++) {
                sums[i] += matrix[i][j];
            }
        }
        double[][] probability_matrix = new double[unique.size()][unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            for (int j = 0; j < unique.size(); j++) {
                probability_matrix[i][j] = round((matrix[i][j] / sums[i]) * 100);
            }
            System.out.println(Arrays.toString(probability_matrix[i]));
        }
        return probability_matrix;
    }
}
