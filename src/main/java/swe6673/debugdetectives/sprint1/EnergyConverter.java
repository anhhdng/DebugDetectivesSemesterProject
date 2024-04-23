package swe6673.debugdetectives.sprint1;

public class EnergyConverter {
    private static class EnergyConvert {
        private final String unitName;
        private final double conversionFactor;

        public EnergyConvert(String unitName, double conversionFactor) {
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

    private final EnergyConvert[] units;

    public EnergyConverter() {
        units = new EnergyConvert[]{
                new EnergyConvert("joules", 1.0),
                new EnergyConvert("calories", 0.000239006),
                new EnergyConvert("kilocalories", 0.239006),
                new EnergyConvert("megajoules", 1000000.0),
                new EnergyConvert("millijoules", 0.001),
                new EnergyConvert("kilojoules", 1000.0),
                new EnergyConvert("watt-hour", 3600.0),
                new EnergyConvert("electron-volt", 1.60218e-19),
                new EnergyConvert("kiloelectron-volt", 1.60218e-16),
                new EnergyConvert("horsepower", 2647795.5)
        };
    }

    public double convertFrom(double amount, String unit, String toUnit) {
        try {
            double fromConversionFactor = getConversionFactor(unit);
            double toConversionFactor = getConversionFactor(toUnit);

            if (fromConversionFactor == -1 || toConversionFactor == -1) {
                throw new IllegalArgumentException("Invalid units for conversion: " + unit + " to " + toUnit);
            }

            double convertedAmount;

            if (unit.equalsIgnoreCase("joules") && toUnit.equalsIgnoreCase("calories")) {
                convertedAmount = amount * 0.000239006;
            } else if (unit.equalsIgnoreCase("calories") && toUnit.equalsIgnoreCase("kilocalories")) {
                convertedAmount = amount * 0.001;
            } else {
                convertedAmount = amount * (fromConversionFactor / toConversionFactor);
            }

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
        for (EnergyConvert ec : units) {
            if (ec.getUnit().equalsIgnoreCase(unit)) {
                return ec.getConversionFactor();
            }
        }
        throw new IllegalArgumentException("Unknown unit: " + unit);
    }
}
