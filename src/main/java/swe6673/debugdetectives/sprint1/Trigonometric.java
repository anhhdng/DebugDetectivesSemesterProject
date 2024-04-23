package swe6673.debugdetectives.sprint1;

public class Trigonometric {

    double sin(double num) {
        try {
            return Math.sin(Math.toRadians(num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double cos(double num) {
        try {
            return Math.cos(Math.toRadians(num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double tan(double num) {
        try {
            return Math.tan(Math.toRadians(num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double sec(double num) {
        try {
            return 1 / Math.cos(Math.toRadians(num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double csc(double num) {
        try {
            return 1 / Math.sin(Math.toRadians(num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double cot(double num) {
        try {
            return 1 / Math.tan(Math.toRadians(num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double arcsin(double num) {
        try {
            return Math.toDegrees(Math.asin(num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double arccos(double num) {
        try {
            return Math.toDegrees(Math.acos(num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double arctan(double num) {
        try {
            return Math.toDegrees(Math.atan(num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double arcsec(double num) {
        try {
            return Math.toDegrees(Math.acos(1 / num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double arccsc(double num) {
        try {
            return Math.toDegrees(Math.asin(1 / num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }

    double arccot(double num) {
        try {
            return Math.toDegrees(Math.atan(1 / num));
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return 0;
        }
    }
}
