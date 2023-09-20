/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND;

/**
 *
 * @author Kyra Balliram
 */
public class EntryValidator {

    public boolean checkForLetters(String str) {
        boolean check = true;
        char currentCh = 'a';

        for (int i = 0; i < str.length(); i++) {
            currentCh = str.charAt(i);

            if (!Character.isLetter(currentCh)) {
                check = false;
            }
        }
        return check;
    }

    public boolean PresenceCheck(String str) {
        boolean check = true;
        if (str.isBlank()) {
            check = false;
        }
        return check;
    }

    //checks if values are numbers
    public boolean checkForDigits(String str) {
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                check = false;
            }
        }
        return check;
    }

}
