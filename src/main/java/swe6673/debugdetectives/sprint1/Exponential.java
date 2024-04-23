package swe6673.debugdetectives.sprint1;

public class Exponential {

    double squareRoot(double num, double base){
        try {
            double squareRoot = Math.pow(num, 1.0 / base);
            return squareRoot;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double naturalLogarithm(double num){
        try {
            double ln = Math.log(num);
            return ln;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double base10Log(double num){
        try {
            double log = Math.log10(num);
            return log;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }

    }

    double exponent(double num, double base){
        try {
            double result = Math.pow(num, 1 / base);
            return result;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }




}

