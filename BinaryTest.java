package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary value
     */
    @Test
    public void normalConstructor()
    {
        Binary binary = new Binary("1001001");
        assertTrue(binary.getValue().equals("1001001"));
    }

    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
        Binary binary = new Binary("1001001211");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
        Binary binary = new Binary("1001001A");
        assertTrue(binary.getValue().equals("0"));
    }

    /**
     * Test The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
        Binary binary = new Binary("00001001");
        assertTrue(binary.getValue().equals("1001"));
    }

    /**
     * Test the add function with two binary numbers
     */
    @Test
    public void add()
    {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");
        Binary result = Binary.add(binary1, binary2);
        assertTrue(result.getValue().equals("10110"));
    }

    // ===================== OR FUNCTION TESTS =====================

    /**
     * Test the OR function with two binary numbers of the same length
     */
    @Test
    public void orSameLength()
    {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1110"));
    }

    /**
     * Test the OR function with different length binary numbers
     */
    @Test
    public void orDifferentLength()
    {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("10011");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("10111"));
    }

    /**
     * Test the OR function with zero
     */
    @Test
    public void orWithZero()
    {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1011");
        Binary result = Binary.or(binary1, binary2);
        assertTrue(result.getValue().equals("1011"));
    }

    // ===================== AND FUNCTION TESTS =====================

    /**
     * Test the AND function with two binary numbers of the same length
     */
    @Test
    public void andSameLength()
    {
        Binary binary1 = new Binary("1101");
        Binary binary2 = new Binary("1011");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("1001"));  // Expected output
    }

    /**
     * Test the AND function with different length binary numbers
     */
    @Test
    public void andDifferentLength() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("10"));  // Expected output
    }
    

    /**
     * Test the AND function with zero
     */
    @Test
    public void andWithZero()
    {
        Binary binary1 = new Binary("1011");
        Binary binary2 = new Binary("0");
        Binary result = Binary.and(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }

    // ===================== MULTIPLY FUNCTION TESTS =====================

    /**
     * Test the Multiply function with two binary numbers
     */
    @Test
    public void multiplyRegular()
    {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("11");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("1111"));  // 5 * 3 = 15 -> 1111
    }

    /**
     * Test the Multiply function with zero
     */
    @Test
    public void multiplyWithZero()
    {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("0");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }

    /**
     * Test the Multiply function with one
     */
    @Test
    public void multiplyWithOne()
    {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("1");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("101"));
    }
}
