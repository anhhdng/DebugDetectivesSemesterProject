package swe6673.debugdetectives.sprint1;

public class Exponential {

    double squareRoot(double num, double base){
        double squareRoot = Math.pow(num,1.0/base);
        return squareRoot;
    }

    double naturalLogarithm(double num){
        double ln = Math.log(num);
        return ln;
    }

    double base10Log(double num){
        double log = Math.log10(num);
        return log;

    }

    double exponent(double num, double base){
        double result = Math.pow(num, 1/base);
        return result;
    }




}

