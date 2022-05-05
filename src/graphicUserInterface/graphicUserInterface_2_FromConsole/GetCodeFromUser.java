package graphicUserInterface.graphicUserInterface_2_FromConsole;

import java.util.Scanner;

public class GetCodeFromUser {
    Scanner scanner;

    private void openScanner() {
        scanner = new Scanner(System.in);
    }

    private void closeScanner() {
        scanner.close();
    }

    private boolean checkString(String string) {
        Character zero = '0';
        Character one  =  '1';

        if (string.length() !=10) {
            return false;
        }

        for (int i = 0; i < string.length(); i++) {
            if (zero == string.charAt(i) || one == string.charAt(i)) {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public String getStringFromUser() {
        openScanner();
        System.out.println("Enter code (10 characters, only 0 and 1)");
        String str = scanner.next();
        if (checkString(str)) {
            closeScanner();
            System.out.println("Code has been written succesfully");
            System.out.printf("You entered: %s",str);
            return str;
        }
        else {
            closeScanner();
            System.out.println("Code is WRONG!");
            return null;
        }
    }

}
