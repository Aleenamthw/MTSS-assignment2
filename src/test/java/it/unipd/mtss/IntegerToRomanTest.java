////////////////////////////////////////////////////////////////////
// SARA STEFANI 2077673
// ALEENA MATHEW 2068242
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert1() throws Exception {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvert4() throws Exception {
        assertEquals("IV", IntegerToRoman.convert(4));

    }

    @Test
    public void testConvert5() throws Exception {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvert6() throws Exception {
        assertEquals("VI", IntegerToRoman.convert(6));

    }

    @Test
    public void testConvert9() throws Exception {
        assertEquals("IX", IntegerToRoman.convert(9));

    }

    @Test
    public void testConvert10() throws Exception {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvert11() throws Exception {
        assertEquals("XI", IntegerToRoman.convert(11));
    }

    @Test
    public void testConvert14() throws Exception {
        assertEquals("XIV", IntegerToRoman.convert(14));
    }

    @Test
    public void testConvert15() throws Exception {
        assertEquals("XV", IntegerToRoman.convert(15));

    }

    @Test
    public void testConvert19() throws Exception {
        assertEquals("XIX", IntegerToRoman.convert(19));
    }

    @Test
    public void testConvert20() throws Exception {
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testConvert50() throws Exception {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvert100() throws Exception {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvert500() throws Exception {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvert1000() throws Exception {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    public void testConvert999() throws Exception {
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
    }

    @Test
    public void testConvert40() throws Exception {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void testConvert900() throws Exception {
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    public void testConvert39() throws Exception {
        assertEquals("XXXIX", IntegerToRoman.convert(39));
    }

    @Test
    public void testConvert499() throws Exception {
        assertEquals("CDXCIX", IntegerToRoman.convert(499));
    }

    @Test
    public void testConvert3() throws Exception {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvert8() throws Exception {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void testConvert12() throws Exception {
        assertEquals("XII", IntegerToRoman.convert(12));
    }

    @Test(expected = java.lang.Exception.class)
    public void convertZero() throws Exception {
        IntegerToRoman.convert(0);
    }

    @Test(expected = java.lang.Exception.class)
    public void convertBelowZero() throws Exception {
        IntegerToRoman.convert(-1);
    }

}
