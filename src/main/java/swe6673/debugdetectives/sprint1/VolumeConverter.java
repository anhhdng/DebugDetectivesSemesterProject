package swe6673.debugdetectives.sprint1;

import java.util.HashMap;
import java.util.Map;

//use for both volume and cooking

public class VolumeConverter {
    private static class VolumeConvert {
        private final String unitName;
        private final double conversionFactor;

        public VolumeConvert(String unitName, double conversionFactor) {
            this.unitName = unitName;
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    private final Map<String, VolumeConvert> units;

    public VolumeConverter() {
        units = new HashMap<>();
        units.put("USGallon", new VolumeConvert("USGallon", 3.78541));
        units.put("ImperialGallon", new VolumeConvert("ImperialGallon", 4.54609));
        units.put("USQuart", new VolumeConvert("USQuart", 0.946353));
        units.put("USTablespoon", new VolumeConvert("USTablespoon", 0.0147868));
        units.put("ImperialCup", new VolumeConvert("ImperialCup", 0.284131));
        units.put("Liter", new VolumeConvert("Liter", 1.0));
        units.put("ImperialOunce", new VolumeConvert("ImperialOunce", 0.0284131));
        units.put("Milliliter", new VolumeConvert("Milliliter", 0.001));
        units.put("USTeaspoon", new VolumeConvert("USTeaspoon", 0.00492892));
        units.put("USPint", new VolumeConvert("USPint", 0.473176));
        units.put("ImperialPint", new VolumeConvert("ImperialPint", 0.568261));
        units.put("CubicFoot", new VolumeConvert("CubicFoot", 61.0237441));
        units.put("CubicInch", new VolumeConvert("CubicInch", 0.0353147));
    }

    public double convertFrom(double amount, String unit, String toUnit) {
        VolumeConvert from = units.get(unit);
        VolumeConvert to = units.get(toUnit);

        if (from == null || to == null) {
            throw new IllegalArgumentException("Unknown unit");
        }

        return amount * (from.getConversionFactor() / to.getConversionFactor());
    }
}
