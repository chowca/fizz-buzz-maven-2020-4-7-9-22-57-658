package com.oocl;

public class FizzBuzz {
    public String say(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        return result.equals("") ? String.valueOf(number) : result;
    }

    public String playGame(int start, int end) {
        String result = "";
        for (int playerNum = start; playerNum <= end; playerNum++) {
            result += say(playerNum) + "\n";
        }
        return result;
    }

}
