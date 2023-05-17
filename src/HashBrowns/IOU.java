package HashBrowns;

import java.util.Date;
import java.util.HashMap;

public class IOU {
    HashMap<String, Double> hashmap;

    public IOU(){
        hashmap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        hashmap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        if(hashmap.get(toWhom) == null){
            return 0;
        } else {
            return hashmap.get(toWhom);
        }

    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
