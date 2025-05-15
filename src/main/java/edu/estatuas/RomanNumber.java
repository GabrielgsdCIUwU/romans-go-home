package edu.estatuas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {

    private final String romanNumber;
    private static final String regex = "(C(?=[DM])|X(?=[LC])|I(?=[VX]))";

    private final Pattern minusPattern = Pattern.compile(regex);
    private final Pattern plusPattern = Pattern.compile("([M|D|C|L|X|V|I])");

    public RomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    private String getRomanNumber() {
        return romanNumber;
    }

    private Short allValues() {
        Short value = 0;
        Matcher matcher = plusPattern.matcher(getRomanNumber());
        while (matcher.find()) {
            value = (short) (value + RomanNumbersValue.valueOf(matcher.group()).getValue());
        }

        return value;
    }

    public short toDecimal() {
        Short value = 0;
        Matcher matcher = minusPattern.matcher(getRomanNumber());
        while (matcher.find()) {
            value = (short) (value + RomanNumbersValue.valueOf(matcher.group()).getValue() * 2);
        }
        return (short) (allValues() - value);
    }

}
