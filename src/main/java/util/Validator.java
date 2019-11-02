package util;

public class Validator {

    public boolean isValid(String str) {
        if (isNumber(str)) {
            if (getFloat(str) <= 0) {
                return false;
            } else
                return true;
        } else {
            return false;
        }
    }

    public boolean isNumber(String str) {
        return noTub(str).matches("\\d+");
    }

    public float getFloat(String str) {
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
