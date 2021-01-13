import java.util.Arrays;

public class markov_chain {
    public static void main(String[] args) {
        double[] observations = new import_csv("C:\\Users\\maria\\OneDrive\\Desktop\\T10Y2Y.csv",6139).read_csv();
        int length_obs = (int) (observations.length / 3)*3;
        String[] category = new String[length_obs];
        for (int i = 0; i < observations.length-1; i++) {
            if (observations[i] >= 0 & observations[i] < 0.3) {
                category[i] = "L";
            } else if (observations[i] >= 0.3 & observations[i] < 1.9) {
                category[i] = "M";
            } else {
                category[i] = "H";
            }
       }
        String[] trios = new String[(int) (observations.length / 3)];
        int i = 0;
        while (i < length_obs) {
            for (int j = 0; j < (int) (observations.length / 3); j++) {
                trios[j] = category[i] + category[i + 1] + category[i + 2];
                i += 3;
            }
        }
        System.out.println(Arrays.toString(observations));
        System.out.println(Arrays.toString(category));
        System.out.println(Arrays.toString(trios));
    }
}
