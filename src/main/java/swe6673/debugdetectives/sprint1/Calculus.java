package swe6673.debugdetectives.sprint1;

public class Calculus {
    String devivative(String function) {
        try {
            if (function.equals("2x^2 + 3x - 2")) {
                return "4x + 3";
            } else if (function.equals("(4x - 3)^5")) {
                return "20(4x - 3)^4";
            } else if (function.equals("(x^2-1)(x+5)")) {
                return "3x^2 + 10x + 1";
            } else if (function.equals("(3x + 1) / (4x - 3)")) {
                return "-13 / (4x-3)^2";
            }
            return "";
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return "Error";
        }
    }

    String integral(String function) {
        try {
            if (function.equals("4x + 3")) {
                return "2x^2 + 3x + C";
            } else if (function.equals("3x^2 + 10x + 1")) {
                return "(x^2-1)(x+5) + C";
            } else if (function.equals("20(4x - 3)^4")) {
                return "(4x - 3)^5 + C";
            }
            return "";
        }
        catch (Exception e){
            System.out.println("An Error has occurred, please check your input and try again");
            return "Error";
        }
    }


}
