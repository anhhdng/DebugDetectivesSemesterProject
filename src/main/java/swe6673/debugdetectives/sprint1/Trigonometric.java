package swe6673.debugdetectives.sprint1;

public class Trigonometric {

    double sin(double num) {
        return Math.sin(Math.toRadians(num));
    }

    double cos(double num) {
        return Math.cos(Math.toRadians(num));
    }

    double tan(double num) {
        return Math.tan(Math.toRadians(num));
    }

    double sec(double num) {
        return 1 / Math.cos(Math.toRadians(num));
    }

    double csc(double num) {
        return 1 / Math.sin(Math.toRadians(num));
    }

    double cot(double num) {
        return 1 / Math.tan(Math.toRadians(num));
    }

    double arcsin(double num) {
        return Math.toDegrees(Math.asin(num));
    }

    double arccos(double num) {
        return Math.toDegrees(Math.acos(num));
    }

    double arctan(double num) {
        return Math.toDegrees(Math.atan(num));
    }

    double arcsec(double num) {
        return Math.toDegrees(Math.acos(1 / num));
    }

    double arccsc(double num) {
        return Math.toDegrees(Math.asin(1 / num));
    }

    double arccot(double num) {
        return Math.toDegrees(Math.atan(1 / num));
    }
}
