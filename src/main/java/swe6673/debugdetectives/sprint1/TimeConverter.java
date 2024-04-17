package swe6673.debugdetectives.sprint1;

import java.util.HashMap;
import java.util.Map;

public class TimeConverter {
    private static class TimeConvert {
        private final String unitName;
        private final double conversionFactor;

        public TimeConvert(String unitName, double conversionFactor) {
            this.unitName = unitName;
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    private final Map<String, TimeConvert> units;

    public TimeConverter() {
        units = new HashMap<>();
        units.put("millisecond", new TimeConvert("millisecond", 0.001));
        units.put("second", new TimeConvert("second", 1));
        units.put("minute", new TimeConvert("minute", 60));
        units.put("hour", new TimeConvert("hour", 3600));
        units.put("day", new TimeConvert("day", 86400));
        units.put("week", new TimeConvert("week", 604800));
        units.put("century", new TimeConvert("century", 3155695200.0));
        units.put("decade", new TimeConvert("decade", 315569520.0));
        units.put("millennium", new TimeConvert("millennium", 31556952000.0));
    }

    public double convertFrom(double amount, String unit, String toUnit) {
        TimeConvert from = units.get(unit);
        TimeConvert to = units.get(toUnit);

        return amount * from.getConversionFactor() / to.getConversionFactor();
    }
}
