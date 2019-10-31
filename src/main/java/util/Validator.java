package util;

public class Validator {
    public boolean isNumber(String str) {
        return str.matches("\\d+");
    }

    public float toFloat(String str) {
        return Float.parseFloat(noTub(str));
    }

    public String noTub(String str) {
        return str.replaceAll("\\s+", "");
    }

    public boolean continueRequest(String answer) {answer = answer.toUpperCase();
        if(answer.equals("Y") || answer.equals("YES"))
            return true;
        else
            return false;
    }
}
