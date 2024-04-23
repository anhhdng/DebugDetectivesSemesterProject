package swe6673.debugdetectives.sprint1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpeedConverter {

    public double convertFrom(double value, String fromUnit, String toUnit) {
        try {
            double result = 0.0;
            switch (fromUnit) {
                case "km/h":
                    result = convertKmHTo(value, toUnit);
                    break;
                case "mi/h":
                    result = convertMiHTo(value, toUnit);
                    break;
                case "cm/min":
                    result = convertCmMinTo(value, toUnit);
                    break;
                case "yd/h":
                    result = convertYdHTo(value, toUnit);
                    break;
                case "mi/s":
                    result = convertMiSTo(value, toUnit);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid 'from' unit: " + fromUnit);
            }
            return round(result, 9);
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    private double convertKmHTo(double value, String toUnit) {
        try {
            double result = 0.0;
            switch (toUnit) {
                case "m/s":
                    result = value * 1000 / 3600;
                    break;
                case "km/min":
                    result = value / 60;
                    break;
                case "m/h":
                    result = value * 1000;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid 'to' unit: " + toUnit);
            }
            return result;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    private double convertMiHTo(double value, String toUnit) {
        try {
            double result = 0.0;
            switch (toUnit) {
                case "km/min":
                    result = value * 1.609344 / 60;
                    break;
                case "m/h":
                    result = value * 1609.344;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid 'to' unit: " + toUnit);
            }
            return result;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    private double convertCmMinTo(double value, String toUnit) {
        try {
            double result = 0.0;
            switch (toUnit) {
                case "ft/h":
                    result = value * 0.0328084 * 60;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid 'to' unit: " + toUnit);
            }
            return result;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    private double convertYdHTo(double value, String toUnit) {
        try {
            double result = 0.0;
            switch (toUnit) {
                case "cm/h":
                    result = value * 91.44;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid 'to' unit: " + toUnit);
            }
            return result;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    private double convertMiSTo(double value, String toUnit) {
        try {
            double result = 0.0;
            switch (toUnit) {
                case "ft/min":
                    result = value * 5280 * 60;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid 'to' unit: " + toUnit);
            }
            return result;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    private double round(double value, int places) {
        try {
            if (places < 0) throw new IllegalArgumentException();

            BigDecimal bd = BigDecimal.valueOf(value);
            bd = bd.setScale(places, RoundingMode.HALF_UP);
            return bd.doubleValue();
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }
}
