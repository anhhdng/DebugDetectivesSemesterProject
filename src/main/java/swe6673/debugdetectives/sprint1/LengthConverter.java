package swe6673.debugdetectives.sprint1;

public class LengthConverter {
//either use enum class or class with array of units. use meter as standard (1.0)

    private static class LengthConvert {
        private final String unitName;
        private final double conversionFactor;

        public LengthConvert(String unitName, double conversionFactor) {
            this.unitName = unitName;
            this.conversionFactor = conversionFactor;
        }

        public String getUnit() {
            return unitName;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    private final LengthConvert[] units;
    //example: new LengthConvert("centimeters", 0.01)

    public LengthConverter() {
        units = new LengthConvert[]{
                new LengthConvert("meter", 1.0),
                new LengthConvert("centimeter", 0.01),
                new LengthConvert("kilometer", 1000.0),
                new LengthConvert("millimeter", 0.001),
                new LengthConvert("mile", 1609.344),
                new LengthConvert("yard", 9.144),
                new LengthConvert("foot", 3.048),
                new LengthConvert("inch", 0.0254)
        };
    }

    public double convertFrom(double amount, String unit, String toUnit) {
        try {
            double fromConversionFactor = getConversionFactor(unit);
            double toConversionFactor = getConversionFactor(toUnit);

            if (fromConversionFactor == -1 || toConversionFactor == -1) {
                throw new IllegalArgumentException("Invalid units for conversion: " + unit + " to " + toUnit);
            }

            double convertedAmount = amount * (fromConversionFactor / toConversionFactor);

            if (amount < 0 && convertedAmount > 0) {
                convertedAmount *= -1;
            }

            return convertedAmount;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    private double getConversionFactor(String unit) {
        for (LengthConvert lc : units) {
            if (lc.getUnit().equalsIgnoreCase(unit)) {
                return lc.getConversionFactor();
            }
        }
        throw new IllegalArgumentException("Unknown unit: " + unit);
    }
}
