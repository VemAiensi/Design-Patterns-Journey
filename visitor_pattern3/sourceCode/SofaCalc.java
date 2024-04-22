package visitor_pattern3.sourceCode;
import java.util.HashMap;
import java.util.Map;

public class SofaCalc implements ShipmentCalc{
    private static Map<String, Double> sizeChart = new HashMap<>();
    static {//the value parameter (double) represents 
            //cost per kilometer of distance to travel
        sizeChart.put("small", 120.0);
        sizeChart.put("medium", 200.0);
        sizeChart.put("large", 300.0);
    }

    @Override
    public double compute(double size, double distance) {
        // Picking the size category
        String ctg = "";
        double extra = 0.0;
        //sofas commonly needs extra cost for delivery safety 

        if(size <=57.0){
            ctg = "small";
            extra = 10.0;
        }
        else if(size > 58.0 && size < 72.0){
            ctg = "medium";
            extra = 20.0;
        }
        else{
            ctg = "large";
            extra = 40.0;
        }

        return sizeChart.get(ctg)*distance + extra;
    }
    
}
