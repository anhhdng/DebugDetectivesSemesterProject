package swe6673.debugdetectives.sprint1;

import javafx.scene.chart.PieChart;

public class DataConverter {
    DataConverter[] units;


    double convertFrom(double amount, String unit, String toUnit) {

        try {
            double result = 0;
            switch (unit) {
                case "byte":
                    if (toUnit.equals("kilobyte")) {
                        result = amount / 1024;
                    }
                    break;
                case "bit":
                    if (toUnit.equals("byte")) {
                        result = amount / 8;
                    }
                    break;
                case "gigibit":
                    if (toUnit.equals("gigibyte")) {
                        result = amount * (1 / 8.0);
                    }
                    break;
                case "gigabit":
                    if (toUnit.equals("gigabyte")) {
                        result = amount * (1 / 8.0);
                    }
                    break;
                case "megabit":
                    if (toUnit.equals("terabyte")) {
                        result = amount / (8 * 1024 * 1024);
                    }
                    break;
                case "megabyte":
                    if (toUnit.equals("terabit")) {
                        result = amount / (1024 * 1024);
                    }
                    if (toUnit.equals("kilobyte")) {
                        result = amount / (1024);
                    }
                    break;
            }
            return result;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }
}
