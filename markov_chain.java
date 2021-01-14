import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class markov_chain {
    List<Double> observations;
    public markov_chain(List<Double> observations){
        this.observations = observations;
    }
    public List<String> create_trio_series(){

        int length_obs = (int) (observations.size() / 3)*3;
        String[] category = new String[length_obs];
        for (int i = 0; i < observations.size()-1; i++) {
            if (observations.get(i) >= 0 & observations.get(i) < 0.46) {
                category[i] = "L";
            } else if (observations.get(i)  >= 0.46 & observations.get(i)  < 1.68) {
                category[i] = "M";
            } else {
                category[i] = "H";
            }
        }
        List<String> trios = new ArrayList<String>();
        for(int g = 0; g < length_obs; g += 3) {
            trios.add(category[g] + (category[g + 1]) + (category[g + 2]));
        }

//        System.out.println(observations);
//        System.out.println(" ");
//        System.out.println(Arrays.toString(category));
//        System.out.println(" ");
//        System.out.println(trios);
//        System.out.println(" ");
        return trios;
    }
}
