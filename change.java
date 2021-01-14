import java.util.ArrayList;
import java.util.List;

public class change {
    List<Double> Observed;
    public change(List<Double> observations) {
        this.Observed = observations;
    }

    public List<Double> calculate_diff() {
        List<Double> delta = new ArrayList<Double>();
        delta.add(0.0);
        double d = 0;
        for (int i = 1; i < Observed.size(); i++) {
            d = (Observed.get(i) - Observed.get(i - 1)) / Observed.get(i - 1);
            delta.add(d);
        }
        return delta;
    }
}


