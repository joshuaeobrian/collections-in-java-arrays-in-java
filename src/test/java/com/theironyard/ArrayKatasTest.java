package com.theironyard;

import net.doughughes.testifier.exception.CannotFindMethodException;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.test.TestifierTest;
import net.doughughes.testifier.util.Invoker;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ArrayKatasTest extends TestifierTest{

    @Test
    public void testFiveRandomInts() {
        /* arrange */

        /* act */
        int[] ints = new int[0];
        try {
            ints = (int[]) Invoker.invokeStatic(ArrayKatas.class, "fiveRandomInts");
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("fiveRandomInts() should return an array with five elements",
                ints.length, equalTo(5));
    }

    @Test
    public void testFiveRandomIntsUsesRandom() {
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("fiveRandomInts");
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("fiveRandomInts() method should use the Random class.",
                source, RegexMatcher.matches("^.*?ObjectCreationExpr ClassOrInterfaceType\\[Random\\].*?$"));
    }

    @Test
    public void testFiveRandomIntsUsesArrayLiteralSynax() {
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("fiveRandomInts");
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("fiveRandomInts() method should use array literal syntax.",
                source, RegexMatcher.matches("^.*?ArrayInitializerExpr.*?$"));
    }

    @Test
    public void testThreeArbitraryDates() {
        /* arrange */

        /* act */
        LocalDate[] dates = new LocalDate[0];
        try {
            dates = (LocalDate[]) Invoker.invokeStatic(ArrayKatas.class, "threeArbitraryDates");
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("threeArbitraryDates() should return an array with three elements",
                dates.length, equalTo(3));
    }

    @Test
    public void testThreeArbitraryDatesDoesNotUseArrayLiteralSynax() {
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("threeArbitraryDates");
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("threeArbitraryDates() method should use not array literal syntax.",
                source, not(RegexMatcher.matches("^.*?ArrayInitializerExpr.*?$")));
    }

    @Test
    public void testNullsToArbitraryStringsWithThreeNullElements(){
        /* arrange */

        /* act */
        String[] result = new String[5];
        try {
            result = (String[]) Invoker.invokeStatic(ArrayKatas.class, "nullsToArbitraryStrings", new Object[]{new String[]{null, "I", null, "sit", null}});
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("First element in array should not be null",
                result[0], notNullValue());
        assertThat("Second element in array should not be unchanged",
                result[1], equalTo("I"));
        assertThat("Third element in array should not be null",
                result[2], notNullValue());
        assertThat("Fourth element in array should not be unchanged",
                result[3], equalTo("sit"));
        assertThat("Fifth element in array should not be null",
                result[4], notNullValue());
    }

    @Test
    public void testNullsToArbitraryStringsWithAllNullElements(){
        /* arrange */

        /* act */
        String[] result = new String[5];
        try {
            result = (String[]) Invoker.invokeStatic(ArrayKatas.class, "nullsToArbitraryStrings", new Object[]{new String[]{null, null, null, null, null}});
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("First element in array should not be null",
                result[0], notNullValue());
        assertThat("Second element in array should not be null",
                result[1], notNullValue());
        assertThat("Third element in array should not be null",
                result[2], notNullValue());
        assertThat("Fourth element in array should not be null",
                result[3], notNullValue());
        assertThat("Fifth element in array should not be null",
                result[4], notNullValue());
    }

    @Test
    public void testArrayIndexesWithFiveElementsValues(){
        /* arrange */

        /* act */
        int[] result = new int[0];
        try {
            result = (int[]) Invoker.invokeStatic(ArrayKatas.class, "arrayIndexes", 5);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("First element in array should not be 0",
                result[0], equalTo(0));
        assertThat("Second element in array should not be 1",
                result[1], equalTo(1));
        assertThat("Third element in array should not be 2",
                result[2], equalTo(2));
        assertThat("Fourth element in array should not be 3",
                result[3], equalTo(3));
        assertThat("Fifth element in array should not be 4",
                result[4], equalTo(4));
    }

    @Test
    public void testArrayIndexesWithFiveElementsLength(){
        /* arrange */

        /* act */
        int[] result = new int[0];
        try {
            result = (int[]) Invoker.invokeStatic(ArrayKatas.class, "arrayIndexes", 5);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("Length of array should be 5",
                result.length, equalTo(5));
    }

    @Test
    public void testArrayIndexesWithZeroElementsLength(){
        /* arrange */

        /* act */
        int[] result = new int[0];
        try {
            result = (int[]) Invoker.invokeStatic(ArrayKatas.class, "arrayIndexes", 0);
        } catch (Throwable e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("Length of array should be 0",
                result.length, equalTo(0));
    }
}