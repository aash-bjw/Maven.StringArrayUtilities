package com.zipcodewilmington;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean flag = false;
        for (String string : array) {
            if (value.equals(string)) {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] outcome = new String[array.length];
        int counter = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            outcome[counter] = array[i];
            counter++;
        }
        return outcome;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }
        }

        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] result = new String[array.length - getNumberOfOccurrences(array, valueToRemove)];
        int counter = 0;
        for (String string : array) {
            if (!valueToRemove.equals(string)) {
                result[counter] = string;
                counter++;
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                stringList.add(array[i]);
            }
        }
        return stringList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                String s = buildDuplicatesIntoSting(array, i);
                stringList.add(s);
                //skip index
            }

            //else statement

        }
            return stringList.toArray(new String[0]);
    }

        public static String buildDuplicatesIntoSting(String[] array, int x) {
            StringBuilder sb = new StringBuilder();
            sb.append(array[x]);
            for (int i = x+1; i < array.length - 1; i++) {
                if (array[i].equals(array[i - 1])) {
                sb.append(array[x]);
                }
                else{
                    break;
                }
            }
            return sb.toString();
        }

}
