
import java.util.ArrayList;
import java.util.regex.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class MyUtilities implements IUtilities {

    @Override
    public int checkIntegerNumber(String value, int min, int max) {
        if (!value.matches("\\d{2,10}")) {
            return value.length();
        }
        try {
            int number = Integer.parseInt(value);
            if (number >= min && number <= max) {
                return number;
            }
        } catch (NumberFormatException e) {

        }
        return value.length();
    }

    @Override
    public String removeDuplicatedWords(String value) {
        String[] arr = value.trim().split("\\s+");
        String result = "";
        ArrayList<String> list = new ArrayList<>();
        for (String word : arr) {
            String lowerWord = word.toLowerCase();
            if (!list.contains(lowerWord)) {
                list.add(lowerWord);
                String newWord = lowerWord.substring(0, 1).toUpperCase()
                        + lowerWord.substring(1);
                result += newWord + " ";
            }
        }
        return result.trim();
    }

    @Override
    public int checkFormatString(String value) {
        Pattern pattern = Pattern.compile("^([A-Z]{3})\\.(\\d{6})\\.([@#$])$");
        Matcher matcher = pattern.matcher(value);
        if (matcher.matches()) {
            return Integer.parseInt(matcher.group(2));
        }
        return value.length();
    }

    @Override
    public double sumNumber(String value) {
        Matcher matcher = Pattern.compile("\\d+(\\.\\d+)?").matcher(value);
        double sum = 0.0;
        while (matcher.find()) {
            sum += Double.parseDouble(matcher.group());
        }
        return sum;
    }

}
