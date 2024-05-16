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

    //primi 6 numeri continuo
    @Test
    public void First6NumbersConversion() {
        assertEquals(IntegerToRoman.convert(4), "IV");
        assertEquals(IntegerToRoman.convert(5), "V");
        assertEquals(IntegerToRoman.convert(6), "VI");
    }

    //primi 9 numeri continuo    
    @Test
    public void First9NumbersConversion() {
        assertEquals(IntegerToRoman.convert(7), "VII");
        assertEquals(IntegerToRoman.convert(8), "VIII");
        assertEquals(IntegerToRoman.convert(9), "IX");
    }

    //Tests fino a 20
    @Test
    public void First20NumbersConversion() {
        assertEquals(IntegerToRoman.convert(12), "XII");
        assertEquals(IntegerToRoman.convert(17), "XVII");
        assertEquals(IntegerToRoman.convert(20), "XX");
    }

    //Tests fino a 50
    @Test
    public void First50NumbersConversion() {
        assertEquals(IntegerToRoman.convert(25), "XXV");
        assertEquals(IntegerToRoman.convert(30), "XXX");
        assertEquals(IntegerToRoman.convert(43), "XLIII");
    }

    //Tests fino a 50
    @Test
    public void First100NumbersConversion() {
        assertEquals(IntegerToRoman.convert(66), "LXVI");
        assertEquals(IntegerToRoman.convert(80), "LXXX");
        assertEquals(IntegerToRoman.convert(99), "XCIX");
    }

    //numeri con una sola lettera fino a 100
    @Test
    public void OneLetterNumbers() {
        assertEquals(IntegerToRoman.convert(10), "X");
        assertEquals(IntegerToRoman.convert(50), "L");
        assertEquals(IntegerToRoman.convert(100), "C");
    }
}
