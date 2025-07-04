/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Inputter {

    public static Scanner sc = new Scanner(System.in);

    public static String inputString(String msg) {
        System.out.println(msg);
        return sc.nextLine().trim();
    }

    public static int inputInt(String msg, int min, int max) {
        int value;
        do {
            try {
                System.out.println(msg);
                value = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                value = Integer.MIN_VALUE;
            }
        } while (value < min || value > max);
        return value;
    }

    public static String inputNonBlankStr(String msg) {
        String nonBlankData;
        do {
            nonBlankData = inputString(msg);
        } while (nonBlankData.length() == 0);
        return nonBlankData;
    }

    public static String inputPattern(String msg, String pattern) {
        String patternData;
        do {
            patternData = inputString(msg);
        } while (!patternData.matches(pattern));
        return patternData;
    }
}
