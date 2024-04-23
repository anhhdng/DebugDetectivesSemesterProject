package swe6673.debugdetectives.sprint1;

public class TemperatureConverter {
    double celsiusToFahrenheit(double temp){
        try {
            temp = (temp * 9 / 5) + 32;
            return temp;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }
    double celsiusToKelvin(double temp){
        try {
            temp += 273.15;
            return temp;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }
    double fahrenheitToCelsius(double temp){
        try {
            temp = (temp - 32) * 5 / 9;
            return temp;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }
    double fahrenheitToKelvin(double temp){
        try {
            temp = (temp + 459.67) * 5 / 9;
            return temp;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }
    double kelvinToCelsius(double temp){
        try {
            temp -= 273.15;
            return temp;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }
    double kelvinToFarenheit(double temp){
        try {
            temp = (temp * 9 / 5) - 459.67;
            return temp;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }


}


