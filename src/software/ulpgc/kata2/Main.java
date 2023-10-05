package software.ulpgc.kata2;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CustomerLoader loader = new CsvFileLaptopLoader(new File("laptops_train.csv"));
        List<Laptop> laptops = loader.load();
        Map<String, Integer> chart = new HashMap<>();

        for (Laptop laptop : laptops) {
            String manufacturer = laptop.getManufacturer();
            if (chart.containsKey(manufacturer)) {
                chart.put(manufacturer, chart.get(manufacturer) + 1);
            }
            else {
                chart.put(manufacturer, 1);
            }
        }

        for (String key : chart.keySet()) {
            System.out.println(key + ": " + chart.get(key));
        }
    }
}
