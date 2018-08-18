/**
 * The new "Avengers" movie has just been released!
 * There are a lot of people at the cinema box office standing in a huge line.
 * Each of them has a single 100, 50 or 25 dollars bill.
 * An "Avengers" ticket costs 25 dollars.
 *
 * Vasya is currently working as a clerk. He wants to sell a ticket
 * to every single person in this line.
 *
 * Can Vasya sell a ticket to each person and give the change if he
 * initially has no money and sells the tickets strictly in the order
 * people follow in the line?
 *
 * Return YES, if Vasya can sell a ticket to each person and give
 * the change with the bills he has at hand at that moment.
 * Otherwise return NO.
 */

package vasyaClerk;

public class Line {

    public static String Tickets(int[] peopleInLine) {

        int value25 = 0;
        int value50 = 0;
        int value100 = 0;

        for (int i = 0; i < peopleInLine.length; i++) {
            switch(peopleInLine[i]){
                case 25:
                    value25++;
                    break;
                case 50:
                    if (value25 > 0){
                        value25--;
                        value50++;
                    }
                    else {
                        return "NO";
                    }
                    break;
                case 100:
                    if (value50 >= 1 && value25 >= 1) {
                        value100++;
                        value25--;
                        value50--;
                    }
                    else if (value25 >= 3) {
                        value100++;
                        value25 = value25 - 3;
                    } else {
                        return "NO";
                    }
            }
        }

        return "YES";
    }
}
