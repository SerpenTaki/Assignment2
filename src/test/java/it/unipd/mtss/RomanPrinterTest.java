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

    @Test
    public void TestV() {
        StringBuilder result = new StringBuilder();
            result.append("*        *\n");
            result.append(" *      * \n");
            result.append("  *    *  \n");
            result.append("   *  *   \n");
            result.append("     *    \n");
            result.append(" \n");
        String stringa= result.toString(); 
            assertEquals(RomanPrinter.printAsciiArt("V"), stringa);
    }

    @Test
    public void TestX() {
        StringBuilder result = new StringBuilder();
            result.append("*    * \n");
            result.append(" *  * \n");
            result.append("  *   \n");
            result.append(" *  * \n");
            result.append("*    *\n");
            result.append(" \n");
        String stringa= result.toString(); 
            assertEquals(RomanPrinter.printAsciiArt("X"), stringa);
    }

    @Test
    public void TestL() {
        StringBuilder result = new StringBuilder();
            result.append("*       \n");
            result.append("*       \n");
            result.append("*       \n");
            result.append("*       \n");
            result.append("* * * * \n");
            result.append(" \n");
        String stringa= result.toString(); 
            assertEquals(RomanPrinter.printAsciiArt("L"), stringa);
    }

    @Test
        public void TestC() {
            StringBuilder result = new StringBuilder();
                result.append("* * * *\n");
                result.append("*      \n");
                result.append("*      \n");
                result.append("*      \n");
                result.append("* * * *\n");
                result.append(" \n");
            String stringa= result.toString(); 
                assertEquals(RomanPrinter.printAsciiArt("C"), stringa);
        }

        @Test
        public void TestD() {
            StringBuilder result = new StringBuilder();
                result.append("* * *   \n");
                result.append("*     * \n");
                result.append("*      *\n");
                result.append("*     * \n");
                result.append("* * *   \n");
                result.append(" \n");
            String stringa= result.toString(); 
                assertEquals(RomanPrinter.printAsciiArt("D"), stringa);
        }
}