package swe6673.debugdetectives.sprint1;

public class TemperatureConverter {
    double celsiusToFahrenheit(double temp){
        temp = (temp * 9 / 5) + 32;
        return temp;
    }
    double celsiusToKelvin(double temp){
        temp += 273.15;
        return temp;
    }
    double fahrenheitToCelsius(double temp){
        temp = (temp - 32) * 5 / 9;
        return temp;
    }
    double fahrenheitToKelvin(double temp){
        temp = (temp + 459.67) * 5 / 9;
        return temp;
    }
    double kelvinToCelsius(double temp){
        temp -= 273.15;
        return temp;
    }
    double kelvinToFarenheit(double temp){
        temp = (temp * 9 / 5) - 459.67;
        return temp;
    }


}


