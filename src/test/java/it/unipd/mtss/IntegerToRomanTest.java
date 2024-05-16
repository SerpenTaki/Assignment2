package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {
    //test dei numeri fuori dal range, oltre mille, zero o sotto 1
    @Test(expected = IllegalArgumentException.class)
        public void overRangeThrowsIllegalArgumentException() {
            IntegerToRoman.convert(1111);
        }
    @Test(expected = IllegalArgumentException.class)
        public void underRangeThrowsIllegalArgumentException() {
            IntegerToRoman.convert(0);
        }
    @Test(expected = IllegalArgumentException.class)
        public void underZeroThrowsIllegalArgumentException() {
            IntegerToRoman.convert(-1);
        }

    //test primi 3 numeri
    @Test
    public void First3NumbersConversion() {
        assertEquals(IntegerToRoman.convert(1), "I");
        assertEquals(IntegerToRoman.convert(2), "II");
        assertEquals(IntegerToRoman.convert(3), "III");
    }
}