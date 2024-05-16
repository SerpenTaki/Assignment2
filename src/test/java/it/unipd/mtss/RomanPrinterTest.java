package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

    //test per caratteri che non dovrebbero comparire
    @Test(expected = IllegalArgumentException.class)
    public void characterNotPresentInRomanFormat() {
        RomanPrinter.printAsciiArt("W");
        RomanPrinter.printAsciiArt("lol");
        RomanPrinter.printAsciiArt("b");
        RomanPrinter.printAsciiArt(null);
    }

    //test lettera I
    @Test
    public void TestI() {
        StringBuilder result = new StringBuilder();
            result.append("***\n");
            result.append(" * \n");
            result.append(" * \n");
            result.append(" * \n");
            result.append("***\n");
            result.append("\n");
        String stringa= result.toString(); 
            assertEquals(RomanPrinter.printAsciiArt("I"), stringa);
    }
}