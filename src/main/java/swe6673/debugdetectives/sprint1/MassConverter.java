package swe6673.debugdetectives.sprint1;

import java.util.HashMap;
import java.util.Map;

public class MassConverter {
    private static class MassConvert {
        private final String unitName;
        private final double conversionFactor;

        public MassConvert(String unitName, double conversionFactor) {
            this.unitName = unitName;
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    private final Map<String, MassConvert> units;

    public MassConverter() {
        units = new HashMap<>();
        units.put("metricTon", new MassConvert("metricTon", 1000000));
        units.put("kilogram", new MassConvert("kilogram", 1000));
        units.put("gram", new MassConvert("gram", 1));
        units.put("milligram", new MassConvert("milligram", 0.000001));
        units.put("microgram", new MassConvert("microgram", 0.000000001));
        units.put("stone", new MassConvert("stone", 6350.29318));
        units.put("pound", new MassConvert("pound", 453.59237));
        units.put("imperialTon", new MassConvert("imperialTon", 1016046.91));
        units.put("USTon", new MassConvert("USTon", 907184.74));
    }

    public double convertFrom(double amount, String unit, String toUnit) {
        try {
            MassConvert from = units.get(unit);
            MassConvert to = units.get(toUnit);

            return amount * (from.getConversionFactor() / to.getConversionFactor());
        }
        catch(Exception e){
            throw new IllegalArgumentException("Unknown unit: " + unit);
        }

    }
}
