import java.util.ArrayList;
import java.util.List;

public class implementation {
    public static void main (String [] args){
        List<Double> observations = new import_csv("C:\\Users\\maria\\OneDrive\\Desktop\\T10Y2Y.csv").read_csv();
        List<String> example_trios = new markov_chain(observations).create_trio_series();
        double [][] example_matrix = new markov_matrix(example_trios).create_transition_matrix();
        String  example_prediction = new prediction(example_trios, example_matrix).make_prediction("MLM");
    }
}
