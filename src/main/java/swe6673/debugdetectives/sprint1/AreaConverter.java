package swe6673.debugdetectives.sprint1;

import java.util.HashMap;
import java.util.Map;

public class AreaConverter {
    AreaConverter[] units;

    private static final Map<String, Double> conversionRates = new HashMap<>();

    static {
        // Populate the conversion rates
        conversionRates.put("meter", 1.0);
        conversionRates.put("kilometer", 1e-6);
        conversionRates.put("centimeter", 1e4);
        conversionRates.put("millimeter", 1e6);
        conversionRates.put("mile", 3.861e-7);
        conversionRates.put("yard", 1.19599);
        conversionRates.put("foot", 10.7639);
        conversionRates.put("inch", 1550.0031);
        conversionRates.put("hectare", 1e-4);
        conversionRates.put("acre", 0.000247105);
    }

    double convertFrom(double amount, String unit, String toUnit) {
        try {
            if (!conversionRates.containsKey(unit) || !conversionRates.containsKey(toUnit)) {
                return 0;
            }

            // Convert the amount from unit to toUnit
            double conversionRate = conversionRates.get(unit);
            double result = amount / conversionRate * conversionRates.get(toUnit);

            return result;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }


    }


}
