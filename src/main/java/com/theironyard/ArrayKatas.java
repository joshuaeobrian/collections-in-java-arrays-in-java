package com.theironyard;

/**
 * This is another kata exercise. Follow the instructions below and implement
 * the methods as described.
 */
public class ArrayKatas {

    /**
     * Using array literal syntax and the Random class, create a static method
     * named fiveRandomInts() that accepts no arguments and returns a new array
     * containing five random integers.
     *
     * EG: [366316239, 1012739128, 1516029826, -1290176332, 1661141950]
     *
     * Note that the return type for an array of ints would be `int[]`.
     *
     * @return an array of five random ints
     */
    // todo: create fiveRandomInts() static method

    /**
     * Create a static method named threeArbitraryDates() that returns an array
     * of three LocalDate objects. Do not use array literal syntax in this
     * method.
     *
     * @return an array of three LocalDate objects
     */
    // todo: create threeArbitraryDates() method

    /**
     * Create a static method named nullsToArbitraryStrings() that accepts an
     * array if String objects. This array will always have five elements. The
     * method should set any null values in the provided array to any arbitrary
     * String. For example, if you receive this array:
     *
     * ["I", null, "food", "cat", null]
     *
     * Then a valid return value would be:
     *
     * ["I", "car", "food", "cat", "elephant"]
     *
     * Any existing String values in the array should be left unchanged.
     *
     * This method should return a string array with five elements, where any
     * null elements have been replaced with arbitrary strings.
     *
     * Note that you do not need to set the size of the array in the argument.
     *
     * @param source an array of five Strings, some of which are null.
     * @return an array of five string where null values have been replaced with arbitrary strings
     */
    // todo: create nullsToArbitraryStrings() method

    /**
     * Create a static method named arrayIndexes() that accepts a single integer
     * argument, n. The method should create a new array of integers of this
     * length. For example, if n is 5, an array of five ints should be created.
     *
     * The array's values should be set to their index. So, an array of five
     * ints should be: [0, 1, 2, 3, 4]
     *
     * @param n The length of the array to create
     * @return An array of ints, starting at 0 and continuing to n-1
     */
    // todo: create arrayIndexes() method

}
