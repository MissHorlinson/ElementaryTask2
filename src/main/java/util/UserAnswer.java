package util;

public class UserAnswer {
    public boolean continueRequest(String answer) {answer = answer.toUpperCase();
        if(answer.equals("Y") || answer.equals("YES"))
            return true;
        else
            return false;
    }

}
