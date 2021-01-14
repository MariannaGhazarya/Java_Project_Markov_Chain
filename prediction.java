import java.util.ArrayList;
import java.util.List;

public class prediction {
    List<String> trio;
    String AAA;
    double[][] prob_matrix;

    public prediction(List<String> trio,  double[][] prob_matrix) {
        this.trio = trio;
        this.prob_matrix = prob_matrix;
    }

    public String make_prediction(String AAA) {
        List<String> unique1 = new ArrayList<String>();
        for (int i = 0; i < trio.size(); i++) {
            if (unique1.contains(trio.get(i))) {
                continue;
            } else {
                unique1.add(trio.get(i));
            }
        }
        int index = 0;
        for (int i = 0; i < unique1.size(); i++) {
            if (AAA.equals(unique1.get(i))) {
                index = i;
                break;
            }
        }
        int largest = 0;
        for (int j = 0; j < unique1.size(); j++) {
            if (prob_matrix[index][j] > prob_matrix[index][largest]) {
                largest = j;
            }
        }
        System.out.println(unique1.get(largest));
        return unique1.get(largest);
    }

}
