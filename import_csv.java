import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class import_csv{
    private String path;

    public import_csv(String path){
        this.path = path;
    }

    public List<Double> read_csv(){
        File file = new File(path);
        List<Double> rate = new ArrayList<Double>();
        int i = 0;
        try{
            Scanner inputStream = new Scanner(file);
            while (inputStream.hasNext()){
                String data = inputStream.next();
                double rates = Double.parseDouble(data);
                rate.add(rates);
                i+= 1;
            }
            inputStream.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return rate;
    }
}