package swe6673.debugdetectives.sprint1;



public class Arithmetic {

    public double add(double num1, double num2) {
        try {
            return (num1) + (num2);
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    public double subtract(double num1, double num2) {
        try {
            return num1 - num2;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }


    public double multiply(double num1, double num2) {
        try {
            return num1 * num2;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }


    public double divide(double num1, double num2) {
        try {
            if (num2 == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return num1 / num2;
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

}