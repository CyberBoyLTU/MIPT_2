package com.example.mipt_2;

public class Counter {
    public static int getCharsCount(String text) {
        return text.length();
    }

    public static int getCount(String input, String countBy) {
        int Count = 0;
        boolean word = false;
        int endOfLine = input.length() - 1;

        if (countBy.equals("Words")){
            for (int i = 0; i < input.length(); i++) {
                // if the char is a letter, word = true.
                if (Character.isLetter(input.charAt(i)) && i != endOfLine) {
                    word = true;
                    // if char isn't a letter and there have been letters before,
                    // counter goes up.
                } else if (!Character.isLetter(input.charAt(i)) && word) {
                    Count++;
                    word = false;
                    // last word of String; if it doesn't end with a non letter, it
                    // wouldn't count without this.
                } else if (Character.isLetter(input.charAt(i)) && i == endOfLine) {
                    Count++;
                }
            }
        }
        else{
            for (int i = 0; i < input.length(); i++) {
                if (input.substring(i, i+1).matches("[^A-Za-z0-9]")) {
                    Count++;
                }

            }
        }

        return Count;
    }
}
